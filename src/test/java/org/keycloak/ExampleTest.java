package org.keycloak;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ExampleTest {

    static final KubernetesClient client = new DefaultKubernetesClient();
    static final String namespace = "kc-proxy-" + UUID.randomUUID();
    static final Namespace nsResource = new NamespaceBuilder().withNewMetadata().withName(namespace).endMetadata().build();

    @BeforeAll
    static void beforeAll() {
        client.namespaces().createOrReplace(nsResource);
    }

    @BeforeEach
    void beforeEach() {
        client.load(this.getClass().getResourceAsStream("/infrastructure.yml")).inNamespace(namespace).createOrReplace();
    }

//    @AfterAll
//    static void afterAll() {
//        client.namespaces().delete(nsResource);
//    }

//    @AfterEach
//    void afterEach() {
//        client.load(this.getClass().getResourceAsStream("/infrastructure.yml")).inNamespace(namespace).delete();
//    }

    @Test
    void test() {
        var deployment = client.apps().deployments().load(this.getClass().getResourceAsStream("/deployment.yml")).get();

        var container = deployment.getSpec().getTemplate().getSpec().getContainers().get(0);
        container.setArgs(List.of("start-dev"));

        client.apps().deployments().inNamespace(namespace).createOrReplace(deployment);
        System.out.println("Ciao mondo! " + deployment.getMetadata().getName());

        var keycloakPod = client
                .pods()
                .inNamespace(namespace)
                .withLabels(Map.of("app", "proxy-test-keycloak"))
                .list()
                .getItems()
                .get(0);

        client
                .pods()
                .inNamespace(namespace)
                .withName(keycloakPod.getMetadata().getName())
                .portForward(8080, 8080);

        client
                .pods()
                .inNamespace(namespace)
                .withName(keycloakPod.getMetadata().getName())
                .portForward(8443, 8443);
    }
}

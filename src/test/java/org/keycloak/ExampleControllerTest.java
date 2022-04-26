package org.keycloak;

import io.javaoperatorsdk.operator.junit.AbstractOperatorExtension;
import io.javaoperatorsdk.operator.junit.OperatorExtension;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

@QuarkusTest
public class ExampleControllerTest {

    @RegisterExtension
    AbstractOperatorExtension operator = OperatorExtension.builder()
            .waitForNamespaceDeletion(true)
            .withReconciler(new ExampleReconciler())
            .build();

    @Test
    void test() {
        operator
                .getKubernetesClient()
                .resources(Example.class)
                .inNamespace(operator.getNamespace())
                .createOrReplace(new Example());
    }
}

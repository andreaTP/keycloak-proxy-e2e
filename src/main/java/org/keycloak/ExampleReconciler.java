package org.keycloak;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.quarkus.logging.Log;

import javax.inject.Inject;

import static io.javaoperatorsdk.operator.api.reconciler.Constants.NO_FINALIZER;
import static io.javaoperatorsdk.operator.api.reconciler.Constants.WATCH_CURRENT_NAMESPACE;

@ControllerConfiguration(namespaces = WATCH_CURRENT_NAMESPACE, finalizerName = NO_FINALIZER)
public class ExampleReconciler implements Reconciler<Example> {

    @Inject
    KubernetesClient client;

    @Override
    public UpdateControl<Example> reconcile(Example example, Context context) {
        client.pods().list();
        Log.info("Reconciliation loop for: " + example.getMetadata().getName() + " in namespace " + example.getMetadata().getNamespace());
        return null;
    }
}

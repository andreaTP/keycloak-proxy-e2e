
Reproduction:

Start e.g. `minikube` in background and:

`mvn clean test`

Error:
```
[INFO] Running org.keycloak.ExampleControllerTest
2022-04-26 17:42:07,774 INFO  [org.jbo.threads] (main) JBoss Threads version 3.4.2.Final
2022-04-26 17:42:08,519 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17) Registered 'org.keycloak.Example' for reflection
2022-04-26 17:42:08,521 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17) Registered 'java.lang.Void' for reflection
2022-04-26 17:42:08,521 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17) Registered 'java.lang.Void' for reflection
2022-04-26 17:42:08,613 WARN  [io.fab.crd.gen.CustomResourceInfo] (build-17) Cannot reliably determine status types for org.keycloak.Example because it isn't parameterized with only spec and status types. Status replicas detection will be deactivated.
2022-04-26 17:42:08,619 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17) Processed 'org.keycloak.ExampleReconciler' reconciler named 'examplereconciler' for 'examples.org.example' resource (version 'org.example/v1alpha1')
2022-04-26 17:42:08,623 INFO  [io.fab.crd.gen.CRDGenerator] (build-17) Generating 'examples.org.example' version 'v1alpha1' with org.keycloak.Example (spec: undetermined / status undetermined)...
2022-04-26 17:42:08,802 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17) Generated examples.org.example CRD:
2022-04-26 17:42:08,802 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-17)   - v1 -> /Users/aperuffo/workspace/check-junit-extension/target/kubernetes/examples.org.example-v1.yml
2022-04-26 17:42:10,534 INFO  [io.jav.ope.Operator] (main) Registered reconciler: 'examplereconciler' for resource: 'class org.keycloak.Example' for namespace(s): [default]
2022-04-26 17:42:10,535 INFO  [io.qua.ope.run.AppEventListener] (main) Quarkus Java Operator SDK extension 3.0.7 (commit: 22fed83 on branch: 22fed8391b7b153616bd79c5f829cdd8a7edd5bd) built on Thu Apr 07 15:13:21 WEST 2022
2022-04-26 17:42:10,535 WARN  [io.qua.ope.run.AppEventListener] (main) Operator was configured not to start automatically, call the start method to start it.
2022-04-26 17:42:10,674 INFO  [io.quarkus] (main) Quarkus 2.7.5.Final on JVM started in 3.641s. Listening on: http://localhost:8081
2022-04-26 17:42:10,674 INFO  [io.quarkus] (main) Profile test activated. 
2022-04-26 17:42:10,674 INFO  [io.quarkus] (main) Installed features: [cdi, kubernetes, kubernetes-client, openshift-client, operator-sdk, smallrye-context-propagation, smallrye-health, vertx]
2022-04-26 17:42:11,480 INFO  [io.jav.ope.jun.AbstractOperatorExtension] (main) Initializing integration test in namespace examplecontrollertest-test-53a33ba3-77bd-4bb5-8c92-533e2bc90908
2022-04-26 17:42:11,803 WARN  [Default ConfigurationService implementation] (main) Configuration for reconciler 'examplereconciler' was not found. Known reconcilers: None.
2022-04-26 17:42:11,805 INFO  [io.jav.ope.jun.AbstractOperatorExtension] (main) Deleting namespace examplecontrollertest-test-53a33ba3-77bd-4bb5-8c92-533e2bc90908 and stopping operator
2022-04-26 17:42:11,869 INFO  [io.jav.ope.jun.AbstractOperatorExtension] (main) Waiting for namespace examplecontrollertest-test-53a33ba3-77bd-4bb5-8c92-533e2bc90908 to be deleted
2022-04-26 17:42:17,222 INFO  [io.jav.ope.Operator] (main) Operator SDK unknown is shutting down...
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 12.842 s <<< FAILURE! - in org.keycloak.ExampleControllerTest
[ERROR] org.keycloak.ExampleControllerTest.test  Time elapsed: 5.757 s  <<< ERROR!
java.lang.NullPointerException

2022-04-26 17:42:17,258 INFO  [io.qua.ope.run.AppEventListener] (main) Quarkus Java Operator SDK extension is shutting down
2022-04-26 17:42:17,271 INFO  [io.qua.it.ope.cli.run.OpenShiftClientProducer] (main) Closing OpenShift client
2022-04-26 17:42:17,271 INFO  [io.jav.ope.Operator] (main) Operator SDK 2.1.4 is shutting down...
2022-04-26 17:42:17,288 INFO  [io.quarkus] (main) Quarkus stopped in 0.045s
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   ExampleControllerTest.test » NullPointer
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```


Early issues with workarounds:
Error:
```
[INFO] Running org.keycloak.ExampleControllerTest
2022-04-26 17:36:38,707 INFO  [org.jbo.threads] (main) JBoss Threads version 3.4.2.Final
2022-04-26 17:36:39,293 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13) Registered 'org.keycloak.Example' for reflection
2022-04-26 17:36:39,294 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13) Registered 'java.lang.Void' for reflection
2022-04-26 17:36:39,294 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13) Registered 'java.lang.Void' for reflection
2022-04-26 17:36:39,376 WARN  [io.fab.crd.gen.CustomResourceInfo] (build-13) Cannot reliably determine status types for org.keycloak.Example because it isn't parameterized with only spec and status types. Status replicas detection will be deactivated.
2022-04-26 17:36:39,383 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13) Processed 'org.keycloak.ExampleReconciler' reconciler named 'examplereconciler' for 'examples.org.example' resource (version 'org.example/v1alpha1')
2022-04-26 17:36:39,387 INFO  [io.fab.crd.gen.CRDGenerator] (build-13) Generating 'examples.org.example' version 'v1alpha1' with org.keycloak.Example (spec: undetermined / status undetermined)...
2022-04-26 17:36:39,532 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13) Generated examples.org.example CRD:
2022-04-26 17:36:39,532 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-13)   - v1 -> /Users/aperuffo/workspace/check-junit-extension/target/kubernetes/examples.org.example-v1.yml
2022-04-26 17:36:41,177 INFO  [io.jav.ope.Operator] (main) Registered reconciler: 'examplereconciler' for resource: 'class org.keycloak.Example' for namespace(s): [default]
2022-04-26 17:36:41,177 INFO  [io.qua.ope.run.AppEventListener] (main) Quarkus Java Operator SDK extension 3.0.7 (commit: 22fed83 on branch: 22fed8391b7b153616bd79c5f829cdd8a7edd5bd) built on Thu Apr 07 15:13:21 WEST 2022
2022-04-26 17:36:41,177 INFO  [io.jav.ope.Operator] (main) Operator SDK 2.1.4 (commit: 5af3fec) built on Thu Apr 07 09:31:06 WEST 2022 starting...
2022-04-26 17:36:41,178 INFO  [io.jav.ope.Operator] (main) Client version: 5.12.1
2022-04-26 17:36:41,364 ERROR [io.jav.ope.Operator] (main) Error starting operator: io.javaoperatorsdk.operator.MissingCRDException: 'examples.org.example' v1 CRD was not found on the cluster, controller 'examplereconciler' cannot be registered
        at io.javaoperatorsdk.operator.processing.Controller.throwMissingCRDException(Controller.java:221)
        at io.javaoperatorsdk.operator.processing.Controller.start(Controller.java:199)
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        at java.base/java.util.HashMap$ValueSpliterator.forEachRemaining(HashMap.java:1693)
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
        at java.base/java.util.stream.ForEachOps$ForEachTask.compute(ForEachOps.java:290)
        at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:746)
        at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:290)
        at java.base/java.util.concurrent.ForkJoinTask.doInvoke(ForkJoinTask.java:408)
        at java.base/java.util.concurrent.ForkJoinTask.invoke(ForkJoinTask.java:736)
        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateParallel(ForEachOps.java:159)
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateParallel(ForEachOps.java:173)
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:233)
        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:661)
        at io.javaoperatorsdk.operator.Operator$ControllerManager.start(Operator.java:170)
        at io.javaoperatorsdk.operator.Operator.start(Operator.java:83)
        at io.quarkiverse.operatorsdk.runtime.AppEventListener.onStartup(AppEventListener.java:33)
        at io.quarkiverse.operatorsdk.runtime.AppEventListener_Observer_onStartup_9c5d3dd7eff7dbe02976f59f48aec5b70eb9c99f.notify(Unknown Source)
        at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:320)
        at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:302)
        at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:73)
        at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:128)
        at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:97)
        at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
        at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
        at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
        at io.quarkus.runtime.Application.start(Application.java:101)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.runner.bootstrap.StartupActionImpl.run(StartupActionImpl.java:237)
        at io.quarkus.test.junit.QuarkusTestExtension.doJavaStart(QuarkusTestExtension.java:249)
        at io.quarkus.test.junit.QuarkusTestExtension.ensureStarted(QuarkusTestExtension.java:608)
        at io.quarkus.test.junit.QuarkusTestExtension.beforeAll(QuarkusTestExtension.java:646)
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeBeforeAllCallbacks$10(ClassBasedTestDescriptor.java:381)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeBeforeAllCallbacks(ClassBasedTestDescriptor.java:381)
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.before(ClassBasedTestDescriptor.java:205)
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.before(ClassBasedTestDescriptor.java:80)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:148)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:188)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:154)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:128)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:428)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:562)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:548)

2022-04-26 17:36:41,367 INFO  [io.jav.ope.Operator] (main) Operator SDK 2.1.4 is shutting down...
2022-04-26 17:36:41,383 INFO  [io.qua.it.ope.cli.run.OpenShiftClientProducer] (main) Closing OpenShift client
2022-04-26 17:36:41,383 INFO  [io.jav.ope.Operator] (main) Operator SDK 2.1.4 is shutting down...
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 6.027 s <<< FAILURE! - in org.keycloak.ExampleControllerTest
[ERROR] org.keycloak.ExampleControllerTest.test  Time elapsed: 0.004 s  <<< ERROR!
java.lang.RuntimeException: java.lang.RuntimeException: Failed to start quarkus
Caused by: java.lang.RuntimeException: Failed to start quarkus
Caused by: io.javaoperatorsdk.operator.MissingCRDException: 'examples.org.example' v1 CRD was not found on the cluster, controller 'examplereconciler' cannot be registered
```

Workaround: `quarkus.operator-sdk.start-operator=false`

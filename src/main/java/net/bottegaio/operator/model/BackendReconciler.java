package net.bottegaio.operator.model;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration
public class BackendReconciler implements Reconciler<Backend> {// , ErrorStatusHandler<Backend>, Cleaner<Backend>,
																// EventSourceInitializer<Backend> {

	private final KubernetesClient client;

	public BackendReconciler(final KubernetesClient client) {
		this.client = client;
	}

	@Override
	public UpdateControl<Backend> reconcile(final Backend resource, final Context<Backend> context) throws Exception {
		// TODO Auto-generated method stub
		return UpdateControl.noUpdate();
	}

}

package net.bottegaio.operator.model;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration
public class WebappReconciler implements Reconciler<Webapp> {// , ErrorStatusHandler<Webapp>, Cleaner<Webapp>,
																// EventSourceInitializer<Webapp> {

	private final KubernetesClient client;

	public WebappReconciler(final KubernetesClient client) {
		this.client = client;
	}

	@Override
	public UpdateControl<Webapp> reconcile(final Webapp resource, final Context<Webapp> context) throws Exception {
		// TODO Auto-generated method stub
		return UpdateControl.noUpdate();
	}

}

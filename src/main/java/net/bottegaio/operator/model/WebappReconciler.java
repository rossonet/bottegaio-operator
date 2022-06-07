package net.bottegaio.operator.model;

import java.util.logging.Logger;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Cleaner;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.DeleteControl;
import io.javaoperatorsdk.operator.api.reconciler.ErrorStatusHandler;
import io.javaoperatorsdk.operator.api.reconciler.ErrorStatusUpdateControl;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration
public class WebappReconciler implements Reconciler<Webapp>, ErrorStatusHandler<Webapp>, Cleaner<Webapp> {
	private static final Logger logger = Logger.getLogger(WebappReconciler.class.getName());
	private final KubernetesClient client;

	public WebappReconciler(final KubernetesClient client) {
		this.client = client;
	}

	@Override
	public DeleteControl cleanup(final Webapp resource, final Context<Webapp> context) {
		// TODO Auto-generated method stub
		logger.info("cleanup Webapp " + resource + " -> " + context);
		return DeleteControl.defaultDelete();
	}

	@Override
	public UpdateControl<Webapp> reconcile(final Webapp resource, final Context<Webapp> context) throws Exception {
		// TODO Auto-generated method stub
		logger.info("reconcile Webapp " + resource + " -> " + context);
		return UpdateControl.noUpdate();
	}

	@Override
	public ErrorStatusUpdateControl<Webapp> updateErrorStatus(final Webapp resource, final Context<Webapp> context,
			final Exception e) {
		// TODO Auto-generated method stub
		logger.info("updateErrorStatus Webapp " + resource + " -> " + context);
		return ErrorStatusUpdateControl.noStatusUpdate();
	}

}

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
public class BackendReconciler implements Reconciler<Backend>, ErrorStatusHandler<Backend>, Cleaner<Backend> {
	private static final Logger logger = Logger.getLogger(BackendReconciler.class.getName());
	private final KubernetesClient client;

	public BackendReconciler(final KubernetesClient client) {
		this.client = client;
	}

	@Override
	public DeleteControl cleanup(final Backend resource, final Context<Backend> context) {
		// TODO Auto-generated method stub
		logger.info("cleanup Backend " + resource + " -> " + context);
		return DeleteControl.defaultDelete();
	}

	@Override
	public UpdateControl<Backend> reconcile(final Backend resource, final Context<Backend> context) throws Exception {
		// TODO Auto-generated method stub
		logger.info("reconcile Backend " + resource + " -> " + context);
		return UpdateControl.noUpdate();
	}

	@Override
	public ErrorStatusUpdateControl<Backend> updateErrorStatus(final Backend resource, final Context<Backend> context,
			final Exception e) {
		// TODO Auto-generated method stub
		logger.info("updateErrorStatus Backend " + resource + " -> " + context);
		return ErrorStatusUpdateControl.noStatusUpdate();
	}

}

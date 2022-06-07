package net.bottegaio.operator.model;

import java.util.Map;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Cleaner;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.DeleteControl;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceContext;
import io.javaoperatorsdk.operator.api.reconciler.EventSourceInitializer;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;

public class BackendReconciler implements Reconciler<Backend>, Cleaner<Backend>, EventSourceInitializer<Backend> {

	public BackendReconciler(final KubernetesClient client) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DeleteControl cleanup(final Backend resource, final Context<Backend> context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, EventSource> prepareEventSources(final EventSourceContext<Backend> context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateControl<Backend> reconcile(final Backend resource, final Context<Backend> context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

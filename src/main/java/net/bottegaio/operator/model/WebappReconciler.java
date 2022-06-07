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

public class WebappReconciler implements Reconciler<Webapp>, Cleaner<Webapp>, EventSourceInitializer<Webapp> {

	public WebappReconciler(final KubernetesClient client) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DeleteControl cleanup(final Webapp resource, final Context<Webapp> context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, EventSource> prepareEventSources(final EventSourceContext<Webapp> context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateControl<Webapp> reconcile(final Webapp resource, final Context<Webapp> context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

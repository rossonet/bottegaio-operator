package net.bottegaio.operator;

import java.io.IOException;
import java.util.logging.Logger;

import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.Operator;
import net.bottegaio.operator.model.BackendReconciler;
import net.bottegaio.operator.model.WebappReconciler;

public class BottegaioOperator {

	private static final Logger logger = Logger.getLogger(BottegaioOperator.class.getName());

	public static void main(final String[] args) throws IOException {
		logger.info("operator started");
		System.out.println("Hello!");
		final Config config = new ConfigBuilder().withNamespace(null).build();
		final KubernetesClient client = new DefaultKubernetesClient(config);
		final Operator operator = new Operator(client);
		operator.register(new BackendReconciler(client));
		operator.register(new WebappReconciler(client));
		operator.installShutdownHook();
		operator.start();
		new FtBasic(new TkFork(new FkRegex("/health", "ALL GOOD.")), 8080).start(Exit.NEVER);
	}

}

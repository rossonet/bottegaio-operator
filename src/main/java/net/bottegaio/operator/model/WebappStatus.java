package net.bottegaio.operator.model;

public class WebappStatus {

	private Integer readyReplicas = 0;

	public Integer getReadyReplicas() {
		return readyReplicas;
	}

	public void setReadyReplicas(final Integer readyReplicas) {
		this.readyReplicas = readyReplicas;
	}

}

# Bottegaio by Rossonet

## Operator Kubernetes.

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/rossonet/bottegaio-operator)
[![Test on master branch with Gradle](https://github.com/rossonet/bottegaio-operator/actions/workflows/test-on-master-with-gradle.yml/badge.svg)](https://github.com/rossonet/bottegaio-operator/actions/workflows/test-on-master-with-gradle.yml)
[![Build and publish docker image to DockerHub](https://github.com/rossonet/bottegaio-operator/actions/workflows/publish-to-dockerhub.yml/badge.svg)](https://github.com/rossonet/bottegaio-operator/actions/workflows/publish-to-dockerhub.yml)
[![Build and publish docker image to GitHub Registry](https://github.com/rossonet/bottegaio-operator/actions/workflows/publish-to-github-registry.yml/badge.svg)](https://github.com/rossonet/bottegaio-operator/actions/workflows/publish-to-github-registry.yml)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/54bb856923194f7f914dd145410e5fe6)](https://www.codacy.com/gh/rossonet/bottegaio-operator/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=rossonet/bottegaio-operator&amp;utm_campaign=Badge_Grade)

Si tratta di un operator Kubernetes per la gestione del backend (con funzione autoscaler), dei Gateway SSH e OpenVPN per la gestione remota e del gateway Opc UA [ar4k-beacon](https://github.com/rossonet/ar4k-beacon) per la gestione della telemetria e degli RPC remoti. Espone anche l'interfaccia web per la pubblicazione dei repository RPM e Debian, dei file statici e del registry Docker.

![alt text](https://raw.githubusercontent.com/rossonet/bottegaio-operator/master/artwork/rudder.png "Bottegaio Operator logo")

### Installazione su Kubernetes

```
kubectl apply -f https://raw.githubusercontent.com/rossonet/kettle-operator/main/kubernetes/operator.yaml
```

## Rossonet

![alt text](https://app.rossonet.net/wp-content/uploads/2021/10/rossonet-logo_280_115.png "Rossonet")

[https://www.rossonet.net](https://www.rossonet.net)

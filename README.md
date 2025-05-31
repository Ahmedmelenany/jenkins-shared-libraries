# jenkins-shared-libraries

# Shared Groovy Libraries - README

This repository contains a collection of Groovy scripts designed to automate and streamline various DevOps and CI/CD pipeline tasks. Below is a brief description of each script:

---

### 1. **BuildandPushDockerimage.groovy**

Builds a Docker image from a Dockerfile and pushes it to a Docker registry (Docker Hub).

### 2. **buildImage.groovy**

Builds a Docker image from a specified context and Dockerfile.

### 3. **buildJar.groovy**

Compiles Java source code and packages it into a `.jar` file.

### 4. **buildMvnApp.groovy**

Builds a Maven-based Java application by running `mvn clean install`.

### 5. **deleteLocalDockerImage.groovy**

Removes a specified Docker image from the local Docker environment.

### 6. **deployToK8s.groovy**

Deploys application manifests to a Kubernetes cluster using `kubectl`.

### 7. **pushImage.groovy**

Pushes a pre-built Docker image to a container registry.

### 8. **pushKubernetesManifests.groovy**

Applies Kubernetes manifests to a cluster, typically for deploying or updating applications.

### 9. **removeImageLocally.groovy**

Removes Docker images from the local machine to free up space (alias of `deleteLocalDockerImage.groovy`).

### 10. **runJavaUnitTests.groovy**

Executes unit tests in a Java project using Maven or Gradle.

### 11. **slackNotifications.groovy**

Sends pipeline status notifications (e.g., success, failure) to a Slack channel.

### 12. **sonarQubeAnalysis.groovy**

Runs SonarQube code quality and security scans on the codebase.

### 13. **trivyScanImage.groovy**

Scans Docker images for vulnerabilities using Trivy.

### 14. **unitTest.groovy**

Runs generic unit tests, potentially for non-Java projects.

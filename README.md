[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk)
[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=bugs)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=security_rating)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ionos-cloud_sdk-java&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=ionos-cloud_sdk-java)

# Java API Client For IONOS Cloud

An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API. 

The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud</groupId>
  <artifactId>ionos-cloud-sdk</artifactId>
  <version>5.0.3-BETA</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud:ionos-cloud-sdk:5.0.3-BETA"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-5.0.3-BETA.jar`
* `target/lib/*.jar`

## Our latest, most up to date usage documentation is available [here](https://docs.ionos.com/java-sdk/)

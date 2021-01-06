[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)

# IONOS Cloud SDK for Java

CLOUD API
- API version: 5.0
  - Build date: 2021-01-06T11:24:28.604531+02:00[Europe/Bucharest]

An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API. 

The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Notice - this version of Java SDK is highly EXPERIMENTAL and should be used only for testing purposes not on production environments. A production ready version can be found at https://github.com/ionos-enterprise/ionos-enterprise-sdk-java.

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
  <artifactId>ionoscloud</artifactId>
  <version>5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud:ionoscloud:5.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionoscloud-5.0.jar`
* `target/lib/*.jar`

## Our latest, most up to date documentation is available [here](https://github.com/ionos-cloud/sdk-java/blob/master/DOCS.md)
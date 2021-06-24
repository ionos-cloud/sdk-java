[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk)

## Overview

The IONOS Cloud SDK for Java provides you with access to the IONOS Cloud API. The client library supports both simple and complex requests. It is designed for developers who are building applications in Java .
The SDK for Java wraps the IONOS Cloud API. All API operations are performed over SSL and authenticated using your IONOS Cloud portal credentials. The API can be accessed within an instance running in IONOS Cloud or directly over the Internet from any application that can send an HTTPS request and receive an HTTPS response.

## Getting Started

### Instalation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud</groupId>
  <artifactId>ionos-cloud-sdk</artifactId>
  <version>5.1.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

Also make sure to add the snapshot repository to your project's POM:
```xml
<repositories>
  <repository>
    <id>oss.sonatype.org-snapshot</id>
    <url>http://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
      <enabled>false</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```

#### Gradle users

Add this dependency to your project's build file:
https://github.com/ionos-cloud/sdk-java.git
```groovy
compile "com.ionoscloud:ionos-cloud-sdk:5.1.0-SNAPSHOT"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-5.1.0-SNAPSHOT.jar`
* `target/lib/*.jar`



### Authentication

The username and password or the authentication token can be manually specified when initializing the SDK client:

```java
ApiClient defaultClient = Configuration.getDefaultApiClient();

HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
basicAuthentication.setUsername("YOUR USERNAME");
basicAuthentication.setPassword("YOUR PASSWORD");

```

Environment variables can also be used; the SDK uses the following variables:

* IONOS\_USERNAME - to specify the username used to login
* IONOS\_PASSWORD - to specify the password
* IONOS\_TOKEN - if an authentication token is being used



**Warning**: Make sure to follow the Information Security Best Practices when using credentials within your code or storing them in a file.

### Depth

Many of the _List_ or _Get_ operations will accept an optional _depth_ argument. Setting this to a value between 0 and 5 affects the amount of data that is returned. The details returned vary depending on the resource being queried, but it generally follows this pattern. By default, the SDK sets the _depth_ argument to the maximum value.

| Depth | Description |
| :--- | :--- |
| 0 | Only direct properties are included. Children are not included. |
| 1 | Direct properties and children's references are returned. |
| 2 | Direct properties and children's properties are returned. |
| 3 | Direct properties, children's properties, and descendants' references are returned. |
| 4 | Direct properties, children's properties, and descendants' properties are returned. |
| 5 | Returns all available properties. |

### Pretty

The operations will also accept an optional _pretty_ argument. Setting this to a value of `true` or `false` controls whether the response is pretty-printed (with indentation and new lines). By default, the SDK sets the _pretty_ argument to `true`.


## Feature Reference

The IONOS Cloud SDK for JAVA aims to offer access to all resources in the IONOS Cloud API and also offers some additional features that make the integration easier:
 - authentication for API calls
 - handling of asynchronous requests

## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/sdk-java/issues/new/choose

 - Can I contribute to the Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.

[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk)

# Introduction


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
  <version>6.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud:ionos-cloud-sdk:6.0.0-SNAPSHOT"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-6.0.0-SNAPSHOT.jar`
* `target/lib/*.jar`


### Usage

```java

// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.models.*;
import com.ionoscloud.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Info result = apiInstance.apiInfoGet(prettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiInfoGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Feature Reference

The IONOS Cloud SDK for JAVA aims to offer access to all resources in the IONOS Cloud API and also offers some additional features that make the integration easier:
 - authentication for API calls
 - handling of asynchronous requests

## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/sdk-java/issues/new/choose

 - Can I contribute to the Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.

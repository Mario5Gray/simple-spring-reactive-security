# Spring RSocket Security with Simple Authentication

This example uses RSocket service security with Spring Boot, by way of Spring Security. We will surface RSocket routes that enforce specific security measures and describe what this means internally. This example will inform you of the additional configuration options provided when configuring for Spring Security on a Spring Boot 2.7.x/RSocket application.

It is assumed the developer knows Kotlin, uses Spring Boot, and has an understanding of the [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) on the JVM. If you're new to Spring Security for Reactive streams, then this guide should help shed light on the subject. Of course, the best place to understand are [the reference docs](https://docs.spring.io/spring-security/reference/5.6.5/reactive/integrations/rsocket.html#page-title), so please read them!

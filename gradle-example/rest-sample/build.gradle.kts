plugins {
    java
    war
    id("com.bmuschko.tomcat")
}

group = "com.epam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val tomcatVersion = "9.0.1"

dependencies {
    // https://mvnrepository.com/artifact/javax.ws.rs/javax.ws.rs-api
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    tomcat("org.apache.tomcat.embed:tomcat-embed-core:${tomcatVersion}")
    tomcat("org.apache.tomcat.embed:tomcat-embed-logging-juli:9.0.0.M6")
    tomcat("org.apache.tomcat.embed:tomcat-embed-jasper:${tomcatVersion}")
// https://mvnrepository.com/artifact/org.glassfish.jersey.core/jersey-server
    implementation("org.glassfish.jersey.core:jersey-server:2.34")
// https://mvnrepository.com/artifact/org.glassfish.jersey.containers/jersey-container-servlet-core
    implementation("org.glassfish.jersey.containers:jersey-container-servlet-core:2.34")

    implementation("org.glassfish.jersey.inject:jersey-hk2:2.28")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

}

tomcat {
    contextPath = "/"
    httpProtocol = "org.apache.coyote.http11.Http11Nio2Protocol"
    ajpProtocol  = "org.apache.coyote.ajp.AjpNio2Protocol"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

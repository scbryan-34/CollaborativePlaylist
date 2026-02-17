plugins {
    id("java")
}

group = "me.scbryan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.google.apis:google-api-services-drive:v3-rev20211107-1.32.1")
    implementation("com.google.api-client:google-api-client:1.32.1")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.34.1")
    implementation("com.googlecode.soundlibs:mp3spi:1.9.5.4")
}

tasks.test {
    useJUnitPlatform()
}
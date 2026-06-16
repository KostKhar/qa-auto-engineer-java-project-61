import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.jvm.toolchain.JavaLanguageVersion

plugins {
    application
    checkstyle
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "7.3.1.8318"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


application {
    mainClass.set("hexlet.code.App")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}


val slf4jVersion = "2.0.13"
val logbackVersion = "1.5.6"
val commonsLangVersion = "3.17.0"
val commonsCollections4Version = "4.4"

dependencies {
    implementation("org.apache.commons:commons-lang3:$commonsLangVersion")
    implementation("org.apache.commons:commons-collections4:$commonsCollections4Version")

    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    runtimeOnly("ch.qos.logback:logback-classic:$logbackVersion")
}

sonar {
  properties {
    property("sonar.projectKey", "KostKhar_qa-auto-engineer-java-project-61")
    property("sonar.organization", "kostkhar")
  }
}
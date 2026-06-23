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

sonar {
    properties {
        property("sonar.projectKey", "KostKhar_qa-auto-engineer-java-project-61")
        property("sonar.organization", "kostkhar")
    }
}

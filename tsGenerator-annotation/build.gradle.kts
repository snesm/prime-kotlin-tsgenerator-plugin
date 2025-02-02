repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
        url = uri("https://jitpack.io")
    }
}

plugins {
    `java-library`
    kotlin("jvm") version "1.7.22"
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

ktlint {
    // See ktlint versions at https://github.com/pinterest/ktlint/releases
    version.set("0.44.0")
}

kotlin {
    jvmToolchain(11)
}

group = "gov.cdc.prime"
version = "0.1-SNAPSHOT"

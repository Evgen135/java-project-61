pluginManagement {
    plugins {
        kotlin("jvm") version "2.3.10"
    }
}
rootProject.name = "app"

plugins {
    id("io.github.ben-manes.versions.settings") version "0.61.0"
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

@file:Suppress("UnstableApiUsage", "JcenterRepositoryObsolete")

pluginManagement {
    repositories {
        includeBuild("build-logic")
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven("https://gitlab.e.foundation/api/v4/groups/9/-/packages/maven")
        maven("https://jitpack.io")
    }
}

enableFeaturePreview("VERSION_CATALOGS")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app", ":benchmark")

rootProject.name = "blisslauncher"

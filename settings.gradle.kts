pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://sign3.jfrog.io/artifactory/intelligence-generic-local/")
            credentials {
                username = "infra@sign3labs.com"
                password = "Sign3labs@1234"
            }
        }
    }
}


rootProject.name = "AppStartup"
include(":app")
 
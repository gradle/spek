rootProject.name = "spek"

includeBuild("./spek-gradle-plugin") {
    dependencySubstitution {
        substitute(module("org.spekframework.spek2:spek-gradle-plugin")).with(project(":"))
    }
}

include("spek-dsl")
include("spek-runtime")
include("spek-runner-junit5")
include("spek-kotlin-compiler-plugin-jvm")
include("spek-kotlin-compiler-plugin-native")
include("integration-test")

val excludeIdePlugins: String? by settings

if (excludeIdePlugins == null) {
    include("spek-ide-plugin-interop-jvm")
    include("spek-ide-plugin-intellij-base")
    include("spek-ide-plugin-intellij-base-jvm")
    include("spek-ide-plugin-intellij-idea")
    include("spek-ide-plugin-android-studio")
}

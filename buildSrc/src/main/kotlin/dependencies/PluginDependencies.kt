package dependencies

object PluginDependencies {
    object PluginsVersions {
        const val GRADLE_ANDROID = "7.2.2"
        const val GRADLE_VERSIONS = "0.42.0"
        const val KOTLIN = "1.7.20-RC"
        const val NAVIGATION = "2.5"
        const val JACOCO = "0.16.0"
        const val DOKKA = "1.5.1"
        const val KTLINT = "0.47.1"
        const val SPOTLESS = "6.10.0"
        const val DETEKT = "1.21.0"
        const val GRAPH_GENERATOR = "0.8.0"
    }

    const val GRADLE_ANDROID = "com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}"
    const val GRADLE_VERSIONS =
        "com.github.ben-manes:gradle-versions-plugin:${PluginsVersions.GRADLE_VERSIONS}"
    const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}"
    const val KOTLIN_ALLOPEN = "org.jetbrains.kotlin:kotlin-allopen:${PluginsVersions.KOTLIN}"
    const val NAVIGATION =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${PluginsVersions.NAVIGATION}"
    const val JACOCO = "com.vanniktech:gradle-android-junit-jacoco-plugin:${PluginsVersions.JACOCO}"
    const val GRAPH_GENERATOR =
        "com.vanniktech:gradle-dependency-graph-generator-plugin:${PluginsVersions.GRAPH_GENERATOR}"
//    const val DOKKA = "org.jetbrains.dokka:dokka-gradle-plugin:${PluginsVersions.DOKKA}"
    const val KTLINT = "com.pinterest:ktlint:${PluginsVersions.KTLINT}"
    const val SPOTLESS = "com.diffplug.spotless:spotless-plugin-gradle:${PluginsVersions.SPOTLESS}"
    const val DETEKT = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${PluginsVersions.DETEKT}"
}
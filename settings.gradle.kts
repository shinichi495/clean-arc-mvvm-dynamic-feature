include(
    ":app",
    ":features:home",
    ":features:identity",
    ":core",
    ":features:main",
    ":commons:ui",
    ":libraries:test_util"
)

rootProject.buildFileName = "build.gradle.kts"
include(":commons:views")

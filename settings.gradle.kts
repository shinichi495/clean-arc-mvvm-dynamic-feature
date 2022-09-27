include(
    ":app",
    ":features:home",
    ":features:identity",
    ":core",
    ":features:main",
    ":commons:ui",
    ":commons:views",
    ":commons:utils",
    ":data:demo",
    ":libraries:test_util"
)
rootProject.buildFileName = "build.gradle.kts"
include(":domain:demo")
include(":features:demo")

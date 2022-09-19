object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"

    object Features  {
        const val MAIN = ":features:main"
        const val HOME = ":features:home"
        const val INDENTITY = ":features:identity"
    }

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
    }

    object Libraries {
        const val TEST_UTILS = ":libraries:test_util"
    }


}
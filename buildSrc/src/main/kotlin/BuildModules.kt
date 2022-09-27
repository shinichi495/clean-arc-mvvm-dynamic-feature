object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"

    object Features  {
        const val MAIN = ":features:main"
        const val HOME = ":features:home"
        const val INDENTITY = ":features:identity"
        const val DEMO = ":features:demo"
    }

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
        const val UTILS = ":commons:utils"
    }

    object Data {
        const val DEMO = ":data:demo"
    }

    object Domain {
        const val DEMO = ":domain:demo"
    }

    object Libraries {
        const val TEST_UTILS = ":libraries:test_util"
    }


}
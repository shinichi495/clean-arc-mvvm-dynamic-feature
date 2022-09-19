import dependencies.Dependencies
import extensions.implementation

plugins {
    id("commons.android-library")
}

dependencies {

    implementation(project(BuildModules.Commons.UI))
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.FRAGMENT_KTX)

//    kapt(DATABINDING)
}
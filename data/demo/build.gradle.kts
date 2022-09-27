import dependencies.Dependencies.LOGGING
import dependencies.Dependencies.RETROFIT
import dependencies.Dependencies.RETROFIT_CONVERTER

plugins {
    id("commons.android-library")
}

dependencies {
    //CORE --------------------------------------------------------------------------------------
    implementation(project(BuildModules.CORE))

    //DOMAIN --------------------------------------------------------------------------------------
    implementation(project(BuildModules.Domain.DEMO))

    //RETROFIT & GSON ----------------------------------------------------------------------------------------
    implementation(RETROFIT)
    implementation(RETROFIT_CONVERTER)
    implementation(LOGGING)

}
import dependencies.Dependencies

plugins {
    id("commons.android-library")
}

dependencies {
    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.LOGGING)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_KTX)

}
plugins {
    id("commons.android-library")
    id("org.jetbrains.kotlin.android")
}

dependencies {

    implementation(project(BuildModules.Commons.UI))

    implementation(project(BuildModules.Domain.DEMO))

    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
}

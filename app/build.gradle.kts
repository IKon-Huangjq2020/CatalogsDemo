plugins {
    alias(libs.plugins.catalogs.android.application)
    alias(libs.plugins.catalogs.android.application.compose)
}

android {
    namespace = "com.example.catalogsdemo"

    defaultConfig {
        applicationId = "com.example.catalogsdemo"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    implementation(projects.feature.login)
    implementation(projects.feature.settings)
}
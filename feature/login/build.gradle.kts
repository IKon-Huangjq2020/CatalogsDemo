plugins {
    alias(libs.plugins.catalogs.android.library)
    alias(libs.plugins.catalogs.android.library.compose)
}

android {
    namespace = "com.example.login"

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

}
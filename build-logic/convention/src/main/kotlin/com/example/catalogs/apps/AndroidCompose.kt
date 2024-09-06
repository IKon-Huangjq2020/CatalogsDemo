package com.example.catalogs.apps

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }

        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            add("implementation", platform(bom))
            add("implementation", libs.findBundle("androidx-compose").get())

            add("androidTestImplementation", platform(bom))
            add(
                "androidTestImplementation",
                libs.findLibrary("androidx-compose-ui-test-junit4").get()
            )

            add("debugImplementation", libs.findBundle("androidx-compose-debug").get())

        }

        testOptions {
            unitTests {
                isIncludeAndroidResources = true
            }
        }
    }

}

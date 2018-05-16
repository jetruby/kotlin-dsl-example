import Config.Android.applicationId
import Config.Android.versionCode
import Config.Android.versionName
import org.gradle.kotlin.dsl.*


plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Config.Android.compileSdk)
    buildToolsVersion(Config.Android.build_tools_version)

    defaultConfig {
        minSdkVersion(Config.Android.minSdk)
        targetSdkVersion(Config.Android.targetSdk)

        applicationId = Config.Android.applicationId
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}


dependencies {
    implementation(Config.Libs.kotlin_stdlib)
    implementation(Config.Libs.retrofit)
    implementation(Config.Libs.retrofit_rxjava_adapter)
    implementation(Config.Libs.support_appcompat_v7)
    implementation(Config.Libs.support_annotations)
    implementation(Config.Libs.constraint_lauout)

    testImplementation(Config.Libs.junit)
    androidTestImplementation(Config.Libs.junit_runner)
    androidTestImplementation(Config.Libs.espresso_core)
}


/**
 * Created by Artem Leushin on 06.04.2018.
 */

object Config {

    object Versions {
        val kotlin_version = "1.2.31"
        val android_plugin_version = "3.1.0"
        val support_lib = "27.0.2"
        val retrofit = "2.3.0"
        val rxjava = "2.1.9"
        val constraint_layout = "1.1.0-beta6"
        val junit = "4.12"
        val junit_runner = "1.0.1"
        val espresso_core = "3.0.1"
    }

    object BuildPlugins {
        val android_plugin = "com.android.tools.build:gradle:${Versions.android_plugin_version}"
        val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
    }

    object Android {
        val applicationId = "com.jetruby.kotlindslgradleexample"
        val build_tools_version = "27.0.3"
        val compileSdk = 27
        val minSdk = 16
        val targetSdk = 27
        val versionCode = 1
        val versionName = "1.0"
    }

    object Libs {
        val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${Versions.kotlin_version}"

        val support_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
        val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
        val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
        val constraint_lauout =
            "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"

        val junit = "junit:junit:${Versions.junit}"
        val junit_runner = "com.android.support.test:runner:${Versions.junit_runner}"
        val espresso_core =
            "com.android.support.test.espresso:espresso-core:${Versions.espresso_core}"
    }
}
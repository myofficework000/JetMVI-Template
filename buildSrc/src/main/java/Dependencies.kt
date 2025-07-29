object Dependencies {

    object Plugins {
        const val application = "com.android.application"
        const val kotlinAndroid = "org.jetbrains.kotlin.android"
    }

    object ClassPath {
        object Version {
            const val gradle = "8.4.0"
            const val kotlin = "2.0.0"
        }

        const val gradle = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    }

    object Android {

        object Version {
            const val coreKtx = "1.13.1"
            const val appCompat = "1.6.1"
            const val activityCompose = "1.10.1"
            const val lifecycle = "2.6.2"
        }

        const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val activityCompose = "androidx.activity:activity-compose:${Version.activityCompose}"

        const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
        const val lifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}"
        const val navigationCompose = "androidx.navigation:navigation-compose:2.7.7"
    }

    object ThirdParty {
        object Version {
            const val material = "1.11.0"
            const val coil = "2.5.0"
            const val coroutines = "1.7.3"
            const val retrofit = "2.9.0"
            const val koin = "3.5.3"

        }

        const val material = "com.google.android.material:material:${Version.material}"

        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"

        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"

        const val koinAndroid = "io.insert-koin:koin-android:${Version.koin}"
        const val koinCompose = "io.insert-koin:koin-androidx-compose:${Version.koin}"
    }

    object Test {
        object Version {
            const val junit = "4.13.2"
            const val mockk = "1.13.9"
            const val okhttpMockWebServer = "4.12.0"
        }

        const val junit = "junit:junit:${Version.junit}"
        const val mockk = "io.mockk:mockk:${Version.mockk}"
        const val okhttpMockWebServer = "com.squareup.okhttp3:mockwebserver:${Version.okhttpMockWebServer}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${ThirdParty.Version.coroutines}"
        const val koinTest = "io.insert-koin:koin-test:${ThirdParty.Version.koin}"
    }

    object AndroidTest {
        object Version {
            const val junit = "1.1.5"
            const val espresso = "3.5.1"
        }

        const val junit = "androidx.test.ext:junit:${Version.junit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espresso}"
    }
}

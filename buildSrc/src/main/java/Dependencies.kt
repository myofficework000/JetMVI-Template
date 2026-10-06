object Dependencies {

    object Plugins {
        const val application = "com.android.application"
    }

    object ClassPath {
        object Version {
            const val gradle = "9.4.0"
            const val kotlin = "2.4.20"
        }

        const val gradle = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    }

    object Android {

        object Version {
            const val coreKtx = "1.19.0"
            const val appCompat = "1.8.0"
            const val activityCompose = "1.13.0"
            const val lifecycle = "2.10.0"
        }

        const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val activityCompose = "androidx.activity:activity-compose:${Version.activityCompose}"

        const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
        const val lifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}"
        const val navigationCompose = "androidx.navigation:navigation-compose:2.10.1"
    }

    object ThirdParty {
        object Version {
            const val material = "1.14.0"
            const val coil = "3.6.3"
            const val coroutines = "1.11.0"
            const val retrofit = "3.0.0"
            const val koin = "4.2.2"

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
            const val mockk = "1.14.11"
            const val okhttpMockWebServer = "5.3.2"
        }

        const val junit = "junit:junit:${Version.junit}"
        const val mockk = "io.mockk:mockk:${Version.mockk}"
        const val okhttpMockWebServer = "com.squareup.okhttp3:mockwebserver:${Version.okhttpMockWebServer}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${ThirdParty.Version.coroutines}"
        const val koinTest = "io.insert-koin:koin-test:${ThirdParty.Version.koin}"
    }

    object AndroidTest {
        object Version {
            const val junit = "1.3.0"
            const val espresso = "3.7.0"
        }

        const val junit = "androidx.test.ext:junit:${Version.junit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espresso}"
    }
}

plugins {
    id(Dependencies.Plugins.application)
    id("org.jetbrains.kotlin.plugin.compose") version Dependencies.ClassPath.Version.kotlin
}

android {
    namespace = "com.abhishek.pathak.kotlin.android.githubcompose"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.abhishek.pathak.kotlin.android.githubcompose"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

dependencies {
    // Compose BOM
    implementation(platform("androidx.compose:compose-bom:2026.09.00"))
    androidTestImplementation(platform("androidx.compose:compose-bom:2026.09.00"))

    // Core
    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.appCompat)
    implementation(Dependencies.Android.activityCompose)

    // Compose
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation("io.coil-kt.coil3:coil-compose:${Dependencies.ThirdParty.Version.coil}")
    implementation("io.coil-kt.coil3:coil-network-okhttp:${Dependencies.ThirdParty.Version.coil}")


    // Lifecycle + Navigation
    implementation(Dependencies.Android.lifecycleViewModelKtx)
    implementation(Dependencies.Android.lifecycleRuntimeKtx)
    implementation(Dependencies.Android.lifecycleViewModelCompose)
    implementation(Dependencies.Android.navigationCompose)

    // Koin
    implementation(Dependencies.ThirdParty.koinAndroid)
    implementation(Dependencies.ThirdParty.koinCompose)

    // Coroutines
    implementation(Dependencies.ThirdParty.coroutinesCore)
    implementation(Dependencies.ThirdParty.coroutinesAndroid)

    // Retrofit
    implementation(Dependencies.ThirdParty.retrofit)
    implementation(Dependencies.ThirdParty.retrofitGson)



    // Material
    implementation(Dependencies.ThirdParty.material)

    // Unit Test
    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.mockk)
    testImplementation(Dependencies.Test.coroutinesTest)
    testImplementation(Dependencies.Test.okhttpMockWebServer)
    testImplementation(Dependencies.Test.koinTest)
    testImplementation("org.robolectric:robolectric:4.17")

    // Android Instrumentation Test
    androidTestImplementation(Dependencies.AndroidTest.junit)
    androidTestImplementation(Dependencies.AndroidTest.espressoCore)
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
}
configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin") {
            useVersion(Dependencies.ClassPath.Version.kotlin)
            because("Keep Kotlin artifacts aligned with the project toolchain")
        }
    }
}

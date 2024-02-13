plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.rodrigo.navigationpractice"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rodrigo.navigationpractice"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val composeBom = "2024.02.00"
    val corrutines = "1.7.3"
    val hilt = "2.50"
    val hiltCompiler = "1.1.0"
    val hiltNavigationCompose = "1.1.0"
    val coreKtx = "1.12.0"
    val lifecycleRuntimeKtx = "2.7.0"
    val activityCompose = "1.8.2"

    implementation("androidx.core:core-ktx:$coreKtx")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeKtx")
    implementation("androidx.activity:activity-compose:$activityCompose")

    // Compose
    implementation(platform("androidx.compose:compose-bom:$composeBom"))
    implementation("androidx.compose.animation:animation")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    //Corrutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$corrutines")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$corrutines")

    // Hilt
    implementation("com.google.dagger:hilt-android:$hilt")
    implementation("androidx.hilt:hilt-navigation-compose:$hiltNavigationCompose")
    kapt("androidx.hilt:hilt-compiler:$hiltCompiler")
    kapt("com.google.dagger:hilt-android-compiler:$hilt")

}
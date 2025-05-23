plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.application"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.application"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        enable = true
    }
}

dependencies {
    implementation("com.google.ar:core:1.39.0") // ARCore
    implementation("androidx.appcompat:appcompat:1.6.1") // AppCompat
    implementation("com.google.android.material:material:1.9.0") // Material Design
    implementation("androidx.activity:activity-ktx:1.7.2") // Activity KTX
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // ConstraintLayout


    implementation("com.google.ar.sceneform.ux:sceneform-ux:1.17.1")
    implementation("com.google.ar.sceneform:assets:1.17.1")

    implementation("androidx.core:core-ktx:1.10.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

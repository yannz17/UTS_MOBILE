plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
}
// This is your PROJECT-LEVEL build.gradle.kts (in GourmetApp folder)
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // REMOVE the compose plugin line - it's not needed here
}

// Remove any other compose-related configuratio n if present
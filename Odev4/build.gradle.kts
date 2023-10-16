// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
}
buildscript{
    dependencies{
        classpath("androidx.navigation.safeargs:androidx.navigation.safeargs.gradle.plugin:2.5.3")
    }
}
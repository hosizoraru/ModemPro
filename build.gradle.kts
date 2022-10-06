plugins {
    id("com.android.application") version "8.0.0-alpha02" apply false
    id("com.android.library") version "8.0.0-alpha02" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}
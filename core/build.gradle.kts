plugins {
    kotlin("jvm")
    application
}

application {
    mainClassName = "com.erikbylund.MainKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
}

plugins {
    java
    idea
    jacoco
    kotlin(KotlinPlugin.jvm) version KotlinVersion.kotlin
}

allprojects {
    group = ProjectGroup.dgahn
    version = ProjectVersion.dgahn

    repositories {
        google()
        mavenCentral()
    }

    apply(plugin = TestPlugin.jacoco)
    apply(plugin = ProjectPlugin.idea)
    apply(plugin = KotlinPlugin.kotlin)

    dependencies {
        testImplementation(platform(TestLibs.junitBom))
        testImplementation(TestLibs.jupiter)
        testImplementation(TestLibs.assertjCore)
    }

    jacoco {
        toolVersion = TestVersion.jacoco
    }

    tasks.jacocoTestReport {
        reports {
            html.isEnabled = JacocoProps.htmlEnabled
            xml.isEnabled = JacocoProps.xmlEnabled
            csv.isEnabled = JacocoProps.csvEnabled
        }
    }

    tasks.test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
        jacoco {
            enabled = JacocoProps.enabled
        }
    }
}

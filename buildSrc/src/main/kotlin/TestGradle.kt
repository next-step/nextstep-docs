object TestPlugin {
    const val jacoco = "jacoco"
}

object TestVersion {
    const val jacoco = "0.8.6"
    const val junit = "5.7.1"
    const val assertj = "3.19.0"
}

object TestLibs {
    const val junitBom = "org.junit:junit-bom:${TestVersion.junit}"
    const val jupiter = "org.junit.jupiter:junit-jupiter"
    const val assertjCore = "org.assertj:assertj-core:${TestVersion.assertj}"
}

object JacocoProps {
    const val htmlEnabled = true
    const val xmlEnabled = false
    const val csvEnabled = false
    const val enabled = true
}
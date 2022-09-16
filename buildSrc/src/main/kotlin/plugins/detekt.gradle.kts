package plugins

import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

apply<DetektPlugin>()

configure<DetektExtension> {
    source = project.files("src/main/kotlin")
    config = files("$rootDir/.detekt/config.yml")
    reports {
        xml {
            required.set(true)
            outputLocation.set(project.file("build/reports/detekt/report.xml"))
        }
        html {
            required.set(true)
            outputLocation.set(project.file("build/reports/detekt/report.html"))
        }
    }
}


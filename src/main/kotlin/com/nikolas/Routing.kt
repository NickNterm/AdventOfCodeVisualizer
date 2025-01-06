package com.nikolas

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        adventOfCodeSolutionPage(
            solution = solutions(1)
        )
        // Serve static files
        staticResources("/resources", "static/images")
        staticResources("/", "static/styles")
    }
}

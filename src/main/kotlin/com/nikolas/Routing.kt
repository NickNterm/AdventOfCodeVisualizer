package com.nikolas

import com.nikolas.core.defaultHead
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml {
                head {
                    defaultHead()
                }
                body(classes = "bg-backgroundColor p-4 h-screen") {
                    div(classes = "flex flex-col h-full ") {
                        div(classes = "flex h-14 bg-cardColor rounded-2xl px-4 w-full justify-items-start items-center") {
                            img(classes = "h-8 w-8") {
                                src = "resources/logo.png"
                            }
                            div(classes = "w-4")
                            p(classes = "text-2xl text-baseTextColor") {
                                +"Advent Of Code "
                                span(classes = "text-starColor") {
                                    +"\\*2024*\\"
                                }
                                a {
                                    href = "https://github.com/nicknterm"
                                    span(classes = "text-secondaryTextColor transition ease-in-out delay-150 hover:text-baseTextColor") {
                                        +" by Nikolas Ntermaris"
                                    }
                                }
                            }
                            div(classes = "w-2")
                            a {
                                href = "https://github.com/nicknterm"
                                img(classes = "h-6 w-6") {
                                    src = "resources/github.svg"
                                }

                            }
                        }
                        div(classes = "h-4")
                        div(classes = "grow flex") {
                            div(classes = "grow h-full bg-cardColor rounded-2xl") {
                                div(classes = "h-9 bg-cardTitleColor rounded-t-2xl px-3 place-content-center") {
                                    p(classes = "text-baseTextColor text-lg") {
                                        +"Code "
                                        span(classes = "text-secondaryTextColor text-base") {
                                            +"(read-only)"
                                        }
                                    }
                                }
                            }
                            div(classes = "w-4")
                            div(classes = "flex flex-grow flex-col") {
                                div(classes = "grow bg-cardColor rounded-2xl") {
                                    div(classes = "h-9 bg-cardTitleColor rounded-t-2xl px-3 place-content-center") {
                                        p(classes = "text-baseTextColor text-lg") {
                                            +"Input"
                                        }
                                    }
                                }
                                div(classes = "h-4")
                                div(classes = "grow bg-cardColor rounded-2xl") {
                                    div(classes = "h-9 bg-cardTitleColor rounded-t-2xl px-3 place-content-center") {
                                        p(classes = "text-baseTextColor text-lg") {
                                            +"Output"
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Serve static files
        staticResources("/resources", "static/images")
    }
}

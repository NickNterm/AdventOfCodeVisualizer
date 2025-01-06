package com.nikolas

import com.nikolas.core.defaultHead
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Route.adventOfCodeSolutionPage(solution: AdventOfCodeSolution) {
    println(solution.solution)
    get("/") {
        call.respondHtml {
            head {
                defaultHead()
                link {
                    rel = "stylesheet"
                    href = "/github-dark.css"
                }
            }
            body(classes = "bg-backgroundColor p-4 h-screen") {
                script {
                    src = "//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.11.1/highlight.min.js"
                }
                script {
                    +"hljs.highlightAll();"
                }
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
                        div(
                            classes = "w-[calc(50%-48px)] h-100 bg-cardColor rounded-2xl",
                        ) {
                            style = "height: calc(100vh - 102px);"
                            div(classes = "h-9 bg-cardTitleColor rounded-t-2xl px-3 place-content-center") {
                                p(classes = "text-baseTextColor text-lg") {
                                    +"Code "
                                    span(classes = "text-secondaryTextColor text-base") {
                                        +"(read-only)"
                                    }
                                }
                            }
                            div(classes = "h-[calc(100%-36px)] text-base overflow-scroll p-2") {
                                pre {
                                    code(classes = "language-kotlin") {

                                        +solution.solution
                                    }
                                }
                            }
                        }
                        div(classes = "w-4")
                        div(classes = "shrink-0 flex flex-grow flex-col") {
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
}
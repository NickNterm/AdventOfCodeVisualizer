package com.nikolas.core

import kotlinx.html.HEAD
import kotlinx.html.link
import kotlinx.html.script
import kotlinx.html.unsafe

fun HEAD.defaultHead() {

    script { src = "https://cdn.tailwindcss.com" }
    link {
        rel = "preconnect"
        href = "https://fonts.googleapis.com"
    }
    link {
        rel = "preconnect"
        href = "https://fonts.gstatic.com"
    }
    link {
        rel = "stylesheet"
        href =
            "https://fonts.googleapis.com/css2?family=JetBrains+Mono:ital,wght@0,100..800;1,100..800&family=M+PLUS+1p&display=swap"
    }
    script {
        unsafe {
            +"""
            tailwind.config = {
                theme: {
                    extend: {
                        colors: {
                            backgroundColor: '#211E2E',
                            cardColor: '#37334C',
                            cardTitleColor: '#4F486B',
                            baseTextColor: '#C5C1D7',
                            secondaryTextColor: '#A9A3C2',
                            starColor: '#E7C969',
                        },
                    },
                    fontFamily: {
                        'sans': ['"Jetbrains Mono"'],
                    }
                },
            };
            """
        }
    }
}
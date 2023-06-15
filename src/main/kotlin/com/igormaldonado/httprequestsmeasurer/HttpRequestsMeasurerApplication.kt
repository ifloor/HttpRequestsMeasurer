package com.igormaldonado.httprequestsmeasurer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpRequestsMeasurerApplication

fun main(args: Array<String>) {
    runApplication<HttpRequestsMeasurerApplication>(*args)
}

package com.example

import groovy.util.logging.Log4j

@Log4j
trait SomeTrait {

    def withErrorHandler(Closure clos) {
        try {
            clos()
        } catch(Exception e) {
            log.error e.message
            throw new ApplicationSpecificException("Application Specific Message: ${e.message}")
        }
    }
}
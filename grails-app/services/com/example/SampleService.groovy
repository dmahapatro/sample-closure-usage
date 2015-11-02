package com.example

class SampleService implements SomeTrait {

    def throwingException() {
        withErrorHandler {
            throw new Exception("I am an exception")
        }
    }

    def notThrowingException() {
        withErrorHandler {
            println "foo bar"
        }
    }
}

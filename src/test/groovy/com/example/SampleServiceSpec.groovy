package com.example

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SampleService)
class SampleServiceSpec extends Specification {

    void "test something"() {
        when:
        service.throwingException()

        then:
        ApplicationSpecificException e = thrown(ApplicationSpecificException)
        e.message == "Application Specific Message: I am an exception"
    }

    void "test something again"() {
        when:
        service.notThrowingException()

        then:
        notThrown(Exception)
    }
}

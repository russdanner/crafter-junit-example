package pippo

import spock.lang.Specification
import work.Pippo

class TestSpec extends Specification {

    Pippo pippo;

    def setup() {
        pippo = new Pippo()
    }

    def "the output string is equals as the input"() {
        when:
        def inputString = "test pippo"

        then:
        pippo.getStr(inputString) == inputString
    }
}

import spock.lang.*
import geb.*
import geb.spock.*

class GoogleSpec extends GebReportingSpec {

    def "Search BrowserStack on Google"() {
        when:
        to GoogleHomePage

        and:
        q = "BrowserStack"

        then:
        waitFor { at GoogleResultsPage }

        //and:
        //firstResultLink.text() == "Wikipedia"

        //when:
        //firstResultLink.click()

        //then:
        //waitFor { at WikipediaPage }
    }

}
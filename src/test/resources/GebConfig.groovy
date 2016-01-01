import geb.driver.BrowserStackDriverFactory
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import geb.report.ReportState
import geb.report.Reporter
import geb.report.ReportingListener

//baseUrl = "https://***.net"

waiting {
    timeout = 10
}

reportingListener = new ReportingListener() {
    void onReport(Reporter reporter, ReportState reportState, List<File> reportFiles) {
        reportFiles.each {
            println "[[ATTACHMENT|$it.absolutePath]]"
        }
    }
}

def browserStackBrowser = System.getProperty("geb.browserstack.browser")
if (browserStackBrowser) {
    driver = {
        def username = "<username>"
        assert username
        def accessKey = "<automate-key>"
        assert accessKey
        new BrowserStackDriverFactory().create(browserStackBrowser, username, accessKey, ['browserstack.localIdentifier': System.getProperty('browserstack.localIdentifier'), 'build' : 'Sample Geb Tests'])
    }
}


//Default browser to run on local machine
environments {

    firefox {
        driver = { new FirefoxDriver() }
    }

    chrome {
        driver = { new ChromeDriver() }
    }

}


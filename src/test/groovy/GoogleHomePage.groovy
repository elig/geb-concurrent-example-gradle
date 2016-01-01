import geb.*

class GoogleHomePage extends Page {
    static url = "https://www.google.com"
    static at = { title == "Google" }
}
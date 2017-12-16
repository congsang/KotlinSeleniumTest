import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class GoogleSearchTest {
    var chrome: WebDriver? = null

    @BeforeClass
    fun setup() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")
        chrome = ChromeDriver()
    }

    @AfterClass
    fun tearDown() {
        chrome!!.quit()
    }

    @Test
    fun testSearch() {
        var gs = GoogleSearch()
        gs.webDriver = chrome
        gs.open()
        gs.search("google")
        gs.printLinks()
    }
}
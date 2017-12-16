import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import java.util.concurrent.TimeUnit

class GoogleSearch {
    var webDriver: WebDriver? = null

    fun open() {
        webDriver!!.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        webDriver!!.get("https://google.com")
    }

    fun search(term: String) {
        webDriver!!.findElement(By.name("q")).sendKeys("$term\n")
    }

    fun printLinks() {
        Thread.sleep(3000)

        var links = webDriver!!.findElements(By.className("_Rm"))

        links.forEach { println(it.text) }
    }
}
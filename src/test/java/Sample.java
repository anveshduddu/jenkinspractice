import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
    @Test
    public void test() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println("Title "+driver.getTitle());
        driver.quit();
    }
}

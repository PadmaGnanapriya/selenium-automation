import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class MyFirstTest {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
//        String baseUrl = "https://portal.mypearson.com/login";
        String baseUrl = "https://store.spencehub.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        WebElement closeBtn = driver.findElement(By.className("icon-x"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        closeBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().setSize(320);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.resizeTo(350,300)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        js.executeScript("window.scrollBy(0,1500)");
        for(int i=0;i<6000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3)", "");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(baseUrl+"/checkout");

//        js.executeScript("window.scrollBy(0,1500)");
        for(int i=0;i<6000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5)", "");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(baseUrl+"/pricing");


//        js.executeScript("window.scrollBy(0,1500)");
        for(int i=0;i<6000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(baseUrl+"/faq");


        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.quit();

    }



}

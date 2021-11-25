package TestNG_Mentorship.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MethodDriver {
    public static WebDriver driver; // webdriver ı diğer metodların içinde rahat rahat kullanabilmek için

    /*
priority kullandıgımızda  testler alfabetik okunmaz, koydugumuz sıraya göre çalışmaya başlar.
 */

    @Test
    public static void beforeClass() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement myAccountBtn = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountBtn.click();

        WebElement registerBtn = driver.findElement(By.xpath("//a[text()='Register']"));
        registerBtn.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.sendKeys("Donald");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Trump");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("d.trump@gmail.com");

        WebElement telephone = driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("012345678912");

        WebElement pass1 = driver.findElement(By.id("input-password"));
        pass1.sendKeys("1234567abc1");

        WebElement passConfirm = driver.findElement(By.id(" input-confirm"));
        passConfirm.sendKeys("1234567abc1");

        WebElement chechBox = driver.findElement(By.cssSelector("input[name='agree']"));
        chechBox.click();

        WebElement continueBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueBtn.click();

    }
}
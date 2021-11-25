package Burak_Mentoring.Class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogIn {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php"); // linke gitti
        driver.manage().window().maximize();

        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();

        WebElement mail = driver.findElement(By.id("email_create"));
        mail.sendKeys("tgb@tgb.com");

        WebElement signIn_Button = driver.findElement(By.id("SubmitCreate"));
        signIn_Button.click();

        Thread.sleep(2000);

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Burak");
        driver.findElement(By.id("customer_lastname")).sendKeys("Türkmen");
        driver.findElement(By.id("passwd")).sendKeys("Burakkk");
        driver.findElement(By.id("address1")).sendKeys("Landberg Street, 43");
        driver.findElement(By.id("city")).sendKeys("New York");

        Select city = new Select(driver.findElement(By.id("id_state")));
        city.selectByValue("32");

//        WebElement state=driver.findElement(By.id("id_state"));
//        state.sendKeys("Kentucky");

        driver.findElement(By.id("postcode")).sendKeys("10013");

        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByValue("21");

        driver.findElement(By.id("phone_mobile")).sendKeys("+13334445555");


        driver.findElement(By.id("submitAccount")).click();
        //1 202 555 0156


    }
}

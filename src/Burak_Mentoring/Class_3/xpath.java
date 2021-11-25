package Burak_Mentoring.Class_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {

        //    //input[@name='q']

        //    //a[contains(text(), 'Best Sellers')] ---> a'nın içinde 'Best Sellers' içeren text

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@title='Women']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[@id='list']")).click(); //i[@class='icon-th-list']

        driver.findElement(By.xpath("//a[@class='addToWishlist wishlistProd_1']")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();

        driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']")).click();


    }
}
/*

   //a[contains(text(),'Best Sellers')] ---> a'nın içinde 'Best Sellers' içeren text
   //a[@title='Log in to your customer account'] --->

   //input[@id='email_create']

   //button[@class='btn btn-default button button-medium exclusive'] ---> create an account

 */
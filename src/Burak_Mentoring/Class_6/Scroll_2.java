package Burak_Mentoring.Class_6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Scroll_2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver; // js çağırdığımızda javascript metodların çağırmaya yarıyor
        // En aşağı kaydırıp specials buttonuna tıklayınız.
        js.executeScript("window.scrollBy(0,2300)"); // sayısal değeri deneyerek buluyoruz
        WebElement specials=driver.findElement(By.xpath("//a[@title='Specials']"));
        specials.click();

        WebElement dress= driver.findElement(By.xpath("(//a[@class='product-name'])[1]"));
        dress.click();

        // L bedeb seç
        Select Large=new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
        Large.selectByValue("3");
        //cart ekle

        WebElement AddToCart=driver.findElement(By.xpath("//button[@name='Submit']"));
        AddToCart.click();

        Thread.sleep(6000);

        WebElement continueS=driver.findElement(By.xpath("//span[@title='Continue shopping']"));
        continueS.click();

        WebElement cart=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
        cart.click();

        WebElement checkOut=driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
        checkOut.click();


    }
         /*

    http://automationpractice.com/index.php  - websitesine gidin.
    En aşağı kaydırıp specials buttonuna tıklayınız.
    Top sellers tab'ındaki Printed Chiffon Dress'e tıklayınz
    L beden seçip cart'a ekleyin.
    Continue shopping'e tıklayınız
    cart buttonuna tıklayınız
    proceed to checkout'a tıklayın.

    aşağı kaydırarak contact us a tıklayın.

    formu doldurun.

    sucsess mesajını konsola yazdırın.

     */


    }


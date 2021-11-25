package Burak_Mentoring.Class_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Scroll komutunu çağırabilmek için;
        JavascriptExecutor js=(JavascriptExecutor) driver; // js çağırdığımızda javascript metodların çağırmaya yarıyor

        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,500)"); // 500 pixel aşağıya kaydır(deneme yaznılma yolu ile 500)

        driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();

        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();

        driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=product/compare']")).click();

        driver.findElement(By.xpath("(//input[@type])[4]")).click();

        driver.findElement(By.xpath("(//input[@type])[5]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@href='https://demo.opencart.com/index.php?route=checkout/cart'])[3]")).click();

        Thread.sleep(2000);

        ////a[normalize-space()='Estimate Shipping & Taxes']

        driver.findElement(By.xpath("//a[normalize-space()='Estimate Shipping & Taxes']")).click();

        Select country = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
        country.selectByValue("81");

        Thread.sleep(2000);

        Select region = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
        region.selectByValue("1260");

        driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys("55555");

        driver.findElement(By.xpath("//button[@id='button-quote']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='shipping_method']")).click();

        driver.findElement(By.xpath("//input[@id='button-shipping']")).click();

        Thread.sleep(2000);

        WebElement sucsess = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));  //
        System.out.println(sucsess.getText());









        /*

    https://demo.opencart.com/ websitesine git.
    Iphone'u görene kadar scroll down yap.
    Iphone'un altındaki compare buttonuna tıkla.
    Tekrar scroll down yapıp Macbook'un altındaki compare buttonuna tıkla.
    Yeşil bardaki product comparison'a tıkla.
    iki ürünü de Cart'a ekle.
    Yeşil bardaki shopping cart'a tıkla.
    Estimate Shipping n Taxes barına tıkla.

    formu doldur.

    Get Quotes buttonuna tıkla.

    Flat Rate seç.

    Apply Shipping buttonuna tıkla.

    Success mesajını konsola yazdır.

    Aşağı scroll yaptırıp Checkout buttonuna tıkla.

    Kırmızı bardaki error mesajını konsola yazdır.

    */


    }
}

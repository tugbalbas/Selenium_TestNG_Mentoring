package Burak_Mentoring.Class_3;

/*

    Hepsi XPath ile

    Websitesi : https://demo.opencart.com/

    1) Macbook'un resmine tıkla.

    2) Add to Wishlist'e tıkla.

    3) Açılan yeşil penceredeki wish list'e tıkla.

    4) New Customer'ın altındaki Continue'ya tıkla.

    5)Formu doldur.

    6)Continue buttonuna tıkla.

    7) Your Account Has Been Created! consola yazdırın.

    8) contact us'a tıkla

    9)CONTACT US yazısını konsola yazdır.

     */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class macbook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();


        //MACBOOK TIKLA
        WebElement macbook = driver.findElement(By.xpath("(//img[@class = 'img-responsive'])[5]"));
        macbook.click();

        //ADD TO WISH LIST
        WebElement wishList = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]"));
        wishList.click();

        //WISH LIST PAGE
        WebElement greenTab = driver.findElement(By.xpath("(//a[@href='https://demo.opencart.com/index.php?route=account/wishlist'])[2]"));
        greenTab.click();

        //NC Continue
        WebElement nC_Continue = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        nC_Continue.click();

        //FORM
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Türkmen");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("buuurak@bir.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("13333444555");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("burakturkmen");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("burakturkmen");

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();


        //Sucsess Message --- Your Account Has Been Created! consola yazdırın.
        WebElement sucsess = driver.findElement(By.xpath("//h1[text()]"));
        System.out.println(sucsess.getText());

        //Contact Us
        WebElement contactUs = driver.findElement(By.xpath("//a[contains(text(), 'contact')]"));
        contactUs.click();

        //Contact Us Text
        WebElement textContact = driver.findElement(By.xpath("//h1[text()]")); //h1[text()]
        System.out.println(textContact.getText());


    }
}

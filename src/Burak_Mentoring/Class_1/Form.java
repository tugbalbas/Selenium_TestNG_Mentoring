package Burak_Mentoring.Class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/211284332489054"); // linke gitti
        driver.manage().window().maximize();

        //AD SOYAD
        driver.findElement(By.id("first_3")).sendKeys("Burak");
        driver.findElement(By.id("last_3")).sendKeys("Türkmen");

        //mail
        WebElement mail = driver.findElement(By.id("input_4"));
        mail.sendKeys("brk@brk.com");

        //telefon
        driver.findElement(By.id("input_5_full")).sendKeys("1234567890");

        //yas
        driver.findElement(By.id("input_7")).sendKeys("24");

        //SORU
        WebElement soru = driver.findElement(By.name("q8_gundeKac"));
        soru.sendKeys("8");

        Thread.sleep(3000);

        driver.findElement(By.id("input_2")).click();







    }
}

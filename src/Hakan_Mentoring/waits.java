package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class waits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

//        WebElement text=driver.findElement(By.xpath("//p[text()='WebDriver']"));
//        System.out.println(text.getText());

        List<WebElement> list=driver.findElements(By.id("demo"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(list.get(i));
        }

        driver.quit();



    }
}

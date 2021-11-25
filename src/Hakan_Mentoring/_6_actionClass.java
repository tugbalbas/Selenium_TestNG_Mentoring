package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _6_actionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");

        WebElement cookies=driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookies.click();

       /* driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']")).click();
        WebElement sprache=driver.findElement(By.xpath("(//select[@name='language_code']/option)[5]"));
        Select slc=new Select(sprache);
       slc.selectByValue("fr");
       driver.findElement(By.xpath("//button[@name='save']")).click(); */

        Actions act=new Actions(driver);

        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='menubar']/li"));
        for (WebElement element:list) {
            act.moveToElement(element).perform();
            Thread.sleep(500);
        }


    }
}

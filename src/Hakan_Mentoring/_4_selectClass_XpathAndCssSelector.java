package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _4_selectClass_XpathAndCssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        Thread.sleep(500);
        WebElement cookies=driver.findElement(By.cssSelector("#cookieChoiceDismiss"));
        cookies.click();

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Hakan");

        WebElement surname=driver.findElement(By.name("lastname"));
        surname.sendKeys("Demir");

        WebElement gender=driver.findElement(By.cssSelector("#sex-0"));
        //  with xpath =>  //input[@value='Male']
        gender.click();


        /* 1) =>  WebElement experience=driver.findElement(By.cssSelector("#exp-2"));
                experience.click();
        */
        List<WebElement> list=driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(24)>input"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
            Thread.sleep(500);
        }

        WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("05.05.2021");

        WebElement profession=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        profession.click();

        List<WebElement> tools=driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));

        for (int i = 0; i < tools.size(); i++) {
            tools.get(i).click();
            Thread.sleep(500);
        }

        //select class 1
        WebElement element=driver.findElement(By.cssSelector("#continents"));
        Select slc=new Select(element);
        slc.selectByVisibleText("North America");

        //select class 2
        element=driver.findElement(By.cssSelector("#selenium_commands"));
        slc=new Select(element);
        slc.selectByIndex(0);
        slc.selectByIndex(1);
    }
}

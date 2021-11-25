package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _5_selectClasses {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement cookies=driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)"));
        cookies.click();

        Thread.sleep(500);
        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Noam");

        WebElement surname=driver.findElement(By.name("lastname"));
        surname.sendKeys("Chomsky");

        WebElement gender=driver.findElement(By.cssSelector("input[value=Male]"));
        gender.click();

        List<WebElement> list=driver.findElements(By.xpath("(//div[contains(@style,'background-color: rgba')])[15]/input"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
            Thread.sleep(500);
        }

        WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("06.05.2021");

        WebElement profession=driver.findElement(By.id("profession-0"));
        profession.click();

        list=driver.findElements(By.xpath("(//div[contains(@style,'background-color: rgba')])[23]/input"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
            Thread.sleep(500);
        }

        WebElement continent=driver.findElement(By.id("continents"));
        Select slc=new Select(continent);
        slc.selectByVisibleText("Australia");

        WebElement commands=driver.findElement(By.id("selenium_commands"));
        Select s=new Select(commands);
        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);
    }
}

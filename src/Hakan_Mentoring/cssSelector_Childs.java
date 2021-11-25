package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class cssSelector_Childs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        Thread.sleep(1000);

//        WebElement cookies=driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)"));
//        cookies.click();

        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("Tugba");

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Albas");

        WebElement gender=driver.findElement(By.cssSelector("input[value='Female']"));
        gender.click();

        List<WebElement> years=driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(24)>input"));
        for (int i = 0; i < years.size(); i++) {
            years.get(i).click();
            Thread.sleep(2000);
        }
        WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("21.05.2021");

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

package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _7_actionClass_Drag_and_Drop_Method {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //capitals
        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement stockholm=driver.findElement(By.id("box2"));
        WebElement washington=driver.findElement(By.id("box3"));
        WebElement copenhagen=driver.findElement(By.id("box4"));
        WebElement seoul=driver.findElement(By.id("box5"));
        WebElement rome=driver.findElement(By.id("box6"));
        WebElement madrid=driver.findElement(By.id("box7"));

        //countries
        WebElement italy=driver.findElement(By.id("box106"));
        WebElement spain=driver.findElement(By.id("box107"));
        WebElement norway=driver.findElement(By.id("box101"));
        WebElement denmark=driver.findElement(By.id("box104"));
        WebElement southKorea=driver.findElement(By.id("box105"));
        WebElement sweden=driver.findElement(By.id("box102"));
        WebElement unitedStates=driver.findElement(By.id("box103"));

        Actions act=new Actions(driver);

        act.dragAndDrop(oslo,norway).build().perform();
        act.dragAndDrop(stockholm,sweden).build().perform();
        act.dragAndDrop(washington,unitedStates).build().perform();
        act.dragAndDrop(copenhagen,denmark).build().perform();
        act.dragAndDrop(seoul,southKorea).build().perform();
        act.dragAndDrop(rome,italy).build().perform();
        act.dragAndDrop(madrid,spain).build().perform();


    }
}

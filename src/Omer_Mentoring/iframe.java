package Omer_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class iframe {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        // sayfada 2 adet #name HTML var fakat bize her zaman ilkini verdiği için direkt böyle kullanabiliriz
        // CSS selectorde iID arıyorsak başında # olacak
        driver.findElement(By.cssSelector("#name")).sendKeys("Hello Main Page");

        //senaryo: Framede java bul ve seçtir

        driver.switchTo().frame("frm1"); // framee girdik

        WebElement course=driver.findElement(By.id("course"));
        Select menu=new Select(course);
        menu.selectByValue("java");

        for (int i = 1; i < 5; i++) {
            menu.selectByIndex(i);
            Thread.sleep(1500);
        }

        // bu frameden çıkmak için yani default hale dönmek için
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm2"); // frame2 girdik

        driver.findElement(By.id("firstName")).sendKeys("Tugba");
        driver.findElement(By.id("lastName")).sendKeys("Albas");

        List<WebElement> list= driver.findElements(By.name("language"));

        //foreach ile

//        for (WebElement k: list){
//            k.click();
//            Thread.sleep(1500);
//            k.click();
//        }

        // for loop ile
        List<WebElement> languages=driver.findElements(By.cssSelector("input.bcCheckBox"));

        for (int i = 0; i < languages.size(); i++) {
            languages.get(i).click();
            Thread.sleep(1500);
        }

        driver.switchTo().defaultContent(); // bu frameden çıktık
        driver.switchTo().frame("frm3"); // frame3 e girdik
        driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Hello Frame 3");

        // Frame3te olduğumuz için [2] yazmama gerek yok
        Thread.sleep(1500);
        driver.quit();








    }
}

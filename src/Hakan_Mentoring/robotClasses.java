package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class robotClasses {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //WebElement fileUpload= driver.findElement(By.id("imagesrc")); // input olduğu için tıklama yapmadı bazen böyle olabilir
        // böyle zamanlarda bir üste çıkarız

        WebElement fileUpload= driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-6'])[2]"));
        fileUpload.click();

//        java-selenium-clipboard  burda CTRL+C yaptık hafızada şu an
        StringSelection stringSelection=new StringSelection("\"C:\\Users\\Tuba\\Desktop\\Frame-Waits.PNG\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        // burda da CTRL+V yapıyoruz
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        Thread.sleep(1000);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);
        driver.quit();




    }
}

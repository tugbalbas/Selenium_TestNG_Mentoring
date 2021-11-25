package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_alertTypes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");

        WebElement alertOk=driver.findElement(By.cssSelector(".btn.btn-danger"));
        alertOk.click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        //TODO==> Basit uyarı (Simple warning)

        WebElement okCancel=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        okCancel.click();


        //todo=> get alert message
        String message1=driver.switchTo().alert().getText();
        System.out.println(message1);


        //TODO==> Teyit Uyarıları (Confirmation warning)

        WebElement confirmBox=driver.findElement(By.cssSelector(".btn-primary"));
        confirmBox.click();

        Thread.sleep(1000);

        driver.switchTo().alert().dismiss();

        //TODO==> input bekleyen uyarılar (Input needed warning)
        WebElement alertTextbox=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        alertTextbox.click();

        driver.findElement(By.cssSelector(".btn.btn-info")).click();

        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("Hakan");
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(1000);


        String message=driver.findElement(By.xpath("//p[@id='demo1']")).getText();

        System.out.println("My message= "+ message);
    }
}

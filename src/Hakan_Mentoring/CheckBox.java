package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");


//        WebElement c1=driver.findElement(By.xpath("//input[@value='checkbox1']"));
//        c1.click();

        // checkBoxlara sırasıyla tek tek tıklamak istiyoruz. birden fazla old için list alıyoruz
        List<WebElement> listCheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < listCheckBox.size(); i++) {
            listCheckBox.get(i).click();
            Thread.sleep(3000);
        }

    }
}

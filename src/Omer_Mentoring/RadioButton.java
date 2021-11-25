package Omer_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");

//        WebElement radioBtn1=driver.findElement(By.id("vfb-7-1"));
//        radioBtn1.click();
//
//        WebElement radioBtn2=driver.findElement(By.cssSelector("input[value='Option 2']"));
//        radioBtn2.click();


        // radio buttonlarına sırasıyla tek tek tıklamak istiyoruz. birden fazla old için list alıyoruz
        List<WebElement> listRadioBtn=driver.findElements(By.xpath("//input[@type='radio']"));
        for (int i = 0; i < listRadioBtn.size(); i++) {
            listRadioBtn.get(i).click();
            Thread.sleep(2000);
        }




    }
}

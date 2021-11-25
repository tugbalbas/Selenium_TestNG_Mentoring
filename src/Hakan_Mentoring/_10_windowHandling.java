package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _10_windowHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/popup.php");

        //My first window
        String firstWin=driver.getWindowHandle();

        String firstWinUrl=driver.getCurrentUrl();
        System.out.println("My first window= "+ firstWinUrl);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        //I used "Set" for window change
        Set<String> windowAllWindows=driver.getWindowHandles();
        for (String window:windowAllWindows) {
            // I wrote the next window in parentheses of window
            driver.switchTo().window(window);
        }
        driver.findElement(By.name("emailid")).sendKeys("hakan@gmail.com");

        driver.findElement(By.name("btnLogin")).click();

        System.out.println("2. window's Url"+ driver.getCurrentUrl());

        //I used close to be able to close the window
        driver.close();

        driver.switchTo().window(firstWin);
        System.out.println("Current page'S URL= "+driver.getCurrentUrl());

        //Quit the system
        driver.quit();
    }
}

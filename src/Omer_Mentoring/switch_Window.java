package Omer_Mentoring;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class switch_Window {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/popup.php");

        //ilk penceremi string olarak kaydetmek istiyorum

        String firstWin= driver.getWindowHandle();

        // anlık URL
        String firstWinUrl= driver.getCurrentUrl();

        System.out.println("ilk penceremin URL'i"+ firstWinUrl);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        // driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("tb@gmail.com"); bunu aşağıya geçiricez
        // bu adımda "NoSuchElementException" hatası verdi / yeni sekme olduğu için

        /* o yüzden anlık sayfayıı değiştirmemiz gerekiyor
        sayfalar arasıj geçiş yaparken Set<String> kullanıyoruz
         */

        Set<String>windowAllWindows=driver.getWindowHandles(); // handles oldu

        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("tb@gmail.com");
        // yukardaki gibi iki sayfa olduğunda sayfalar arasında switchTo yapıp ondan sonra elemente bilgiyi gönderiyoruz


        driver.findElement(By.cssSelector("input[value='Submit']")).click();

        System.out.println("2. pencerenin URL'i " + driver.getCurrentUrl());

        // bu sayfayı kapatmak ve mevcut olan sayfaya gelmek istiyorum

        Thread.sleep(2000);
        driver.close();

        // System.out.println(driver.getCurrentUrl()); // "NoSuchWindowException" hatası verdi şu an pencere yok
        // driver kapattığımız pencerede kaldı

        // ilk pencereye gidebilmek için
        driver.switchTo().window(firstWin);

        System.out.println("son pencere: " + driver.getCurrentUrl());

        // ilk pencereye döndü mü test edelim
        Assert.assertEquals(firstWinUrl,driver.getCurrentUrl());

        System.out.println("ilk pencereye başarıyla geçilmiştir");

        Thread.sleep(2000);
        driver.quit();




    }

}


package Omer_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


class _1_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();

//      WebElement searchArea = driver.findElement(By.cssSelector("#search > input")).sendKeys("imac"); bu şekilde yapamıyoruz

        WebElement searchArea =  driver.findElement(By.cssSelector("#search > input"));
          searchArea.sendKeys("imac");
         // searchArea.sendKeys(Keys.ENTER); böyle enterlayabiliriz veya

        WebElement searchButton = driver.findElement(By.cssSelector(".fa-search"));
        searchButton.click(); // veya böyle aratırız

        // URL testi yapalım
        String urlExpected = "http://tutorialsninja.com/demo/index.php?route=product/search&search=imac";
        Assert.assertEquals(urlExpected,driver.getCurrentUrl());
        System.out.println("Url testi başarıyla geçmiştir..");

        // title ını test edelim
        System.out.println(driver.getTitle()); // Search - imac
        String expectedTitle = "Search - imac";
        Assert.assertEquals(expectedTitle,driver.getTitle());

        // sepete ekle
        driver.findElement(By.cssSelector("button[onclick*=cart]")).click();

        Thread.sleep(2000);
        WebElement successMessage = driver.findElement(By.cssSelector("div.alert-dismissible"));
        String myMessage = successMessage.getText(); // bu kodun içerisinde texti consola yazdır
        String expectedMessage= "Success: You have added iMac to your shopping cart!\n" +
                "×";
        //Assert.assertEquals(expectedMessage,myMessage);
    /*
    2. yol
     */

        Assert.assertTrue(myMessage.contains("Success:")); // Success varsa test geçsin

        driver.findElement(By.cssSelector("a[title='Shopping Cart']")).click();

        WebElement price = driver.findElement(By.cssSelector("div.table-responsive>table>tbody>tr>:nth-child(6)"));

        String Actualprice = price.getText();
        String expectedPrice = "$122.00";

        Assert.assertEquals(expectedPrice,Actualprice);

        driver.findElement(By.cssSelector("div.table-responsive>table>tbody>tr>:nth-child(4)>div>span>:nth-child(2)")).click();


        Thread.sleep(2000);
        WebElement emptyMessage = driver.findElement(By.cssSelector("#cart-total"));

        System.out.println(emptyMessage.getText());

        Assert.assertTrue(emptyMessage.getText().contains("$0.00"));
        System.out.println("Kartınız başarıyla boşaltılmıştır...");

        Thread.sleep(2000);
        driver.quit();








    }
}

// CSS'DE TEXT ALAMIYORUZ! TEXTLERİ XPATH İLE ALIYORUZ!
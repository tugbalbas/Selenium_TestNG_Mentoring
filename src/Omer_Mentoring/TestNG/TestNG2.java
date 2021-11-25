package Omer_Mentoring.TestNG;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNG2 {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    @BeforeClass

    public void Setup() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
//    @Test(priority = 1)
    public void urlTest(){
//actual,expected

        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");
        System.out.println("Url testi geçmiştir.");
    }

//    @Test(priority = 2)
    public void Test1() throws InterruptedException {

        Actions actions = new Actions(driver);

        List<WebElement> menuBar = driver.findElements(By.cssSelector("ul.sf-menu>li"));

        actions.moveToElement(menuBar.get(0)).perform();

        WebElement causalDress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));

        causalDress.click();

        driver.findElement(By.cssSelector("i.icon-th-list")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a.button.lnk_view.btn.btn-default")).click();

        List<WebElement> images = driver.findElements(By.cssSelector("#thumbs_list_frame>li"));

        for (int i = 0; i <images.size() ; i++) {
            actions.moveToElement(images.get(i)).perform();
            Thread.sleep(1000);
        }


        driver.findElement(By.cssSelector("a#wishlist_button")).click();

        WebElement loginMessage = driver.findElement(By.xpath("//p[text()='You must be logged in to manage your wishlist.']"));

        wait.until(ExpectedConditions.visibilityOf(loginMessage));

        Assert.assertEquals(loginMessage.getText(),"You must be logged in to manage your wishlist.");
        System.out.println(loginMessage.getText());
    }

    @AfterClass
    public void afterClass() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }



}

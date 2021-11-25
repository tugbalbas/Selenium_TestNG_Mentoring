package Omer_Mentoring.TestNG;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNG {

    public static WebDriver driver; // webdriver ı diğer metodların içinde rahat rahat kullanabilmek için

    /*
priority kullandıgımızda  testler alfabetik okunmaz, koydugumuz sıraya göre çalışmaya başlar.
 */

    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

   // @Test (priority = 1)
    public void login(){
        driver.findElement(By.cssSelector(".login")).click(); // classname "." ile
        driver.findElement(By.cssSelector("#email_create")).sendKeys("omeroz@gmail.com"); // id "#" ile
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("omer");
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("ozdemir");

    }

    //@Test (priority = 2 ,enabled = false)//bu testi görmezden gel.
    public void contactUs(){
        driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
        Select slc=new Select(driver.findElement(By.cssSelector("#id_contact")));
        slc.selectByValue("1");

        driver.findElement(By.cssSelector("#email")).sendKeys("omeroz@gmail.com");

    }

  //  @Test (priority = 3,enabled = false)
    public void search(){

        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();

        driver.findElement(By.cssSelector(".icon-th-list")).click();

        // birden fazla olduğu için listeye atıyoruz
        List<WebElement> listofDress=driver.findElements(By.cssSelector("a[title='Add to cart']"));

        int i=(int )(Math.random()*(listofDress.size()));
        listofDress.get(i).click();


    }






}

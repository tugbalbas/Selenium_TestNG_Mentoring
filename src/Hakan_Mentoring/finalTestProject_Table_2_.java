package Hakan_Mentoring;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class finalTestProject_Table_2_ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Dell");

        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement table=driver.findElement(By.cssSelector(".wikitable.sortable"));

        js.executeScript("arguments[0].scrollIntoView();",table);


        // By.xpath("//table[contains(@class,'tablesorter')]/tbody/tr")
        List<WebElement> lines=driver.findElements(By.cssSelector(".jquery-tablesorter>tbody>tr"));
        for (int i = 0; i < lines.size(); i++) {

            System.out.println(lines.get(i).getText()+"\n");
        }

        System.out.println("-----------------------------------------------------------------------------------");

        WebElement getSonicwall=driver.findElement(By.xpath("((//table[contains(@class,'tablesorter')]/tbody/tr)[9]"));
        System.out.println(getSonicwall.getText());

        System.out.println("-----------------------------------------------------------------------------------");

        //By.cssSelector("table.jquery-tablesorter>tbody>tr:nth-of-type(5)>td:nth-of-type(2)")
        WebElement getBoomisCompanyNotes=driver.findElement(By.cssSelector("table.jquery-tablesorter>tbody>tr:nth-of-type(5)>td:nth-of-type(2)"));
        System.out.println("Booni'S company notes = " + getBoomisCompanyNotes.getText());

        Assert.assertEquals("Cloud integration leader",getBoomisCompanyNotes.getText());

        Assert.assertTrue(getBoomisCompanyNotes.getText().contains("integration leader"));

        System.out.println("Test passed successfully");
    }
}

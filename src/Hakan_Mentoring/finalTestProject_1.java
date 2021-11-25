package Hakan_Mentoring;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finalTestProject_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");

        WebElement myAccount=driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();

        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();

        WebElement firstname=driver.findElement(By.cssSelector("#input-firstname"));
        firstname.sendKeys("Hakan");

        WebElement lastname=driver.findElement(By.cssSelector("#input-lastname"));
        lastname.sendKeys("Demir");

        WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
        email.sendKeys("hd11@gmail.com");

        WebElement tel=driver.findElement(By.cssSelector("input[placeholder='Telephone']"));
        tel.sendKeys("015252486777");

        WebElement password=driver.findElement(By.cssSelector("#input-password"));
        password.sendKeys("12345");

        String Pass="12345";
        WebElement confirmPass=driver.findElement(By.cssSelector("#input-confirm"));
        confirmPass.sendKeys(Pass);

        WebElement privacyPolicy=driver.findElement(By.cssSelector("input[type='checkbox']"));
        privacyPolicy.click();

        WebElement submitBtn=driver.findElement(By.cssSelector("input[value='Continue']"));
        submitBtn.click();

        //todo=>  TESTING THE EXPECTED MESSAGE
        String expectedMessage="Your Account Has Been Created!";
        Assert.assertEquals(expectedMessage,driver.getTitle());

        System.out.println("Your account has been created succesfully.");
    }
}

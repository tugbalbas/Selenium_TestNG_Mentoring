package Burak_Mentoring.Class_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/211433721942349");
        driver.manage().window().maximize();

        //Choose a cake
        WebElement cikolata = driver.findElement(By.xpath("//label[@id='label_input_20_0']"));
        cikolata.click();

        WebElement konfeti = driver.findElement(By.xpath("//label[@id='label_input_20_5']"));
        konfeti.click();

        WebElement other_1 = driver.findElement(By.xpath("(//input[@name='q20_chooseA20[other]'])[2]"));
        other_1.click();
        other_1.sendKeys("Kiwi");

        //Choose the Filling
        WebElement  filling = driver.findElement(By.xpath("//label[@id='label_input_21_1']"));
        filling.click();

        //Shape
        WebElement shape = driver.findElement(By.xpath("//label[@id='label_input_24_3']"));
        shape.click();

        //icing
        WebElement icing = driver.findElement(By.xpath("//label[@id='label_input_22_1']"));
        icing.click();

        //flavour
        WebElement flavour = driver.findElement(By.xpath("//label[@id='label_input_23_3']"));
        flavour.click();

        //allergies
        WebElement allergie = driver.findElement(By.xpath("(//textarea)[1]"));
        allergie.sendKeys("Nuts, Polen, Eggplant");

        //request
        WebElement request = driver.findElement(By.xpath("(//textarea)[2]"));
        request.sendKeys("Please be quick...");

        //firstname and lastname
        driver.findElement(By.xpath("//input[@id='first_3']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@id='last_3']")).sendKeys("Türkmen");

        //Email
        driver.findElement(By.xpath("//input[@id='input_4']")).sendKeys("brk@brk.com");

        //PhoneNumber
        driver.findElement(By.xpath("//input[@id='input_6_area']")).sendKeys("+1");
        driver.findElement(By.xpath("//input[@id='input_6_phone']")).sendKeys("12312341212");

        //submit
        driver.findElement(By.xpath("//button[@id='input_2']")).click();

        //sucsess
        WebElement sucsess = driver.findElement(By.xpath("//h1"));
        System.out.println(sucsess.getText());
    }
}

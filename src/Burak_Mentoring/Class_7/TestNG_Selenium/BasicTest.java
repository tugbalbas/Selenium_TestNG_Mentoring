package Burak_Mentoring.Class_7.TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest extends BaseDriver{

    @Test
    public void Log_in(){

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }

    @Test (dependsOnMethods = "Log_in")
    public void UserCheck(){
        driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
        driver.findElement(By.xpath("//input[@id='searchDirectory_emp_name_empName']")).sendKeys("Linda Jane Anderson");
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

        WebElement successMessage= driver.findElement(By.xpath("//b[contains(text(), 'Linda Jane Anderson')]"));
        Assert.assertTrue(successMessage.getText().contains("Linda Jane Anderson"));
    }



}

package Burak_Mentoring.Class_8;

import Burak_Mentoring.Class_7.TestNG_Selenium.BaseDriver;
import Burak_Mentoring.Class_7.TestNG_Selenium.BaseDriver2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/*

    www.amazon.com websitesine gidin.

    Today's deal'a tıkla.

    200 Dolar or Above a tıkla

    3. sıradaki ürüne tıkla

    20 Pint-2019 DOE (Previous 30 Pint) butonuna tıkla

    sağ üstte 169 dolar yazdığını test et.

    See similar Items buttonuna tıkla

    4. sıradakine tıkla.

    Sağ üstte $249.99 yazdığını test et

    Soldaki All butonuna tıklatıp katagorileri aç

    Electronics katagorisine tıkla

    Headphones'a tıkla.

    1. ürüne tıkla

    sağ üstteki fiyatın $23.99 olduğunu test et.

     */
public class AmazonTest extends BaseDriver2 {

    @Test
    void firstItem(){

        driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(), '$200 & Above')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'mattresses')]")).click();
        driver.findElement(By.xpath("//button[@id='a-autoid-14-announce']")).click();


    }

}

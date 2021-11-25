package Omer_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class _2_cssSelector {
    public static void main(String[] args) {
/*
void assertEquals(int actual, int expected)
 */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.de/");





/*

Css Selector için classlar nokta ile bulunur.
..gNO89b >>>>> TÜM kodlarla classı gNO89b olan değeri arıyor.
input.gNO89b >>>>> etiketi "input" olan kodların arasında gNO89b olan değeri arıyor.

a[class=lh87ke]

.gLFyf.gsfi

id  - başına # konulur.

#tophf
div[id=tophf]

child a inme:   > işareti ile

div#tophf > input

html>body>div>div

nth-of -type  >>> sırasına göre eleman bulma

html>body>div>:nth-of-type(2)





:nth - child()

html>body>div>:nth-child(3)


html>body>:nth-child(2)>:nth-of-type(3)>dialog>div.spch>style


Contains
[class*='spch-']



ul.catalog-view>li






         */




    }
}

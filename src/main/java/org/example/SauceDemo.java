package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
    public static void main(String[] args) {

        //accessing the website
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //entering full window screen on browser

          //locating elements on the website
          driver.findElement(By.id("user-name"));
          driver.findElement(By.name("password"));
          driver.findElement(By.className("input_error"));

          //Filling password field using xpath expression
//       WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//       element.sendKeys("Password");

        //Filling second div element using css locator
        //driver.findElement(By.cssSelector(".form_group:nth-of-type(2) .input_error.form_input")).sendKeys("aaa");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("error_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

    }
}
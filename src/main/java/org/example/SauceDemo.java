package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

          driver.findElement(By.id("user-name"));
          driver.findElement(By.name("password"));
          driver.findElement(By.className("input_error"));
//
//        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        element.sendKeys("Password");

        //driver.findElement(By.cssSelector(".form_group:nth-of-type(2) .input_error.form_input")).sendKeys("aaa");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("error_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

    }
}
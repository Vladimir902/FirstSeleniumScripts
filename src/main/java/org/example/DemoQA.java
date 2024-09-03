package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Vladimir");
        driver.findElement(By.id("lastName")).sendKeys("Malakovski");
        driver.findElement(By.id("userEmail")).sendKeys("vladicabt@hotmail.com");

        /// Locate the "Male" radio button label using the for attribute
        WebElement maleGenderLabel = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));

        // Click on the "Male" radio button label
        maleGenderLabel.click();

        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0123456789");


        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));

        // Send keys to the Subjects input field
        subjectsInput.sendKeys("Math");
        subjectsInput.sendKeys(Keys.ENTER);

        //scroll down to on the page when you find specific element
        WebElement element = driver.findElement(By.id("currentAddress"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        //clicking on the third checkbox and entering home address in Address field
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("Kire Kostadinovski 17");


    }
}

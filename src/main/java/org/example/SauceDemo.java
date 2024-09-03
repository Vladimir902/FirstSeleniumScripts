package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement credentialsDiv = driver.findElement(By.cssSelector("div#login_credentials.login_credentials[data-test='login-credentials']"));
        // Extract the text content of the element
        String credentialsText = credentialsDiv.getText();
        // Check if the extracted text contains "error_user"
        if (credentialsText.contains("error_user")) {
            System.out.println("Found text: error_user");
        } else {
            System.out.println("Text 'error_user' not found.");
        }

        WebElement passwordDiv = driver.findElement(By.xpath("//div[@class='login_password' and @data-test='login-password' and contains(text(), 'secret_sauce')]"));
        String passwordText = passwordDiv.getText();
        System.out.println("Extracted Text: " + passwordText);


        /*Elaborating of the arrangement of the locators:
        -First I would use id locator because it is the fastest locator and unique
        -If I can't use id locator I would use cssSelector as the fastest option for more
        complicated queries
        -I would use className locator if I need to find multiple elements that are in the
        same part of the class
        -If I can't find the locator I would you xPath for the most complex queries

         */
    }
}
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.saucedemo.com/");

            System.out.println("URL before login: " + driver.getCurrentUrl());

            driver.findElement(By.id("user-name"))
                  .sendKeys("standard_user");

            driver.findElement(By.id("password"))
                  .sendKeys("secret_sauce");

            driver.findElement(By.id("login-button"))
                  .click();

            System.out.println("URL after login: " + driver.getCurrentUrl());

            System.out.println("Login Successful");

        } finally {
            driver.quit();
        }
    }
}

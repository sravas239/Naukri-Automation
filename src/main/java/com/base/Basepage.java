package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Basepage {
    protected WebDriver driver;
 
    @BeforeMethod
    public void setUp() {
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login");
    }
 
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

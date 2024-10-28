package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Loginpage {
	private WebDriver driver;
	
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

 
  private By Login =By.xpath("//div[@class='nI-gNb-header__placeholder']");
    private By emailField = By.xpath("//input[@id='usernameField']");
    private By passwordField = By.xpath("//input[@id='passwordField']");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");
 
  
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }
 
    public void Login() {
        driver.findElement(Login).click();
    }
    
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
 
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
 
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
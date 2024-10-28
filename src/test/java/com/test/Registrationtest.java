package com.test;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.pom.Registration;
import com.utilits.Extentutilits;
 
public class Registrationtest {
 
    private WebDriver driver;
    private Registration registrationPage;
    private ExtentReports extent;
	 private ExtentTest test;
 
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        extent = Extentutilits.getExtentReports();
        
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
 
       
        registrationPage = new Registration(driver);
    }
 
    @Test
    public void testRegistrationWithResumeUpload() {
        registrationPage.enterName("Sravani");
        registrationPage.enterEmail("sravani.guduru@gmail.com");
        registrationPage.enterMobile("8421765423");
        registrationPage.enterPassword("Test@123");
        registrationPage.selectWorkStatusExperienced();
        registrationPage.uploadResume("C:\\Users\\DELL\\Downloads\\resume.doc");
        registrationPage.clickRegisterButton();
        
 test =Extentutilits.createTest("Naukri Registration Test");
        
       
 Extentutilits.flushReports();
    }
 
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
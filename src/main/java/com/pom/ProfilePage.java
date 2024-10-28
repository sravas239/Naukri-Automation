package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;

    // Locators
    private By profileUpdateButton = By.id("profileUpdate"); // Update with actual ID
    private By nameField = By.id("name"); // Update with actual ID
    private By emailField = By.id("email"); // Update with actual ID
    private By uploadResumeButton = By.id("uploadResume"); // Update with actual ID
    private By saveButton = By.id("saveButton"); // Update with actual ID

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void updateProfile(String name, String email, String resumePath) {
        driver.findElement(profileUpdateButton).click();
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(uploadResumeButton).sendKeys(resumePath);
        driver.findElement(saveButton).click();
    }
}


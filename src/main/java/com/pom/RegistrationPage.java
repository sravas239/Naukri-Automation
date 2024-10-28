package com.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	

	private By nameField = By.id("name");
	private By emailField = By.id("email");
	private By passwordField = By.id("password");
	private By mobileField = By.id("mobile");
	private By workstatusexpeienced = By
			.cssSelector("img[src='//static.naukimg.com/s/7/104/assets/images/briefcase.bdc5fadf.svg']");
	private By resumeUploadButton = By.cssSelector(
			"#root > div > div > div.right-container > div > div > div.formWrapper > form > div.formElems > div.resume-upload-container.Narrow_Widget > div.resume-upload > div:nth-child(1) > button"); // Resume
																																																			// upload
																																																			// button
	private By hiddenFileInput = By.cssSelector("['uploadResume resman-btn-primary resman-btn-small']");
	private By registerButton = By.cssSelector("button[type='submit']");

	private By experiencedOption = By.cssSelector(
			"#root > div > div > div.right-container > div > div > div.formWrapper > form > div.formElems > div.formField.userType > div.radioWrap > div.focusable.optionWrap.selected > div.textWrap > p");

	
	
	public RegistrationPage(WebDriver driver) {
		
	this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    PageFactory.initElements(driver, this);
}

	public void enterName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void enterMobile(String mobile) {
		driver.findElement(mobileField).sendKeys(mobile);
	}

	public void selectWorkStatusExperienced() {
		wait.until(ExpectedConditions.elementToBeClickable(workstatusexpeienced)).click();
	}
	
	public void experiencedOption() {
		wait.until(ExpectedConditions.elementToBeClickable(experiencedOption)).click();
	}

	public void uploadResume(String filePath) {
		wait.until(ExpectedConditions.elementToBeClickable(resumeUploadButton)).click();
		((WebElement) hiddenFileInput).sendKeys(filePath);
	}

	public void clickRegisterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
	}

	
}

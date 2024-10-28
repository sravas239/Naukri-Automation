package com.pom;


	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	 
	import java.time.Duration;
	 
	public class Registration {
	 
	    private WebDriver driver;
	    private WebDriverWait wait;
	 
	    // Constructor
	    public Registration(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
	        PageFactory.initElements(driver, this); 
	    }
	 
	   
	    @FindBy(id = "name") 
	    private WebElement nameField;
	 
	    @FindBy(id = "email") 
	    private WebElement emailField;
	 
	    @FindBy(id = "password") 
	    private WebElement passwordField;
	 
	    @FindBy(id = "mobile") 
	    private WebElement mobileField;
	 
	 
	    @FindBy(css = "img[src='//static.naukimg.com/s/7/104/assets/images/briefcase.bdc5fadf.svg']") 
	    private WebElement workStatusExperienced;
	 
	    @FindBy(css = "#root > div > div > div.right-container > div > div > div.formWrapper > form > div.formElems > div.resume-upload-container.Narrow_Widget > div.resume-upload > div:nth-child(1) > button") 
	    private WebElement resumeUploadButton;
	 
	    @FindBy(css = "button[class='uploadResume resman-btn-primary resman-btn-small']") 
	    private WebElement hiddenFileInput;
	 
	    @FindBy(css = "button[type='submit']") 
	    private WebElement registerButton;
	 
	  
	 
	    public void enterName(String name) {
	        wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(name);
	    }
	 
	    public void enterEmail(String email) {
	        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
	    }
	 
	    public void enterMobile(String mobile) {
	        wait.until(ExpectedConditions.visibilityOf(mobileField)).sendKeys(mobile);
	    }
	 
	    public void enterPassword(String password) {
	        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
	    }
	 
	    

	 
	    public void selectWorkStatusExperienced() {
	        wait.until(ExpectedConditions.elementToBeClickable(workStatusExperienced)).click();
	    }
	 
	    public void uploadResume(String filePath) {
	        wait.until(ExpectedConditions.elementToBeClickable(resumeUploadButton)).click();
	        hiddenFileInput.sendKeys(filePath); 
	    }
	 
	    public void clickRegisterButton() {
	        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
	    }
	}



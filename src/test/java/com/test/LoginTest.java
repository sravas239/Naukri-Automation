package com.test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basepage;
import com.pom.Loginpage;


 
public class LoginTest extends Basepage {
 
    @Test(dataProvider = "loginData")
    public void loginUser(String email, String password) {
      
    	Loginpage loginPage = new Loginpage(driver);
        
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        
     
    }
 
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            { "john@example.com", "pass123" },

        };
    }
}
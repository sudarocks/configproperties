package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;



public class LeafTapsLogin extends LeafTapsBaseClass {
	
	public LeafTapsLogin  enterUsername() throws InterruptedException {
		System.out.println(driver);
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(obj.getProperty("Username"));
//		LoginPage lp = new LoginPage();
//		return lp;
		return this;
	}
	
	public LeafTapsLogin enterPassword() {
		driver.findElement(By.id("password")).sendKeys(obj.getProperty("Password"));
		return this;

	}
	
	public LeafTapsWelcome clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
//	    WelcomePage wp = new WelcomePage();
//	    return wp;
		
		return new LeafTapsWelcome();
	}

}

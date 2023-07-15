package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;


public class LeafTapsWelcome extends LeafTapsBaseClass {
	public LeafTapsWelcome verifyWelcomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful");
		}
		return this;

	}
	
	public LeafTapsHome clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new LeafTapsHome ();

	}

}

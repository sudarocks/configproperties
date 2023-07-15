package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;



public class LeafTapsCreateLead extends LeafTapsBaseClass  {

	
	public LeafTapsCreateLead enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;

	}
public LeafTapsCreateLead enterFirstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
	return this;

	}
public LeafTapsCreateLead enterLastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	return this;

}
public LeafTapsViewLead clickSubmitButton() {
	driver.findElement(By.name("submitButton")).click();
	return new LeafTapsViewLead();

}
	
}

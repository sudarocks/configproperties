package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;



public class LeafTapsViewLead extends LeafTapsBaseClass {
	
	public LeafTapsViewLead verifyViewLeadsPage() {
    	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return this;
    	
   	}

}

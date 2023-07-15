package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;



public class LeafTapsEditLead extends LeafTapsBaseClass {
	
	public LeafTapsEditLead clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new LeafTapsEditLead();

}
}


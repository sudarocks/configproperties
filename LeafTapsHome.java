package com.bootcamp.framework.testcases;

import org.openqa.selenium.By;

import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;


public class LeafTapsHome extends LeafTapsBaseClass {
	public LeafTapsHome  clickLeadButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeafTapsHome();

}
}


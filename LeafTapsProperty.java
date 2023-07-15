package com.framework.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafTapsProperty {
	
	public static void main(String[] args) throws IOException {
		
	FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	Properties obj = new Properties();
	obj.load(fis);
	//String property = obj.getProperty("Username");
	//String propertyy = obj.getProperty("Password");
	//System.out.println(property); 
	//System.out.println(propertyy);
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(obj.getProperty("Username"));
	driver.findElement(By.id("password")).sendKeys(obj.getProperty("Password"));
	driver.findElement(By.className("decorativeSubmit")).click();

	
	
	
	
}
	
}


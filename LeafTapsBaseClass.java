package com.framework.LeafTapsBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LeafTapsBaseClass {
	
	
	 public static ChromeDriver driver;
	 public static Properties obj;
	    
	    @BeforeMethod
		public void preCondition() throws IOException {
	    	FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	    	 obj = new Properties();
	    	obj.load(fis);
	    	
			 driver = new ChromeDriver();
	         System.out.println(driver);
	         driver.get("http://leaftaps.com/opentaps/control/main");
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

		}
		
		@AfterMethod
		public void postCondition() {
		    //driver.close();
		}

}

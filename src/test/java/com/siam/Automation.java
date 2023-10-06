package com.siam;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automation extends BaseDriver {
String url = "https://www.tutorialrepublic.com/";
	
	//method for opening this url	
	@Test
	public void openUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000); // 1000 = 1s
		
		driver.findElement(By.xpath("//a[contains(text(),'HTML5')]")).click(); //finding element and click
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'SQL')]")).click(); //finding element and click
		Thread.sleep(10000);
	}
}

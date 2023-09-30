package com.qa.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.BaseClass.Test_Class;

public class Order_Place extends Test_Class {
	
	public void orderconfirmationPage() throws Exception {
		
		WebElement ClickonPlacebtn=driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span"));
		Thread.sleep(10);
		//ClickonPlacebtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ClickonPlacebtn);
		
		
		
		
	}
	
	
	

}

package com.qa.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseClass.Test_Class;

public class AddToCart extends Test_Class{
	

	public void addtocart() throws Exception {
	WebElement size=driver.findElement(By.id("option-label-size-143-item-168"));
	size.click();
	
	WebElement colour=driver.findElement(By.id("option-label-color-93-item-53"));
	colour.click();
	WebElement qty=driver.findElement(By.id("qty"));
	qty.clear();
	qty.sendKeys("3");
		
	WebElement Addtocartbtn=driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
	Addtocartbtn.click();
		
	WebElement Addtocartbtnceckout=driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
	Addtocartbtnceckout.click();	
	
	WebElement proceedcheckout=driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
	Thread.sleep(20);
	proceedcheckout.click();
	}
	
	
}

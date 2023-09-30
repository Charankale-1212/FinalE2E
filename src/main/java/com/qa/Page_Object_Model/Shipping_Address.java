package com.qa.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.BaseClass.Test_Class;

public class Shipping_Address extends Test_Class{

	public void shippingaddress() {
		
		/*WebElement customeremail=driver.findElement(By.id("customer-email"));
		customeremail.sendKeys("charan12@yopmail.com");
		
		WebElement Firstname=driver.findElement(By.id("XNSXXTUt"));
		Firstname.sendKeys("charan");
		WebElement Lasttname=driver.findElement(By.id("HBV3C98"));
		Firstname.sendKeys("kale");
		WebElement Address=driver.findElement(By.id("PKUD6PV"));
		Address.sendKeys("G102");
		WebElement city=driver.findElement(By.id("CF4I4BX"));
		city.sendKeys("pune");
		WebElement country=driver.findElement(By.id("VTREPDB"));
		country.click();
		Select selectcountry=new Select(country);
		selectcountry.selectByVisibleText("India");
		
		
		WebElement Zipcode=driver.findElement(By.id("ETJ7RQ3"));
		Zipcode.click();
		WebElement state=driver.findElement(By.id("ES17P6R"));
		state.click();
		Select selectstate=new Select(state);
		selectstate.selectByVisibleText("maharashtra");
		WebElement phonenumber=driver.findElement(By.id("ANXK6TS"));
		phonenumber.sendKeys("7656768765");
		
		
		
		WebElement Shippingmethod=driver.findElement(By.xpath("//input[@name='ko_unique_4']"));
		Shippingmethod.click();
		*/
		
		WebElement Nextbtn=driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button"));
		Nextbtn.click();
		
		
		
	}
	
	
	
}

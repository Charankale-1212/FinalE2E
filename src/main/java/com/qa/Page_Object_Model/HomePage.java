package com.qa.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseClass.Test_Class;

public class HomePage extends Test_Class {

	public void homeage() {
		
		WebElement Men=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		Men.click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
		
	}
	
	
	
}

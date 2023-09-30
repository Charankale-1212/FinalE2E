package com.qa.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseClass.Test_Class;

public class LoginPage extends Test_Class  {
	
	public void Signup() {

	
	WebElement SignIn=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
	SignIn.click();
	WebElement email=driver.findElement(By.name("login[username]"));
	email.sendKeys(prop.getProperty("Email"));
	WebElement pwd=driver.findElement(By.name("login[password]"));
	pwd.sendKeys(prop.getProperty("Password"));
    driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
    
}

}
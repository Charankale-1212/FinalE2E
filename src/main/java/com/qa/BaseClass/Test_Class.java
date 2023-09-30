package com.qa.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Test_Class {
	public static  WebDriver driver;
	public WebDriver chromedriver;
	public static Properties prop;
	
	
public static void Initionlising() throws Exception {
	File file=new File("D:\\Charan_java\\CICD\\src\\main\\resources\\Properties_file\\Initialdetails.Properties");
	FileInputStream fs=new FileInputStream(file);
	 prop=new Properties();
	prop.load(fs);
	
	//String Browser="browser";
	
	//if(Browser.equalsIgnoreCase("chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");

	//Driver = new ChromeDriver(options);
	driver = new ChromeDriver(options);
	//}else
		//if(Browser.equalsIgnoreCase("firefox")) {
			
			//System.setProperty("webdriver.gecko.driver", "D:\\gecko_driver\\geckodriver.exe");
			//driver= new FirefoxDriver();
		
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("URL"));
	
	
	
}

}

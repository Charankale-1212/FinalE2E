package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseClass.Test_Class;
import com.qa.Page_Object_Model.AddToCart;
import com.qa.Page_Object_Model.HomePage;
import com.qa.Page_Object_Model.LoginPage;
import com.qa.Page_Object_Model.Order_Place;
import com.qa.Page_Object_Model.Shipping_Address;

public class Testcases extends Test_Class {
	LoginPage login;
	HomePage homepage;
	AddToCart addtocart;
	Shipping_Address shippingaddress;
	Order_Place orderplace;
	
	
	@BeforeMethod
	public void Setup() throws Exception {
		login=new LoginPage();
		homepage =new HomePage();
		addtocart=new AddToCart();
		shippingaddress=new Shipping_Address();
		orderplace =new Order_Place();
		
		Initionlising();
		
		
		
	}
	@Test()
	public void Test1() throws Exception {
		login.Signup();
		homepage.homeage();
		addtocart.addtocart();
		shippingaddress.shippingaddress();
		orderplace.orderconfirmationPage();
		
		
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	

}

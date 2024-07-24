package testcases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.ManagerHomePage;
import Pages.AddCustomerPage;
import Pages.LoginPage;
import Utilities.DataReader;

public class CreateCustomerNew  extends BaseTest{
	
	
	private LoginPage loginPage;
	private ManagerHomePage managerHomePage;
	private AddCustomerPage AddCustomerPage;
	
	

	
	
//	@Test
//	void test1() {
//		
//
//		loginPage = new LoginPage(driver);
//		loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));
//		AddCustomerPage.clickAddAccount();
//		
//		
//		System.out.println(" Password is  + " + DataReader.getPropertyFromKey("validPassword"));
//		
//		
//	}
	
	@Test
	public void testToVerifyLoginWithValidUserIdAndValidPassword() {
	   // loginPage = new LoginPage(driver);
	    String validUserId = DataReader.getPropertyFromKey("validUserId");
	    String validPassword = DataReader.getPropertyFromKey("validPassword");
	    System.out.println("validPassword = " + validPassword);

	    if (validUserId == null || validUserId.isEmpty()) {
	        throw new IllegalArgumentException("Valid user ID not found in properties file");
	    }
	    if (validPassword == null || validPassword.isEmpty()) {
	        throw new IllegalArgumentException("Valid password not found in properties file");
	    }

	AssertJUnit.assertEquals(managerHomePage.getPageTitle(), DataReader.getPropertyFromKey("managerHomePageTitle"));
	  //  loginPage.performLogin(validUserId, validPassword);
	    
//	    managerHomePage = new ManagerHomePage(driver);
//	    AddCustomerPage = new AddCustomerPage(driver);
//	    String Title = managerHomePage.getPageTitle();
	

	}
	

	
}

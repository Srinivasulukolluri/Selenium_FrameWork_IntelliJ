package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AccountCreatedPage;
import Pages.AddAccountPage;
import Pages.LoginPage;
import Pages.ManagerHomePage;
import Utilities.CommonMethods;
import Utilities.DataReader;
import testsAndTestData.testcases.testdata.DataProviders;

public class AddAccountTest extends BaseTest {
	
	private LoginPage loginPage;
	private ManagerHomePage managerHomePage;
	private AddAccountPage addAccountPage;
	private AccountCreatedPage accountCreatedPage;
	
    
    @Test(priority = 1, description = "Test To Verify after clicking on New Account, page redirects to Add New Account page.")
    public void testToVerifyAddNewAccountPage() throws Exception {
        loginPage = new LoginPage(driver);

        managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"),DataReader.getPropertyFromKey("validPassword"));
        
    
   
        loginPage.getAlertText();
        
        addAccountPage = managerHomePage.clickAddAccount();
        Assert.assertTrue(addAccountPage.isPageDisplayed());
    }
//    @Test(priority = 2, dataProvider = "AddNewAccount", dataProviderClass = DataProviders.class, description = "Test To Verify after creating new Account, page redirects to details of added Account")
//    public void testToVerifyAccountDetailsPage(String customerId, String accountType, String depositAmount) {
//    	loginPage = new LoginPage(driver);
//        managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"),DataReader.getPropertyFromKey("validPassword"));
//        addAccountPage = managerHomePage.clickAddAccount();
//        accountCreatedPage = addAccountPage.createNewAccount(customerId, accountType, depositAmount);
//        Assert.assertTrue(accountCreatedPage.isPageDisplayed());
//        CommonMethods.capturePageScreenshot("testToVerifyAccountDetailsPage");
//    }
//
//    @Test(priority = 3, dataProvider = "AddNewAccount", dataProviderClass = DataProviders.class, description = "Test To Verify the details of the newly added customer")
//    public void testToVerifyNewlyCreatedAccountDetails(String customerId, String accountType, String depositAmount) {
//    	loginPage = new LoginPage(driver);
//        managerHomePage = loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"),DataReader.getPropertyFromKey("validPassword"));
//        addAccountPage = managerHomePage.clickAddAccount();
//        accountCreatedPage = addAccountPage.createNewAccount(customerId, accountType, depositAmount);
//        Assert.assertTrue(accountCreatedPage.isPageDisplayed());
//        Assert.assertTrue(customerId.equalsIgnoreCase(accountCreatedPage.getCustomerId()));
//        Assert.assertTrue(accountType.equalsIgnoreCase(accountCreatedPage.getCustomerAccountType()));
//        Assert.assertTrue(depositAmount.equalsIgnoreCase(accountCreatedPage.getCustomerCurrentAmount()));
//        CommonMethods.capturePageScreenshot("testToVerifyNewlyCreatedAccountDetails");
//    }
	

}

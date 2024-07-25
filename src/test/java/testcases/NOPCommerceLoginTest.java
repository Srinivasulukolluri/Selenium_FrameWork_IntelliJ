package testcases;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ManagerHomePage;
import Utilities.DataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommerceLoginTest extends BaseTest {
    private LoginPage loginPage;
    private ManagerHomePage managerHomePage;
    @Test
    void loginTest(){
        loginPage = new LoginPage(driver);
        loginPage.iFramesOpenNewWindow();
        loginPage.performLogin(DataReader.getPropertyFromKey("validUserId"), DataReader.getPropertyFromKey("validPassword"));

//        String title = driver.getTitle();
//        System.out.println("Title is = " + title);
        Assert.assertEquals(managerHomePage.getPageTitle(), DataReader.getPropertyFromKey("managerHomePageTitle"));

    //    Assert.assertNotEquals(managerHomePage.getWelcomeMessage(), DataReader.getPropertyFromKey("managerHomePageWelcomeMessage"));
    }



}

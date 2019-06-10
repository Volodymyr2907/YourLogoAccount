import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseClass {


    @Test(priority = 3)
    public void testPasswordChanged() {
        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.tapButtonBackToYourAccount();
        accountPage.openPesrInfo();
        accountPage.enterCurrentPassword("Pass_123");
        accountPage.enterNewPassword("pass_123");
        accountPage.enterConfirmNewPassword("pass_123");
        accountPage.tapButtonSave();
        accountPage.tapButtonSignOut();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.inputUsername("vvyastrubchak@gmail.com");
        loginPage.inputPassword("pass_123");
        loginPage.enterButtonSignIn();

        String actualButtonName = accountPage.getButtonName();
        String expectedButtonName = "Sign out";
        Assert.assertEquals(actualButtonName, expectedButtonName);


    }
}

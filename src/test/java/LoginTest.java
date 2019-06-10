import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {


    @Test(priority = 1)
    public void testUserEntered() {
        AccountPage accountPage = new AccountPage(webDriver);
        String actualButtonName = accountPage.getButtonName();
        String expectedButtonName = "Sign out";
        Assert.assertEquals(actualButtonName, expectedButtonName);

    }

}

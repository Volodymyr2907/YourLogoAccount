import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeNameTest extends BaseClass {


    @Test(priority = 2)
    public void testChangeName() {
        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.openPesrInfo();
        accountPage.enterNewFirstName("Olya");
        accountPage.enterCurrentPassword("Pass_123");
        accountPage.tapButtonSave();

        String actualUserAccountName = accountPage.getUserAccountName();
        String expectedUserAccountName = "Olya Yastrubchak";
        Assert.assertEquals(actualUserAccountName, expectedUserAccountName);
    }
}

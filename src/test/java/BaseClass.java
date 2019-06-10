import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    static WebDriver webDriver;

    @BeforeSuite
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\ITEA\\ChromeDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.inputUsername("vvyastrubchak@gmail.com");
        loginPage.inputPassword("Pass_123");
        loginPage.enterButtonSignIn();
    }

    @AfterSuite
    public void afterTest() {
        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.openPesrInfo();
        accountPage.enterNewFirstName("Vova");
        accountPage.enterCurrentPassword("pass_123");
        accountPage.enterNewPassword("Pass_123");
        accountPage.enterConfirmNewPassword("Pass_123");
        accountPage.tapButtonSave();
        accountPage.tapButtonSignOut();
    }
}



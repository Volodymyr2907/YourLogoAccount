import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage {


    @FindBy(className = "account")
    private WebElement userAccountName;

    @FindBy(xpath = "//*[@class=\"myaccount-link-list\"]/li[4]/a")
    private WebElement buttonMyPersonalInfo;

    @FindBy(id = "firstname")
    private WebElement fieldFirstName;

    @FindBy(name = "submitIdentity")
    private WebElement saveButton;

    @FindBy(id = "old_passwd")
    private WebElement currentPassword;

    @FindBy(className = "logout")
    private WebElement buttonSignOut;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/a")
    private WebElement buttonBackToYourAccount;

    @FindBy(id = "passwd")
    private WebElement newPassword;

    @FindBy(id = "confirmation")
    private WebElement confirmNewPassword;


    AccountPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);

    }

    public String getUserAccountName() {
        return userAccountName.getText();
    }

    public void openPesrInfo() {
        buttonMyPersonalInfo.click();
    }

    public void enterNewFirstName(String newName) {
        fieldFirstName.sendKeys(Keys.chord(Keys.CONTROL, "a"), newName);
    }

    public void enterCurrentPassword(String currentPassword) {
        this.currentPassword.sendKeys(currentPassword);
    }

    public void tapButtonSave() {
        saveButton.click();
    }

    public String getButtonName() {
        return buttonSignOut.getText();
    }

    public void tapButtonBackToYourAccount() {
        buttonBackToYourAccount.click();
    }

    public void enterNewPassword(String newPassword) {
        this.newPassword.sendKeys(newPassword);
    }

    public void enterConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword.sendKeys(confirmNewPassword);
    }

    public void tapButtonSignOut() {
        buttonSignOut.click();
    }

}

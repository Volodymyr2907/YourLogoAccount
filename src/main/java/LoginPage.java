import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passField;

    @FindBy(id = "SubmitLogin")
    private WebElement buttonSignIn;


    LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void inputUsername(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passField.sendKeys(password);
    }

    public void enterButtonSignIn() {
        buttonSignIn.click();
    }

}

package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerButton;
    @FindBy(css = "[name='username']")
    public WebElement userName2;
    @FindBy(css = "[name='password']")
    public WebElement password2;
    @FindBy(css="input[value='Log In']")
    public WebElement login;
    @FindBy(xpath = "//li/a[text()='Log Out']")
    public WebElement logOut;
    @FindBy(xpath = "//li/a[text()='Bill Pay']")
    public WebElement billpayButton;


    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "userName2": return userName2;
            case "password2": return password2;
            case "login": return login;
            case "logOut": return logOut;
            case "billpayButton": return billpayButton;

        }
        return null;
    }

}

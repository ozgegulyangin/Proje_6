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
    @FindBy(css = "[name='username’]")
    public WebElement userName2;
    @FindBy(css = "[name='password']")
    public WebElement password2;
    @FindBy(css="[value='Log In']")
    public WebElement login;


    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "userName2": return userName2;
            case "password2": return password2;

        }
        return null;
    }

}

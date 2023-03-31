package Pages;


import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "customer.firstName")
    public WebElement FirstName;
    @FindBy(id = "customer.lastName")
    public WebElement LastName;
    @FindBy(id = "customer.address.street")
    public WebElement address;
    @FindBy(id = "customer.address.city")
    public WebElement city;
    @FindBy(id = "customer.address.state")
    public WebElement state;
    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;
    @FindBy(id = "customer.ssn")
    public WebElement SSN;
    @FindBy(id = "customer.username")
    public WebElement userName;
    @FindBy(id = "customer.password")
    public WebElement password;
    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;
    @FindBy(css = "[value='Register']")
    public WebElement registerButton2;
    @FindBy(css = "h1[class='title']+p")
    public WebElement registerSuccess;
    @FindBy(linkText = "Log Out")
    public WebElement logOut;
    @FindBy(xpath = "//h1[text()='Accounts Overview']")
    public WebElement loginSuccess;
    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errosMsg;

    @FindBy(name = "payee.name")
    public WebElement billName;
    @FindBy(name = "payee.address.street")
    public WebElement billAdress;
    @FindBy(name = "payee.address.city")
    public WebElement billCity;
    @FindBy(name = "payee.address.state")
    public WebElement billAddress;
    @FindBy(name = "payee.address.zipCode")
    public WebElement billZipcode;
    @FindBy(name = "payee.accountNumber")
    public WebElement billAccount;
    @FindBy(css = "[name='verifyAccount']")
    public WebElement verifyAccount;
    @FindBy(css = "[name='amount']")
    public WebElement amount;
    @FindBy(css = "[name='fromAccountId']")
    public WebElement accountId;
    @FindBy(css = "[value='Send Payment']")
    public WebElement payment;
    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentComplete;


    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "FirstName": return FirstName;
            case "LastName": return LastName;
            case "Adress": return address;
            case "City": return city;
            case "State": return state;
            case "ZipCode": return zipCode;
            case "SSN": return SSN;
            case "UserName": return userName;
            case "Password": return password;
            case "ConfirmPassword": return confirmPassword;

        }
        return null;
    }
}
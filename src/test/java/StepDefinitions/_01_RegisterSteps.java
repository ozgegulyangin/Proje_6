package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @Given("Navigate to MainPage")
    public void navigateToMainPage() {
        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @And("Click to RegisterButton")
    public void clickToRegisterButton() {
        ln.clickFunc(ln.registerButton);
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunc(element, items.get(i).get(1));
        }
    }

    @When("Click on the RegisterButtonTwo")
    public void clickOnTheRegisterButtonTwo() {
        dc.clickFunc(dc.registerButton2);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.registerSuccess,"successfully");
    }
}

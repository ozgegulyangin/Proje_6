package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_LoginSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("User sending the keys in LeftNav")
    public void userSendingTheKeysInLeftNav(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = ln.getWebElement(items.get(i).get(0));
            ln.sendkeysFunc(element, items.get(i).get(1));
        }
    }
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton);
            ln.clickFunc(element);
        }
    }

    @Then("Success message should not be displayed")
    public void successMessageShouldNotBeDisplayed() {
        dc.verifyContainsTextFunction(dc.errosMsg,"Error");
    }

    @Then("Success message account is displayed")
    public void successMessageAccountIsDisplayed() {
        dc.verifyContainsTextFunction(dc.loginSuccess,"Accounts Overview");
    }
}

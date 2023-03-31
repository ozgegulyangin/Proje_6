package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_BillPaySteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Enter payee information")
    public void enterPayeeInformation(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunc(element, items.get(i).get(1));
        }


    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clickFunc(element);
        }

    }

    @Then("Success message bill pay displayed")
    public void successMessageBillPayDisplayed() {
        dc.verifyContainsTextFunction(dc.paymentComplete,"Bill Payment Complete");
    }
}

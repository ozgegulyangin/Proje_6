package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

    public class Parent {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        public void sendkeysFunc(WebElement element, String text){
            waitUntilClickable(element);
            scrollToElement(element);
            element.clear();
            element.sendKeys(text);
        }
        public void clickFunc(WebElement element){
            waitUntilClickable(element);
            scrollToElement(element);
            element.click();
        }
        public void verifyContainsTextFunction(WebElement element, String value){
            wait.until(ExpectedConditions.textToBePresentInElement(element, value));
            Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"Text not found");
            new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
        }
        public void scrollToElement(WebElement element){
            JavascriptExecutor js=(JavascriptExecutor) BaseDriver.getDriver();
            js.executeScript("arguments[0].scrollIntoView(false);", element);
        }
        public void waitUntilVisible(WebElement element){
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        public void waitUntilClickable(WebElement element){
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
    }



package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://healthyfit.web.app/goals/DVtkse5aAUkDxeHwSS8p7j")
public class GoalsPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//*[@id=\"height\"]")
    WebElement fieldHeight;

    @FindBy(how = How.XPATH, using = "//*[@id=\"weight\"]")
    WebElement fieldWeight;

    @FindBy(how = How.XPATH, using = "//*[@id=\"age\"]")
    WebElement fieldAge;

    @FindBy(how = How.XPATH, using = "//*[@id=\"range\"]")
    WebElement fieldRange;

    @FindBy(how = How.ID, using = "target-lose")
    WebElementFacade fieldTarget;

    @FindBy(how = How.XPATH, using = "//*[@id=\"weightTarget\"]")
    WebElement fieldTargetToCut;

    @FindBy(how = How.ID, using = "dailyActive")
    WebElementFacade fieldTypeActivity;

    @FindBy(how = How.ID, using = "btn-submit-new-goals")
    WebElementFacade buttonAddGoals;

    public void inputHeight(){
        fieldHeight.sendKeys("160");
    }
    public void inputWeight(){
        fieldWeight.sendKeys("55");
    }
    public void inputAge(){
        fieldAge.sendKeys("22");
    }
    public void inputRange(){
        fieldRange.sendKeys("30");
    }
    public void inputTarget(){
        fieldTarget.waitForCondition();
    }
    public void inputTargetToCut(){
        fieldTargetToCut.sendKeys("2");
    }
    public void inputTypeActivity(){
        fieldTypeActivity.waitForCondition();
    }
    public void addGoals(){
        buttonAddGoals.waitForCondition();
    }
}

package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy(how = How.XPATH, using = "//*[@id=\"target-lose\"]")
    WebElement fieldTarget;

    @FindBy(how = How.XPATH, using = "//*[@id=\"weightTarget\"]")
    WebElement fieldTargetToCut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dailyActive\"]")
    WebElement fieldTypeActivity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btn-submit-update-goals\"]")
    WebElement buttonAddGoals;

    public void inputHeight(){
        fieldHeight.sendKeys("160");
    }
    public void inputWeight(){
        fieldWeight.sendKeys("60");
    }
    public void inputAge(){
        fieldAge.sendKeys("25");
    }
    public void inputRange(){
        fieldRange.sendKeys("30");
    }
    public void inputTarget(){
        fieldTarget.click();
    }
    public void inputTargetToCut(){
        fieldTargetToCut.sendKeys("2");
    }
    public void inputTypeActivity(){
        fieldTypeActivity.click();
    }
    public void addGoals(){
        buttonAddGoals.click();
    }
}

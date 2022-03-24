package starter.GuestHealthyFit.Page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://healthyfit.web.app")
public class GuestPage extends PageObject {
    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div[2]/button")
    WebElement searchcolumn;

    @FindBy (how = How.XPATH ,using= "//*[@id=\"modal-root\"]/div/div/div[2]/div/div/input")
    WebElementFacade soto;

    @FindBy (how = How.XPATH ,using= "//*[@id=\"headlessui-listbox-button-1\"]")
    WebElement searchBy;
    @FindBy (how = How.XPATH ,using= "//*[@id=\"headlessui-listbox-option-4\"]")
    WebElement food;

    @FindBy (how = How.XPATH ,using= "//*[@id=\"modal-root\"]/div/div/div[2]/div[1]/button")
    WebElementFacade searchbutton;

    @FindBy (how = How.XPATH ,using = "//*[@id=\"__next\"]/main/div[2]/div[1]/h1")
    WebElement header;
    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div[2]/div[2]/div[2]/div")
    WebElementFacade cotoBetawi;


    public void clickSearch(){
        searchcolumn.click();
    }

    public void inputSoto(){
        soto.waitUntilVisible();
        soto.sendKeys("rice");  }
    public void clickSearchBy(){ searchBy.click(); }
    public void selectFood(){food.click();}
    public void clickButtonSearch() {
        searchbutton.click();}


    public String cotoPage() {
        header.getText();
        cotoBetawi.waitUntilVisible();
        return cotoBetawi.getText();
    }



}

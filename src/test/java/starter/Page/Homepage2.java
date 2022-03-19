package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://healthyfit.web.app")
public class Homepage2 extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div[2]/div/div[3]/div[1]/h3[2]/span")
    WebElementFacade weight;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div[2]/div/div[3]/div[1]/h3[1]/span")
    WebElement height;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div[2]/div/div[2]/div[2]/h5[2]")
    WebElement age;

    public String WeightMessage(){
        weight.withTimeoutOf(30,TimeUnit.SECONDS).waitUntilVisible();
        return weight.getText();}
    public String HeightMessage(){return height.getText();}
    public String AgeMessage(){return age.getText();}
}

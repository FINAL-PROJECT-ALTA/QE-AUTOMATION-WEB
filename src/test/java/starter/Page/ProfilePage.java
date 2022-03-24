package starter.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://healthyfit.web.app/profile")
public class ProfilePage extends PageObject {

    @FindBy(how = How.ID, using = "btn-add-goals")
    WebElement addyourgoals;

    public void clickAddYourGoals(){
        addyourgoals.click();
    }
}

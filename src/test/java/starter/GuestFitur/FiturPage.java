package starter.GuestFitur;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://healthyfit.web.app")
public class FiturPage extends PageObject {
    @FindBy(how = How.XPATH ,using= "//*[@id=\"__next\"]/div/div/div/button[3]")
    WebElement reportButton;

    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div/div/div/div[1]")
    WebElementFacade headerWelcome;
    @FindBy (how = How.XPATH ,using = "//*[@id=\"__next\"]/div/div/div/button[4]")
    WebElement profileButton;
    @FindBy (how = How.XPATH ,using = "//*[@id=\"__next\"]/div/div/div/button[2]")
    WebElement recommendButton;

    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div[3]/div[2]/div[1]/a[1]")
    WebElementFacade buttonFruits;
    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div[2]/div[2]/div[1]/div")
    WebElementFacade pictPeer;
    @FindBy (how = How.XPATH ,using= "//*[@id=\"__next\"]/main/div[2]")
    WebElementFacade nutrition;


    public void clickReport(){ reportButton.click(); }
    public String showLogin(){ return headerWelcome.getText(); }
    public void clickProfile(){ profileButton.click(); }
    public void clickRecommend(){ recommendButton.click(); }

    public void categoryFruits() {
        Scroll.to(buttonFruits );
        buttonFruits.click();}
    public void selectPeer() {
        pictPeer.click();}
    public void showNutrition() {
        nutrition.getText();}

}

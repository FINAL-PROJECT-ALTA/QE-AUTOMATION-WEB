package starter.Page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://healthyfit.web.app")
public class HealthyfitLoginPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/form/div[1]/div/input")
    WebElement fieldEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/form/div[2]/div/input")
    WebElement fieldPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/form/div[3]/button")
    WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div[3]/div[1]/div/div/button[1]")
    WebElement login2;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[1]")
    WebElement logo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"swal2-title\"]")
    WebElement oops;

    @FindBy(how = How.XPATH, using = "//*[@id=\"swal2-html-container\"]")
    WebElement somethingwrong;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div[2]/h1")
    WebElementFacade profile;

    public String ProfileMessage(){
        profile.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilVisible();
        return profile.getText();}

    public void clickLoginButton(){
        login2.click();
    }
    public void inputEmail(){
        fieldEmail.sendKeys("kopikirsendiri@gmail.com");
    }
    public void inputPassword(){
        fieldPassword.sendKeys("kopi");
    }
    public void clickLogin(){
        loginButton.click();
    }
    public void inputInvalidEmail(){fieldEmail.sendKeys("dinda4gmail.com");}
    public void inputInvalidPassword(){fieldPassword.sendKeys("Tririri");}
    public Boolean verifyLogo(){return logo.isDisplayed();}
    public String gagalLoginMessage(){return oops.getText();}
    public String wrongMessage(){return somethingwrong.getText();}

}

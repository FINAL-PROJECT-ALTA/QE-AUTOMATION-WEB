package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Page.HealthyfitLoginPage;
import starter.Page.Homepage;

public class HealthyFitLoginStep {

    HealthyfitLoginPage healthyfitLoginPage;
    Homepage homepage;

    @Step
    public void iOpenHealthyFitHomepage(){
        homepage.open();
    }

    @Step
    public void iClickLoginButton(){
        healthyfitLoginPage.clickLoginButton();
    }

    @Step
    public void iInputEmailAndPassword() {
        healthyfitLoginPage.inputEmail();
        healthyfitLoginPage.inputPassword();
    }

    @Step
    public void iClickButtonLogin() {
        healthyfitLoginPage.clickLogin();
    }

    @Step
    public void iCanSeeTheHealthyFitProfilepage(){
        healthyfitLoginPage.ProfileMessage();
    }
    @Step
    public void iInputInvalidEmailAndValidPassword(){
        healthyfitLoginPage.inputInvalidEmail();
        healthyfitLoginPage.inputPassword();
    }
    @Step
    public void iInputEmailAndInvalidPassword() {
        healthyfitLoginPage.inputEmail();
        healthyfitLoginPage.inputInvalidPassword();
    }
    @Step
    public void iInputInvalidEmailAndInvalidPassword() {
        healthyfitLoginPage.inputInvalidEmail();
        healthyfitLoginPage.inputInvalidPassword();
    }
    @Step
    public void iSkipToFillEmailSectionAndThenIFillPasswordSection() {
        healthyfitLoginPage.inputPassword();
    }
    @Step
    public void iSkipToFillPasswordSectionAndThenIFillEmailSection() {
        healthyfitLoginPage.inputEmail();
    }
    @Step
    public void iCanTSeeHealthyFitProfilepage(){
        healthyfitLoginPage.verifyLogo();
        healthyfitLoginPage.gagalLoginMessage();
        healthyfitLoginPage.wrongMessage();
    }
}

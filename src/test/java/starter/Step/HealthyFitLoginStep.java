package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Page.HealthyfitLoginPage;
import starter.Page.Homepage;
import starter.Page.Homepage2;

public class HealthyFitLoginStep {

    HealthyfitLoginPage healthyfitLoginPage;
    Homepage homepage;
    Homepage2 homepage2;

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
    public void iCanSeeTheHealthyFitHomepage(){
        homepage2.WeightMessage();
        homepage2.HeightMessage();
        homepage2.AgeMessage();
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
    public void iCanTSeeHealthyFitHomepage() {
        healthyfitLoginPage.verifyLogo();
        healthyfitLoginPage.gagalLoginMessage();
        healthyfitLoginPage.wrongMessage();

    }
}

package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.HealthyFitLoginStep;

public class HealthyFitLoginStepDef {


    @Steps
    HealthyFitLoginStep healthyFitLoginStep;

    @Given("I open Healthy Fit homepage")
    public void iOpenHealthyFitHomepage() {
        healthyFitLoginStep.iOpenHealthyFitHomepage();
    }

    @When("I click login button")
    public void iClickLoginButton() {
        healthyFitLoginStep.iClickLoginButton();
    }

    @And("I input email and password")
    public void iInputEmailAndPassword(){
        healthyFitLoginStep.iInputEmailAndPassword();
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        healthyFitLoginStep.iClickButtonLogin();
    }

    @Then("I can see the Healthy Fit profilepage")
    public void iCanSeeTheHealthyFitProfilepage() {
        healthyFitLoginStep.iCanSeeTheHealthyFitProfilepage();
    }

    @And("I input invalid email and valid password")
    public void iInputInvalidEmailAndValidPassword() {
        healthyFitLoginStep.iInputInvalidEmailAndValidPassword();
    }

    @And("I input email and invalid password")
    public void iInputEmailAndInvalidPassword() {
        healthyFitLoginStep.iInputEmailAndInvalidPassword();
    }

    @And("I input invalid email and invalid password")
    public void iInputInvalidEmailAndInvalidPassword() {
        healthyFitLoginStep.iInputInvalidEmailAndInvalidPassword();
    }

    @And("I skip to fill email section and then i fill password section")
    public void iSkipToFillEmailSectionAndThenIFillPasswordSection() {
        healthyFitLoginStep.iSkipToFillEmailSectionAndThenIFillPasswordSection();
    }

    @And("I skip to fill password section and then i fill email section")
    public void iSkipToFillPasswordSectionAndThenIFillEmailSection() {
        healthyFitLoginStep.iSkipToFillPasswordSectionAndThenIFillEmailSection();
    }

    @Then("I can't see Healthy Fit profilepage")
    public void iCanTSeeHealthyFitProfilepage() {
        healthyFitLoginStep.iCanTSeeHealthyFitProfilepage();
    }

}







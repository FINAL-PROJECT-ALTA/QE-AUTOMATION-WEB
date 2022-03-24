package starter.GuestHealthyFit.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.GuestHealthyFit.Step.GuestStep;

public class GuestStepDef {
    @Steps
    GuestStep guestStep;

    @Given("I open HealthyFit page")
        public void iOpenHealthyFitPage(){
        guestStep.iOpenHomePage();
    }

    @When("I click search")
    public void iClickSearch() {
        guestStep.columnSearch();
    }

    @And("I input food name")
    public void iInputFoodName() {
        guestStep.fillFoodName();
    }

    @And("I select food")
    public void iSelectFood() {
        guestStep.selectCategory();
        guestStep.thisFood();
    }

    @And("I click search button")
    public void iClickSearchButton() {
        guestStep.buttonSearch();
    }


    @Then("Show some soto menu")
    public void showSomeSotoMenu() {
        guestStep.searchingPage();
    }

}

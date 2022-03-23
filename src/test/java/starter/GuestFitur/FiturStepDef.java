package starter.GuestFitur;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FiturStepDef {
    @Steps
    FiturStep fiturStep;

    @Given("I open HealthyFit")
    public void iOpenHealthyFit(){
        fiturStep.iOpenHealthy();
    }

    @When("I click Fruits")
    public void iClickFruits() { fiturStep.seeCategoryFruits(); }
    @When("I click report")
    public void iClickReport() {
        fiturStep.seeReport();
    }
    @And("I click Peer")
    public void iClickPeer() { fiturStep.selectFruitPeer(); }
    @When("I click profile")
    public void iClickProfile() {
        fiturStep.clickProfile();
    }
    @When("I click recommend")
    public void iClickRecommend() {
        fiturStep.clickRecommend();
    }

    @Then("Show some login page")
    public void showSomeLoginPage() {
        fiturStep.loginFirst();
    }
    @Then("Show nutrition about peer")
    public void showNutritionAboutPeer() { fiturStep.seeNutritionPeer(); }



}

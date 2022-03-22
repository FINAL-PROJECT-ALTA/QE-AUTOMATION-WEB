package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.HFGoalsStep;

public class HFGoalsStepDef {

    @Steps
    HFGoalsStep hfGoalsStep;

    @When("I click add your goals")
    public void iClickAddYourGoals() {
        hfGoalsStep.iClickAddYourGoals();
    }

    @And("I input height")
    public void iInputHeight() {
        hfGoalsStep.iInputHeight();
    }

    @And("I input weight")
    public void iInputWeight() {
        hfGoalsStep.iInputWeight();
    }

    @And("I input age")
    public void iInputAge() {
        hfGoalsStep.iInputAge();
    }

    @And("I input range day")
    public void iInputRangeDay() {
        hfGoalsStep.iInputRangeDay();
    }

    @And("I select the target")
    public void iSelectTheTarget() {
        hfGoalsStep.iSelectTheTarget();
    }

    @And("I input target of cut or bulk")
    public void iInputTargetOfCutOrBulk() {
        hfGoalsStep.iInputTargetOfCutOrBulk();
    }

    @And("I select the person activity type")
    public void iSelectThePersonActivityType() {
        hfGoalsStep.iSelectThePersonActivityType();
    }

    @And("I click add goals button")
    public void iClickAddGoalsButton() {
        hfGoalsStep.iClickAddGoalsButton();
    }

    @Then("I can see my goals")
    public void iCanSeeMyGoals() {
        hfGoalsStep.iCanSeeMyGoals();
    }
}

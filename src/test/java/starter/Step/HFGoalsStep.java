package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Page.GoalsPage;
import starter.Page.ProfilePage;

public class HFGoalsStep {

    GoalsPage goalsPage;
    ProfilePage profilePage;

    @Step
    public void iClickAddYourGoals() {
        profilePage.open();
        profilePage.clickAddYourGoals();
    }
    @Step
    public void iInputHeight() {
        goalsPage.inputHeight();

    }
    @Step
    public void iInputWeight() {
        goalsPage.inputWeight();
    }
    @Step
    public void iInputAge() {
        goalsPage.inputAge();
    }
    @Step
    public void iInputRangeDay() {
        goalsPage.inputRange();
    }
    @Step
    public void iSelectTheTarget() {
        goalsPage.inputTarget();
    }
    @Step
    public void iInputTargetOfCutOrBulk() {
        goalsPage.inputTargetToCut();
    }
    @Step
    public void iSelectThePersonActivityType() {
        goalsPage.inputTypeActivity();
    }
    @Step
    public void iClickAddGoalsButton() {
        goalsPage.addGoals();
    }
    @Step
    public void iCanSeeMyGoals() {
    }
}

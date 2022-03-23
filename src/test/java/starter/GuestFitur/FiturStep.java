package starter.GuestFitur;

import net.thucydides.core.annotations.Step;

public class FiturStep {

    FiturPage fiturPage;

    @Step
    public void iOpenHealthy(){
        fiturPage.open();
    }

    @Step
    public void seeReport(){
        fiturPage.clickReport();
    }

    @Step
    public void clickProfile(){
        fiturPage.clickProfile();
    }

    @Step
    public void clickRecommend(){
        fiturPage.clickRecommend();
    }

    @Step
    public void loginFirst(){
        fiturPage.showLogin();
    }


    @Step
    public void seeCategoryFruits() { fiturPage.categoryFruits(); }
    @Step
    public void selectFruitPeer() {
        fiturPage.selectPeer();
    }
    @Step
    public void seeNutritionPeer() {
        fiturPage.showNutrition();
    }

}

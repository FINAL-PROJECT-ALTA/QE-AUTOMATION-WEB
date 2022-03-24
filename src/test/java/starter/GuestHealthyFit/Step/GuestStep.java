package starter.GuestHealthyFit.Step;

import net.thucydides.core.annotations.Step;
import starter.GuestHealthyFit.Page.HomePage;
import starter.GuestHealthyFit.Page.GuestPage;


public class GuestStep {

    GuestPage guestPage;
    HomePage homePage;


    @Step
    public void iOpenHomePage(){
        homePage.open();
    }
    @Step
    public void columnSearch(){
        guestPage.clickSearch();
    }
    @Step
    public void fillFoodName(){
        guestPage.inputSoto();
    }


    @Step
    public void selectCategory(){
        guestPage.clickSearchBy();
    }
    @Step
    public void thisFood(){
        guestPage.selectFood();
    }
    @Step
    public void buttonSearch() {
        guestPage.clickButtonSearch();
    }

    @Step
    public void searchingPage() {
        guestPage.cotoPage();
    }


}
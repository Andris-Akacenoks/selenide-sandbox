package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.header.NavigationPageObject;

public class BookingSteps {

    private NavigationPageObject homePage = new NavigationPageObject();

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() throws Throwable {
//        Thread.sleep(5000);
        homePage.selectHomeButton();
        System.out.println("Home pressed");
    }

    @And("^I select FLIGHTS menu in booking section$")
    public void iSelectFLIGHTSMenuInBookingSection() {
        homePage.selectFlightsButton();
    }

    @And("^I select ROUND TRIP flight option$")
    public void iSelectROUNDTRIPFlightOption(){
        homePage.selectRoundTripToggle();
    }

    @And("^I set FIRST class tickets$")
    public void iSetFIRSTClassTickets() {
        homePage.setCabinClass("FIRST");
    }
}

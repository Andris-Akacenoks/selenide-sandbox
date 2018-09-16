package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import general.User;
import pages.header.NavigationPageObject;

public class AccountSteps {

    private NavigationPageObject homePage = new NavigationPageObject();

    @Given("^I have an existing account$")
    public void iHaveAnExistingAccount(){
        homePage.selectMyAccountButton();
        homePage.selectLoginButton();
    }
}

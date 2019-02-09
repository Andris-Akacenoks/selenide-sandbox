package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import general.User;
import pages.account.CreateAccountPageObject;
import pages.header.NavigationPageObject;

public class AccountSteps {

    private CreateAccountPageObject accountPage = new CreateAccountPageObject();
    User user = new User();

    @And("^I create new account$")
    public void createNewAccount() throws Exception{
        accountPage.selectGender(true);
        accountPage.enterFirstName(user.getFirstName());
        accountPage.enterLastName(user.getLastName());
        accountPage.enterPassword(user.getPassword());
        accountPage.force_sleep(3000);
    }
}

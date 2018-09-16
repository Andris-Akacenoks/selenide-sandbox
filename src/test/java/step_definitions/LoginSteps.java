package step_definitions;

import cucumber.api.java.en.When;
import general.User;
import pages.account.AccountPageObject;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject loginPage = new LoginPageObject();
    User user = new User("top.garlic@g2mail.com", "Parole123");


    @When("^I login this account$")
    public void iLoginThisAccount() throws Throwable {
        loginPage.enterEmail(user.getEmailAddress());
        loginPage.enterPassword(user.getPassword());
        loginPage.toggleRememberMeTickBox(true);
        loginPage.selectLoginButton();
    }
}

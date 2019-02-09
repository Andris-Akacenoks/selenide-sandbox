package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.User;
import pages.header.NavigationPageObject;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject loginPage = new LoginPageObject();
    private NavigationPageObject mainPage = new NavigationPageObject();
    User user = new User();


    @Given("^I have chosen to sign up$")
    public void chooseToSignUp() throws Throwable {
        mainPage.selectLoginButton();
        loginPage.enterEmailSignup(user.getEmailAddress());
        loginPage.selectSignupButton();
    }
}

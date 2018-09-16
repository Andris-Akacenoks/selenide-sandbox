package pages.signup;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getLastNameField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getMobileNumberField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getEmailField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getPasswordField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getConfirmPasswordField(){
        return $(By.cssSelector("test"));
    }

    private SelenideElement getSignupButton(){
        return $(By.cssSelector("test"));
    }

    public void enterFirstName(String firstName){
        getFirstNameField().sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        getLastNameField().sendKeys(lastName);
    }

    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmationPassword(String password){
        getConfirmPasswordField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton(){
        getSignupButton().click();
        return page(AccountPageObject.class);
    }

}

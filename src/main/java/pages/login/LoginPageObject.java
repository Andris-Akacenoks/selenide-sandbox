package pages.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.CreateAccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getSignupButton(){
        return $(By.id("SubmitCreate"));
    }

    private SelenideElement getSingupEmailField(){
        return $(By.id("email_create"));
    }

//    private SelenideElement getLoginEmailField(){
//        return $(By.id("email"));
//    }
//
//    private SelenideElement getPasswordField(){
//        return $(By.id("passwd"));
//    }
//
//    private SelenideElement getLoginButton(){
//        return $(By.id("SubmitLogin"));
//    }

    public void enterEmailSignup(String email){
        getSingupEmailField().sendKeys(email);
    }

//    public void enterEmailLogin(String email){
//        getLoginEmailField().sendKeys(email);
//    }

//    public void enterPassword(String password){
//        getPasswordField().sendKeys(password);
//    }

//    public CreaterAccountPageObject selectLoginButton(){
//        getLoginButton().click();
//        return page(AccountPageObject.class);
//    }
    public CreateAccountPageObject selectSignupButton(){
        getSignupButton().click();
        return page(CreateAccountPageObject.class);
    }


}

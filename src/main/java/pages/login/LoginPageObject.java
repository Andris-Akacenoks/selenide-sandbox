package pages.login;

import com.codeborne.selenide.SelenideElement;
import general.User;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {


    private SelenideElement getEmailField(){
        return $(By.xpath("//input[@placeholder='Email']"));
    }

    private SelenideElement getPasswordField(){
        return $(By.xpath("//input[@placeholder='Password']"));
    }

    private SelenideElement getRememberMeTickBox(){
        return $(By.id("remember-me"));
    }

    private SelenideElement getLoginButton(){
        return $(By.xpath("//button[contains(text(), 'Login')]"));
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void toggleRememberMeTickBox(boolean enabled){
        getRememberMeTickBox().setSelected(enabled);
    }

    public AccountPageObject selectLoginButton(){
        getLoginButton().click();
        return page(AccountPageObject.class);
    }

}

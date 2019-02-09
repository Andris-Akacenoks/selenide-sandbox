package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.login.LoginPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getLoginButton(){
        return $(By.xpath("//a[@class='login']"));
    }

    public LoginPageObject selectLoginButton(){
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

}

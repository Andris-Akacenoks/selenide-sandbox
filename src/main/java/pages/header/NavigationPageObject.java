package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.login.LoginPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton(){
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount']"));
    }

    private SelenideElement getHomeButton(){
        return $(By.xpath("//ul/descendant::a[contains(text(), 'Home')]"));
    }

    private SelenideElement getLoginButton(){
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]"));
    }

    private SelenideElement getFlightsButton(){
        return $(By.xpath("//ul/descendant::a//span[contains(text(), 'Flights')]"));
    }

    private SelenideElement getRoundTripToggle(){
        return $(By.xpath("//parent::label[contains(text(), 'Round Trip')]/preceding-sibling::div"));
    }

    private SelenideElement getCabinClassOptions(){
        return $(By.name("cabinclass"));
    }

    private SelenideElement getCablinClassOption(String targetClass){
        return $(By.xpath("//option[contains(text(), '" + targetClass + "')]"));
    }

    public void selectMyAccountButton(){
        getMyAccountButton().click();
    }

    public void selectHomeButton(){
        getHomeButton().click();
    }

    public void selectFlightsButton(){
        getFlightsButton().click();
    }

    public void selectRoundTripToggle(){
        getRoundTripToggle().click();
    }

    public void setCabinClass(String cablinClass){
        getCabinClassOptions().click();
        getCablinClassOption(cablinClass).click();
    }

    public LoginPageObject selectLoginButton(){
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

}

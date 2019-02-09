package pages.account;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CreateAccountPageObject {

    public SelenideElement getMrTitleRadio(){
        return $(By.id("id_gender1"));
    }
    public SelenideElement getMrsTitleRadio(){
        return $(By.id("id_gender2"));
    }

    public SelenideElement getFirstNameField(){
        return $(By.id("customer_firstname"));
    }

    public SelenideElement getLastNameField(){
        return $(By.id("customer_lastname"));
    }

    public SelenideElement getPasswordField(){
        return $(By.id("passwd"));
    }

    public void selectGender(boolean isMale){
        if (isMale) {
            getMrTitleRadio().click();
        } else{
            getMrsTitleRadio().click();
        }
    }

    public void enterFirstName(String name){
        getFirstNameField().sendKeys(name);
    }
    public void enterLastName(String name){
        getLastNameField().sendKeys(name);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void force_sleep(int miliseconds) throws Exception{
        Thread.sleep(miliseconds);
    }


}

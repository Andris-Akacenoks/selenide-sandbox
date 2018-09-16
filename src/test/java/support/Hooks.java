package support;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {


    @Before
    public void launchBrowser(){
        Configuration.browser="chrome";
        System.out.println("Browser launched.");
    }

    @Before
    public void openHomePage(){
        open("https://www.phptravels.net/");
    }

    @After
    public void closeBrowser(){
        close();
        System.out.println("Browser closed.");
    }
}

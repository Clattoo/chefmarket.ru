package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginPhoneButton = $("#open-login-input");

    public void checkServiceEmail() {
        loginPhoneButton.shouldHave(text("service@chefmarket.ru"));
    }
}

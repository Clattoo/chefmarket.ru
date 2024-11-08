package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginPhoneFormButton = $(".btn.btn-wide.btn-gray.font-weight-bold"),

    phoneInput = $("[placeholder=\"+7 (999) 999-99-99\"]"),

    phoneCodeButton = $(".button.button-220.button-apply");



    public LoginPage openPhoneLoginForm() {
        loginPhoneFormButton.click();

        return this;
    }

    public LoginPage setUserPhone(String value) {
        phoneInput.shouldBe(visible);
        phoneInput.setValue(value);

        return this;
    }

    public void checkPhoneCodeButton() {
        phoneCodeButton.shouldHave(exist);
    }

}

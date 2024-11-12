package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginPhoneFormButton = $(".btn.btn-wide.btn-gray.font-weight-bold"),

    phoneInput = $("[placeholder=\"+7 (999) 999-99-99\"]"),

    phoneCodeButton = $(".button.button-220.button-apply");

    @Step("Открытие формы 'Войти по номеру телефона'")
    public LoginPage openPhoneLoginForm() {
        loginPhoneFormButton.click();

        return this;
    }

    @Step("Заполнение формы ввода телефона в строку ввода")
    public LoginPage setUserPhone(String value) {
        phoneInput.shouldBe(visible);
        phoneInput.setValue(value);

        return this;
    }

    @Step("Кнопка 'Получить код' становится активной после ввода номера телефона")
    public void checkPhoneCodeButton() {
        phoneCodeButton.shouldHave(exist);
    }

}

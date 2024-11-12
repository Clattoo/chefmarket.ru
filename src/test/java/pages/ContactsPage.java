package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {

    private final SelenideElement emailArea = $(".col-12.col-xl-6.col-md-6.col-lg-6.col-sm-auto.col-sm-12");

    @Step("Проверка почты для комментариев по поводу заказов и качества сервиса")
    public ContactsPage checkServiceEmail() {

        emailArea.shouldHave(text("service@chefmarket.ru"));

        return this;
    }

    @Step("Проверка почты для предложений по сотрудничеству")
    public ContactsPage checkInfoEmail() {

        emailArea.shouldHave(text("info@chefmarket.ru"));

        return this;
    }

    @Step("Проверка почты для желающих работать у нас - направьте резюме и сопроводительное письмо")
    public ContactsPage checkHrEmail() {

        emailArea.shouldHave(text("hr@chefmarket.ru"));

        return this;
    }


}

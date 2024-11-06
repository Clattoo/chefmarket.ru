package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {

    private final SelenideElement emailArea = $(".col-12.col-xl-6.col-md-6.col-lg-6.col-sm-auto.col-sm-12");

    public void checkServiceEmail() {
        emailArea.shouldHave(text("service@chefmarket.ru"));
    }

    public void checkInfoEmail() {
        emailArea.shouldHave(text("info@chefmarket.ru"));
    }

    public void checkHrEmail() {
        emailArea.shouldHave(text("hr@chefmarket.ru"));
    }


}

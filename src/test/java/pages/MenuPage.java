package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MenuPage {

    private final SelenideElement menuChooser = $(".button-desktop__image"),

    originalMenu = $("#menu-item-5dinners-original"),

    selectedMenu = $(".btn.btn-primary-outline.btn-large"),

    tigerSpaghetti = $("[id='1f0eaca2-cb3c-404a-85f9-81af60309c2b'].dish-preview.shadow--sides.border-radius--main.selected"),

    chickenMeatballs = $("[id='75d531e5-075c-4e60-8113-d0352d7c5d87'].dish-preview.shadow--sides.border-radius--main.selected"),

    risottoWithBacon = $("[id='cad7e7eb-ea08-46c2-bf84-ccc1be0157df'].dish-preview.shadow--sides.border-radius--main.selected");

    @Step("Нажатие на кнопку выбора меню")
    public MenuPage clickMenuChooser() {
        menuChooser.click();

        return this;
    }

    @Step("Выбор меню 'Оригинальное'")
    public MenuPage selectOriginalMenu() {
        originalMenu.click();

        return this;
    }

    @Step("Проверка, что выбралось меню 'Оригинальное'")
    public String checkSelectedMenu() {
        return selectedMenu.getText();

    }

    @Step("Проверка шаблона выбранных блюд для меню 'Оригинальное'")
    public MenuPage checkDishesInOriginalMenu() {
        tigerSpaghetti.shouldHave(text("In the basket"));
        chickenMeatballs.shouldHave(text("In the basket"));
        risottoWithBacon.shouldHave(text("In the basket"));

        return this;
    }
}

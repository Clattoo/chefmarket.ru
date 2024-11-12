package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MenuPage {

    private final SelenideElement menuChooser = $(".button-desktop__image"),

    originalMenu = $("#menu-item-5dinners-original"),

    selectedMenu = $(".btn.btn-primary-outline.btn-large"),

    tigerSpaghetti = $("[id='1f0eaca2-cb3c-404a-85f9-81af60309c2b'].dish-preview.shadow--sides.border-radius--main.selected"),

    chickenMeatballs = $("[id='75d531e5-075c-4e60-8113-d0352d7c5d87'].dish-preview.shadow--sides.border-radius--main.selected"),

    risottoWithBacon = $("[id='cad7e7eb-ea08-46c2-bf84-ccc1be0157df'].dish-preview.shadow--sides.border-radius--main.selected");

    public void clickMenuChooser() {
        menuChooser.click();
    }

    public void selectOriginalMenu() {
        originalMenu.click();
    }

    public String checkSelectedMenu() {
        return selectedMenu.getText();

    }

    public void checkDishesInOriginalMenu() {
        tigerSpaghetti.shouldHave(text("IN THE BASKET"));
        chickenMeatballs.shouldHave(text("IN THE BASKET"));
        risottoWithBacon.shouldHave(text("IN THE BASKET"));
    }
}

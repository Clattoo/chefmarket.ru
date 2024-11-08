package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MenuPage {

    private final SelenideElement menuChooser = $(".button-desktop__image"),

    originalMenu = $("#menu-item-5dinners-original"),

    selectedMenu = $(".btn.btn-primary-outline.btn-large"),

    tigerSpaghetti = $("[id='ac701b4d-df9f-4100-8978-a13ccd77b2d6'].dish-preview.shadow--sides.border-radius--main.selected"),

    chickenMeatballs = $("[id='2c668235-24b5-4546-9d59-2be235ee03b3'].dish-preview.shadow--sides.border-radius--main.selected"),

    risottoWithBacon = $("[id='fce7edac-b0fa-45fd-9bd5-1e414fdd557c'].dish-preview.shadow--sides.border-radius--main.selected");

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
        tigerSpaghetti.shouldHave(text("В КОРЗИНЕ"));
        chickenMeatballs.shouldHave(text("В КОРЗИНЕ"));
        risottoWithBacon.shouldHave(text("В КОРЗИНЕ"));
    }
}

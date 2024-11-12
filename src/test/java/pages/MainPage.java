package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement menuButton = $("a[href*='/menus']"),

    howItWorksButton = $("a[href*='/how-it-works']"),

    blogButton = $("a[href*='/blog']"),

    loginButton = $(".item.link.d-none.d-md-block.justify-content-end"),

    contactsButton = $("a[href*='/contacts']");

    @Step("Открытие главной страницы сайта chefmarket.ru")
    public MainPage openMainPage() {
        open("/");

        return this;
    }
    @Step("Нажатие на кнопку раздела 'Меню'")
    public void openMenu() {
        menuButton.click();
    }

    @Step("Нажатие на кнопку раздела 'Как это работает'")
    public void openHowItWorks() {
        howItWorksButton.click();
    }

    @Step("Нажатие на кнопку раздела 'Блог о вкусном'")
    public void openBlog() {
        blogButton.click();
    }

    @Step("Нажатие на кнопку 'Войти'")
    public void openLoginPage() {
        loginButton.click();
    }

    @Step("Нажатие на кнопку 'Контакты'")
    public void openContactsPage() {
        contactsButton.scrollTo();
        contactsButton.click();
    }
}

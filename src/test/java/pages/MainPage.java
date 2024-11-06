package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement menuButton = $("a[href*='/menus']"),

    howItWorksButton = $("a[href*='/how-it-works']"),

    blogButton = $("a[href*='/blog']"),

    loginButton = $("#login-button"),

    contactsButton = $("a[href*='/contacts']");

    public MainPage openMainPage() {
        open("https://chefmarket.ru");

        return this;
    }

    public void openMenu() {
        menuButton.click();
    }

    public void openHowItWorks() {
        howItWorksButton.click();
    }

    public void openBlog() {
        blogButton.click();
    }

    public void openLoginPage() {
        loginButton.click();
    }

    public void openContactsPage() {
        contactsButton.scrollTo();
        contactsButton.click();
    }
}

package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.RandomUtils;


@Owner("Maxim Shlemin")
@Severity(SeverityLevel.BLOCKER)
public class ChefmarketTests extends TestBase {

    MainPage mainPage = new MainPage();
    HowItWorksPage howItWorksPage = new HowItWorksPage();
    BlogPage blogPage = new BlogPage();
    ContactsPage contactsPage = new ContactsPage();
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();

    RandomUtils randomUtils = new RandomUtils();

    String phoneNumber = randomUtils.getRandomUserPhone();


    /*
    Кейс 1 - проверка наличия видео во вкладке "Как это работает"
     */

    @Test
    @DisplayName("Во вкладке 'Как это работает' имеется видео")
    @Tag("shefmarket_auto")
    void videoOnPageHowItWorksExistsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        mainPage.openMainPage()
                .openHowItWorks();
        howItWorksPage.checkVideoOnPage();
    }


    /*
    Кейс 2 - перейти во вкладку "Блок о вкусном", провалиться внутрь карточки "Новогоднее меню 2025"
    и проверить переход в меню.
     */

    @Test
    @DisplayName("Пользователь может перейти в новогоднее меню 2025 в разделе 'Блог о вкусном'")
    @Tag("shefmarket_auto")
    void newYear2025MenuOnBlogPageExistsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        mainPage.openMainPage()
                .openBlog();
        blogPage.checkBlogHeader();
    }

    /*
    Кейс 3 - перейти во вкладку "Контакты" и проверить наличие электронных почт для связи
     */

    @Test
    @DisplayName("Проверка наличия электронных почт разных отделов в разделе 'Контакты'")
    @Tag("shefmarket_auto")
    void checkEmailsOnContactsPageTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        mainPage.openMainPage()
                .openContactsPage();

        contactsPage.checkServiceEmail()
        .checkInfoEmail()
        .checkHrEmail();
    }

    /*
    Кейс 4 - перейти по кнопке "Войти", выбрать способ авторизации по номеру телефона,
    ввести номер телефона и проверить, что кнопка стала активной
     */

    @Test
    @DisplayName("Кнопка 'Получить код' становится активной после ввода номера телефона")
    @Tag("shefmarket_auto")
    void buttonEnterMustBeActiveAfterSettingPhoneNumberTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage.openMainPage()
                .openLoginPage();

        loginPage.openPhoneLoginForm()
                .setUserPhone(phoneNumber)
                .checkPhoneCodeButton();
    }

    /*
    Кейс 5 - перейти по кнопке "Меню", выбрать меню "Оригинальное" и проверить список блюд, которые предоставляются
    изначально пользователю
     */

    @Test
    @DisplayName("Проверка шаблона списка блюд в меню Оригинальное в разделе 'Menu'")
    @Tag("shefmarket_auto")
    void menuOriginalShouldHaveTemplateDishesTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        mainPage.openMainPage()
                .openMenu();

        menuPage.checkDishesInOriginalMenu();

    }
}

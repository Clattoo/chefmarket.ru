package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.ContactsPage;
import pages.HowItWorksPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class ShefMarketTest extends TestBase {

    MainPage mainPage = new MainPage();
    HowItWorksPage howItWorksPage = new HowItWorksPage();
    BlogPage blogPage = new BlogPage();
    ContactsPage contactsPage = new ContactsPage();


    @Test
    @Owner("Maxim Shlemin")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Во вкладке 'Как это работает' имеется видео")
    @Tag("shefmarket_auto")
    void videoOnPageHowItWorksExists()  {
       step("Открыть страницу 'Как это работает'", () -> {
           mainPage.openMainPage();
           mainPage.openHowItWorks();
        });

       step("Проверка наличия видео на странице", () -> {
           howItWorksPage.checkVideoOnPage();
       });
    }


    /*
    Кейс 2 - перейти во вкладку "Блок о вкусном", провалиться внутрь карточки "Новогоднее меню 2025"
    и проверить правильность перехода
     */

    @Test
    @Owner("Maxim Shlemin")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Пользователь может перейти в новогоднее меню 2025 в разделе 'Блог о вкусном'")
    @Tag("shefmarket_auto")
    void newYear2025MenuOnBlogPageExists() {
        step("Открыть страницу 'Блог о вкусном'", () -> {
            mainPage.openMainPage();
            mainPage.openBlog();
            blogPage.checkBlogHeader();
        });

        step("Перейти в карточку новогоднего меню 2025", () -> {
            blogPage.clickNewYear2025MenuButton();
        });

        step("Проверить переход в карточку новогоднего меню 2025", () -> {
            blogPage.checkNewYear2025MenuTitle();
        });
    }

    /*
    Кейс 3 - перейти во вкладку "Контакты" и проверить наличие электронных почт для связи
     */
    @Test
    @Owner("Maxim Shlemin")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка наличия электронных почт разных отделов в разделе 'Контакты'")
    @Tag("shefmarket_auto")
    void checkEmailsOnContactsPage() {
        step("Открыть страницу 'Контакты'", () -> {
            mainPage.openMainPage();
            mainPage.openContactsPage();
        });

        step("Проверка наличия электронной почты service@chefmarket.ru", () -> {
            contactsPage.checkServiceEmail();
        });

        step("Проверка наличия электронной почты info@chefmarket.ru", () -> {
            contactsPage.checkInfoEmail();
        });

        step("Проверка наличия электронной почты hr@chefmarket.ru", () -> {
            contactsPage.checkHrEmail();
        });
    }
    /*
    Кейс 4 - перейти по кнопке "Войти", выбрать способ авторизации по номеру телефона,
    ввести номер телефона и проверить, что кнопка стала активной
     */

    @Test
    @Owner("Maxim Shlemin")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Кнопка 'Войти' становится активной после ввода номера телефона")
    @Tag("shefmarket_auto")
    void buttonEnterMustBeActiveAfterSettingPhoneNumber() {
        step("Открыть страницу 'Войти'", () -> {
            mainPage.openMainPage();
            mainPage.openLoginPage();
        });

        step("Проверка наличия электронной почты service@chefmarket.ru", () -> {
            contactsPage.checkServiceEmail();
        });

        step("Проверка наличия электронной почты info@chefmarket.ru", () -> {
            contactsPage.checkInfoEmail();
        });

        step("Проверка наличия электронной почты hr@chefmarket.ru", () -> {
            contactsPage.checkHrEmail();
        });
    }

    /*
    Кейс 5 - перейти по кнопке "Меню", выбрать меню "Оригинальное" и проверить список блюд, которые предоставляются
    изначально пользователю
     */




}

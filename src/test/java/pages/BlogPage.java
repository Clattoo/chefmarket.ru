package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {

    private final SelenideElement blogHeader = $(".page-title.text-center"),

    newYear2025MenuButton = $("a[href*='blog/novogodnee-menju-2025-dlja-idealnogo-prazdnika']"),

    newYear2025MenuTitle = $(".entry-header");

    @Step("Проверка перехода в раздел 'Блог о вкусном'")
    public BlogPage checkBlogHeader() {
        blogHeader.shouldHave(text("Блог о вкусном"));

        return this;
    }

    @Step("Клик по новогоднему меню 2025")
    public BlogPage clickNewYear2025MenuButton() {

        newYear2025MenuButton.click();

        return this;
    }

    @Step("Проверка выбранного новогоднего меню 2025")
    public BlogPage checkNewYear2025MenuTitle() {

        newYear2025MenuTitle.shouldHave(text("Новогоднее меню 2025 для идеального праздника"));

        return this;
    }


}

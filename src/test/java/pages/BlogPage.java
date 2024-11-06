package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {

    private final SelenideElement blogHeader = $(".page-title.text-center"),

    newYear2025MenuButton = $("a[href*='blog/novogodnee-menju-2025-dlja-idealnogo-prazdnika']"),

    newYear2025MenuTitle = $(".entry-header");

    public void checkBlogHeader() {
        blogHeader.shouldHave(text("Блог о вкусном"));
    }

    public void clickNewYear2025MenuButton() {
        newYear2025MenuButton.click();
    }

    public void checkNewYear2025MenuTitle() {
        newYear2025MenuTitle.shouldHave(text("Новогоднее меню 2025 для идеального праздника"));
    }


}

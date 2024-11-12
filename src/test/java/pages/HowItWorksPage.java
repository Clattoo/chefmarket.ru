package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HowItWorksPage {

    private final SelenideElement videoElement = $("video[src*='how-it-works-23.mp4']");

    @Step("Проверка наличия видео на странице 'Как это работает'")
    public void checkVideoOnPage() {
        videoElement.shouldBe(visible);
    }
}

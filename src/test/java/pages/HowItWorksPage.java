package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HowItWorksPage {

    private final SelenideElement videoElement = $("video[src*='how-it-works-23.mp4']");

    public void checkVideoOnPage() {
        videoElement.shouldBe(visible);
    }
}

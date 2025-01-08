package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class IntroComponent {

    private final SelenideElement continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    private final SelenideElement getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));
    private final SelenideElement primaryText = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Verify the Title for Onboarding screen with text %s")
    public IntroComponent verifyTitleOnTheScreen(String title) {
        primaryText.shouldHave(text(title));
        return this;
    }

    @Step("Click on the Continue button")
    public IntroComponent clickOnContinueButton() {
        continueButton.click();
        return this;
    }

    @Step("Click on the Get Started")
    public void clickOnGetStarted() {
        getStartedButton.click();
    }
}

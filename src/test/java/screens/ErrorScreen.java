package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ErrorScreen {

    @Step("Verification that error displays")
    public void verifyErrorMessage() {
        $(id("org.wikipedia.alpha:id/view_wiki_error_text"))
                .shouldHave(text("An error occurred"));
    }
}


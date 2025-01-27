package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;
import screens.components.IntroComponent;

@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Wikipedia Onboarding Screens")

public class OnboardingTests extends TestBase {
    IntroComponent introComponent = new IntroComponent();
    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("Successful verification of Onboarding Screens")
    public void SuccessfulOnboardingTest() {
        introComponent.verifyTitleOnTheScreen("The Free Encyclopedia")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("New ways to explore")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("Reading lists with sync")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("Data & Privacy")
                .clickOnGetStarted();
        searchScreen.checkAnnouncementText("Customize your Explore feed");
    }

    @Test
    @DisplayName("Verify that user can skip Onboarding Screens")
    public void SkipOnboardingTest() {
        introComponent.verifyTitleOnTheScreen("The Free Encyclopedia")
                        .clickOnSkipButton();
        searchScreen.checkAnnouncementText("Customize your Explore feed");
    }
}

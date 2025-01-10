package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ErrorScreen;
import screens.SearchScreen;
import screens.components.IntroComponent;

@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Android OS of Search functionality for Wikipedia App")
public class SearchTests extends TestBase {

    IntroComponent introComponent = new IntroComponent();
    SearchScreen searchScreen = new SearchScreen();
    ErrorScreen errorScreen = new ErrorScreen();

    @Test
    @Tag("browserstack")
    @DisplayName("Verification of the successful search result displaying for Appium")
    void successfulSearchTest() {
        searchScreen.performSearch("Appium");
        searchScreen.verifySearchResultsPresent();
    }

    @Test
    @Tag("browserstack")
    @DisplayName("Testing of the error message displaying for invalid search")
    void invalidSearchExecutionTest() {
        searchScreen.performSearch("GGG");
        searchScreen.openFirstSearchResult();
        errorScreen.verifyErrorMessage();
    }

    @Test
    @Tag("emulation")
    @DisplayName("Verification of the successful search result displaying for Android in Emulator")
    void successfulEmulationSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("Android");
        searchScreen.verifySearchResultsPresent();
    }

}

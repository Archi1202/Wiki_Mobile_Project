package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Verification of the successful search result displaying for {0}")
    void successfulSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("Appium");
        searchScreen.verifySearchResultsPresent();
    }

    @Test
    @DisplayName("Testing of the error message displaying for invalid search")
    void invalidSearchExecutionTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("GGGGGG");
        searchScreen.openFirstSearchResult();
        errorScreen.verifyErrorMessage();
    }

    @Test
    @DisplayName("Verification of the successful search result displaying for {0} in Emulator")
    void successfulEmulationSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("Android");
        searchScreen.verifySearchResultsPresent();
    }

}

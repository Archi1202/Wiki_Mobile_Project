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
        searchScreen.performSearch("appium");
        searchScreen.verifySearchResultsPresent();

    }

    @Test
    @DisplayName("Testing behavior when no search results are found")
    void invalidSearchExecutionTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("iandeino");
        searchScreen.openFirstSearchResult();
        errorScreen.verifyErrorMessage();
    }

    @Test
    @DisplayName("Testing search with special characters")
    void specialCharactersSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("@#$%^&*()");
        errorScreen.verifyErrorMessage();
    }
}

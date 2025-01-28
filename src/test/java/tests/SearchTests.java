package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;
import screens.components.IntroComponent;

@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Android OS of Search functionality for Wikipedia App")
public class SearchTests extends TestBase {

    IntroComponent introComponent = new IntroComponent();
    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("Verification of the successful search result displayed")
    void successfulSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("Android")
                .verifySearchResultsPresent()
                .openFirstSearchResult();
    }

    @Test
    @DisplayName("Testing case-insensitive search functionality")
    void caseInsensitiveSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("Appium")
                .verifySearchResultsPresent()
                .clickOnBackButtonFromSearch()
                .performSearch("appium")
                .verifySearchResultsPresent();

    }

    @Test
    @DisplayName("Testing behavior when no search results are found")
    void invalidSearchExecutionTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("iandeino")
                .verifyNoSearchResults("No results");
    }

    @Test
    @DisplayName("Testing search with special characters")
    void specialCharactersSearchTest() {
        introComponent.clickOnSkipButton();
        searchScreen.performSearch("#$%^&*()")
                .verifyNoSearchResults("No results");
    }
}

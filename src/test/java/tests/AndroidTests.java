package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.ErrorScreen;
import screens.SearchScreen;

@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Android OS of Search functionality for Wikipedia App")
public class AndroidTests extends TestBase {


    @Test
    @DisplayName("Verification of the successful search result displaying for Appium")
    void successfulSearchTest() {
        SearchScreen.performSearch("Appium");
        SearchScreen.verifySearchResultsPresent();
    }

    @Test
    @DisplayName("Testing of the error message displaying for invalid search")
    void invalidSerchExecutionTest() {
        SearchScreen.performSearch("GGG");
        SearchScreen.openFirstSearchResult();
        ErrorScreen.verifyErrorMessage();
    }

}

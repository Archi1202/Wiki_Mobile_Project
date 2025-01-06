package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import screens.ArticleScreen;
import screens.SearchScreen;

@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Android OS of Search functionality for Wikipedia App")
public class AndroidTests extends TestBase {


    @ParameterizedTest(name = "Verification of the successful search result displaying for {0}")
    @ValueSource(strings = {"Appium", "Selenium"})
    void successfulSearchTest(String value) {
        SearchScreen.performSearch(value);
        SearchScreen.verifySearchResultsPresent();
    }

    @Test
    @DisplayName("Testing of the error message displaying for invalid search")
    void invalidSerchExecutionTest() {
        SearchScreen.performSearch("GGG");
        SearchScreen.openFirstSearchResult();
        ArticleScreen.verifyErrorMessage();
    }

}

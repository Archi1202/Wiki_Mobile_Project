package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ErrorScreen;
import screens.SearchScreen;

@Tag("emulation")
@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Emulator with Android OS of Search functionality")
public class EmulationSearchTests extends TestBase {


    @Test
    @DisplayName("Verification of the successful search result displaying for Appium")
    void successfulSearchTest() {
        SearchScreen.performSearch("Android");
        SearchScreen.verifySearchResultsPresent();
    }

    @Test
    @DisplayName("Testing of the error message displaying for invalid search")
    void invalidSerchExecutionTest() {
        SearchScreen.performSearch("TTT");
        SearchScreen.openFirstSearchResult();
        ErrorScreen.verifyErrorMessage();
    }

}

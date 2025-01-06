package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchScreen {
    @Step("Performing search for '{0}' in Wikipedia")
    public static void performSearch(String searchText) {
        if (searchText == null || searchText.isEmpty()) {
            throw new IllegalArgumentException("Search text cannot be null or empty.");
        }
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).setValue(searchText);
    }

    @Step("Navigating to the first result from the search results")
    public static void openFirstSearchResult() {
        $(id("org.wikipedia.alpha:id/page_list_item_title")).click();
    }

    @Step("Verifying search results are found")
    public static void verifySearchResultsPresent() {
        assertThat($$(id("org.wikipedia.alpha:id/page_list_item_title")))
                .as("Expected at least one search result")
                .hasSizeGreaterThan(0);
    }

}

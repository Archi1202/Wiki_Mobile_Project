package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchScreen {

    @Step("Performing search for '{0}' in Wikipedia")
    public SearchScreen performSearch(String searchText) {
        if (searchText == null || searchText.isEmpty()) {
            throw new IllegalArgumentException("Search text cannot be null or empty.");
        }
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(searchText);
        return this;
    }

    public SearchScreen clickOnBackButtonFromSearch() {
        $(accessibilityId("Navigate up")).click();
        return this;
    }

    @Step("Navigating to the first result from the search results")
    public void openFirstSearchResult() {
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
    }

    @Step("Verifying search results are found")
    public SearchScreen verifySearchResultsPresent() {
        assertThat($$(id("org.wikipedia.alpha:id/page_list_item_title")))
                .as("Expected at least one search result")
                .hasSizeGreaterThan(0);
        return this;
    }

    @Step("Check that on the Main Search Screen displayed")
    public void checkAnnouncementText(String text) {
        $(id("org.wikipedia.alpha:id/view_announcement_text")).shouldHave(text(text));
    }

    @Step("Check that on No results data displayed")
    public void verifyNoSearchResults(String text) {
        $(id("org.wikipedia.alpha:id/results_text")).shouldHave(text(text));
    }
}


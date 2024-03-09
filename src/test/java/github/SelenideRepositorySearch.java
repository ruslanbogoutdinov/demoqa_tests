package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void searchSelenideRepositoryTest(){
        open("https://github.com/");

        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list] > div").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}

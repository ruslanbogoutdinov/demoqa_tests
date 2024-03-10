package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSelenide {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void gitHubSelenideTest(){
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        $(".wiki-more-pages-link").$(".btn-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}

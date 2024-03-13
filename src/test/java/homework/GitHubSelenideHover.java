package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSelenideHover {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void testHover(){
        open("https://github.com/");

        $$(".HeaderMenu-item").get(1).hover();
        $("[aria-labelledby=solutions-for-heading]").$(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}

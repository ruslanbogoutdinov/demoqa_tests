import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest(){
        open("/text-box");

        $("[id=userName]").setValue("Ruslan Bogoutdinov");
        // OR
        //$("#userName").setValue("Ruslan Bogoutdinov");
        $("[id=userEmail]").setValue("ruslanbogoutdinov@gmail.com");
        $("[id=currentAddress]").setValue("Some address");
        $("[id=permanentAddress]").setValue("Another address");
        $("[id=submit]").click();
        $("[id=output]").shouldHave(text("Ruslan Bogoutdinov"), text("ruslanbogoutdinov@gmail.com"),
                text("Some address"), text("Another address"));
    }
}

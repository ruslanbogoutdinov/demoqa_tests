package withpo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import withpo.pageobjects.FormPracticePO;

public class TestBase {
    FormPracticePO formPracticePO = new FormPracticePO();
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
}

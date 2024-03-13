package withpo.pageobjects.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ModalComponent {
    public void modalWindowAppears(String title){
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text(title));
    }

    public void checkModalKeyValue(String key, String value){
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }
}

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ActionsExamples {
    // hover
    void actions(){
        // Ищем нужный элемент перемещаясь по дереву и в конце наводим мышь на элемент
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("div").$$("ul li").first().hover();


    }
}

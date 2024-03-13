package examples;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class WorkWithText {
    @Test
    void otherMethodsTest(){
        // Ищем по частичному совпадению, игнорируя кейс
        $("#someElement").shouldHave(text("abs"));
        // Ищем по точному совпадению, игнорируя кейс
        $("#someElement").shouldHave(exactText("abs"));

        // Ищем по частичному совпадению, не игнорируя кейс
        $("#someElement").shouldHave(textCaseSensitive("abs"));
        // Ищем по точному совпадению, не игнорируя кейс
        $("#someElement").shouldHave(exactTextCaseSensitive("abs"));

        // Поиск элемента с классом более одного
        // Поиск элемента с классом внутри другого элемента с определенным классом
        $(".classOne .classTwo");

        // Поиск элемента с двойным классом
        $(".classOne.classTwo");
    }
}

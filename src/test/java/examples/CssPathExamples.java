package examples;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CssPathExamples {
    void cssXpathExamples(){
        // Самый лучший способ добраться до элемента, это по параметру "data-testid", который разработчик должен
        // добавлять в элементы. Данный параметр предназначен для автотестировщиков

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">

        $("[data-testid=email]").setValue("1");
        // OR
        $(by("data-testid", "email")).setValue("1");

        // Если данного параметра у элемента нет, то обращаемся по "id"

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("1");
        // OR
        $("#email").setValue("1");
        // OR
        $("[input#email").setValue("1");
        // By xpath
        $x("//*[@id='email']").setValue("1");
        $x("//input[@id='email']").setValue("1");

        // Если нет "id", то используем "name"

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        // OR
        $(byName("email")).setValue("1");

        // Если нет "name", то используем "class"

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        // OR
        $(".login_form_input_box").setValue("1");
        // OR
        $(".inputtext.login_form_input_box").setValue("1");
        // OR
        $("input.inputtext.login_form_input_box").setValue("1");
        // OR by xpath
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        // !По параметру "type" искать не рекомендуется

        // Для вложенных элементов
        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>

        $(".inputtext").$(".login_form_input_box").setValue("1");
        // OR
        $(".inputtext .login_form_input_box").setValue("1");

        // Поиск по тексту
        // <div>Hello, QA guru!</div>

        $x("//div[text()='Hello, QA guru!']").click();
        // OR
        $(byText("Hello, QA guru!")).click();
        // Также можно найти тест по соответствию
        $(withText("llo, QA gu")).click();

        // Поиск по 'placeholder'
        $("[placeholder=Search or jump to...]").setValue("selenide");

        // Поиск нужного item(li) в списке ul
        $$("ul.some-list li").first().$("a").click();
        // OR
        $$("ul.some-list li").get(0).$("a").click();

        // Поиск нужного item(div) в списке div
        $$("[data-testid=results-list] > div").first().$("a").click();
        // OR
        $$("[data-testid=results-list] > div").get(1).$("a").click();

        // Ищем по тегу и тексту одновременное
        $(byTagAndText("strong", "Close")).click();

        // Проверяем что у элемента есть некоторый аттрибут
        $("#element").shouldHave(attribute("attributeName"));

        // Кликнуть по элементу, аттрибут которого начинается с определенного слова
        $("[name^=order]").click();

        // Кликнуть по элементу, аттрибут которого заканчивается определенным словом
        $("[name$=order]").click();
    }
}

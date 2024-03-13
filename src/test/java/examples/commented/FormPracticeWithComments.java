package examples.commented;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPracticeWithComments {
    @BeforeAll
    static void beforeAll(){
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void practiceFormTest(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Ruslan");
        $("#lastName").setValue("Bogoutdinov");
        $("#userEmail").setValue("ruslanbogoutdinov@gmail.com");

        // ---Кликаем по радио баттону---
        // 1) Находим <input> кнопки, далее его родителя и по нему совершаем клик
        //$("#gender-radio-1").parent().click();

        // 2) Кликаем просто по тексту.
        // В этом варианте стоит учесть что метод не универсален и зависит от языка сайта
        $("#genterWrapper").$(byText("Male")).click();
        
        // 3) Также можно по <label>
        //$("label[for=gender-radio-1]").click();

        $("#userNumber").setValue("1234567890");

        // Выбираем дату в календаре
        $("#dateOfBirthInput").click();
        // Выбирам месяц по тексту
        $(".react-datepicker__month-select").selectOption("July");
        // либо по <value>
        //$("#react-datepicker__month-select").selectOptionByValue("6");

        // Выбираем год
         $(".react-datepicker__year-select").selectOption("1997");

        // Выбираем день
        // При выборе дня, важно учесть, что может выбраться день предыдущего месяца
        // Поэтому при выборе дня, отметаем выбор предыдущего дня при помощи ":not()"
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").setValue("Math").pressEnter();

        // Чекбоксы (также как и радио баттоны)
        $("#hobbiesWrapper").$(byText("Sports")).click();

        // Вставка файла
        //$("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
        // или боллее коротко
        $("#uploadPicture").uploadFromClasspath("img/1.png"); // работает только для type=file

        $("#currentAddress").setValue("Some address");

        // Выбираем элемент в дропдауне
        $("#state").click();
        // Можно по тексту
        $("#stateCity-wrapper").$(byText("NCR")).click();
        // Можно по id, но предварительно вытащив id при помощи брейкпоинтов и dev tools
        //$("#react-select-3-option-0").click();

        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        $("#submit").click();

        // Проверяем на появление модального окна с текстом
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ruslan"),text("Bogoutdinov"),
                text("ruslanbogoutdinov@gmail.com"),text("Male"),
                text("1234567890"), text("July"),
                text("1997"), text("Sports"),
                text("Some address"), text("NCR"),
                text("Delhi"));
    }
}

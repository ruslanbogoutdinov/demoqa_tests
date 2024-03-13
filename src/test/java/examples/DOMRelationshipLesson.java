package examples;

import static com.codeborne.selenide.Selenide.*;

public class DOMRelationshipLesson {
    void DOMLessonTest(){
        //open("https://www.google.com/");
        open("https://my.click.uz/");

        // Поиск родителя у элемента
        $("#someElement").parent();
        // Поиск родителя у родителя
        $("#someELement").parent().parent();
        // Поиск ближайшего элемента
        $("#someElement").closest("htmlELement");
        // Поиск сиблинга
        $("#someElement").sibling(0);
        // Поиск сиблинга в обратном порядке
        $("#someElement").preceding(0);

        // CSS Selectors
        // div div - любой первый потомок дива
        // div>div - первый прямой потомок дива
    }
}

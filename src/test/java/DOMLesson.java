import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DOMLesson {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void DOMLessonTest(){
        //open("https://www.google.com/");
        open("https://my.click.uz/");
        sleep(8000);

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

package examples;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class FindAnotherElements {
    void findElements(){
        // Поиск поповера, если на странице присутствуют несколько поповеров, но нужный видимый, а остальные нет
        $$(".Popover").findBy(visible).shouldHave(text("Needed text in popover"));
    }
}

package github;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragNDrop {

    @Test
    void executeDragNDrop() {
        // открыть https://the-internet.herokuapp.com/
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // перенести прямоугольник из A в B
        $("#column-a").dragAndDropTo($("#column-b"));
        // проверка: прямоугольники поменялись местами
        $("header").shouldHave(text("B"));

    }

}

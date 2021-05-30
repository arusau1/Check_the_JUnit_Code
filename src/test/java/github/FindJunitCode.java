package github;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindJunitCode {

    @Test
    void shouldFindJunitCodeOnGitHub() {
        // открыть страницу Selenide в GitHub
        open("https://github.com/selenide/selenide");
        // выбрать Wiki (кликнуть)
        $("[data-hotkey = \"g w\"]").click();
        // проверка:  в списке страниц (Pages) есть страница SoftAssertions
        $(byText("Show 1 more pages…")).click();
        $("[id=\"wiki-pages-box\"]").shouldHave(text("SoftAssertions"));
        // открыть страницу SoftAssertions и проверить, что внутри есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));

    }

}

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest0 {

    @Test
    void selenideSearchTest()
        {
            //открыть гугл
            open("https://google.com");

            //ввести selenide в поиск
            $(byName("q")).setValue("Selenide").pressEnter();

            //look if Selenide is on page
            $("html").shouldHave(Condition.text("selenide.org"));
        }

}

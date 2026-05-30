package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultsTableComponent {

    private final SelenideElement table = $(".table");

    public void checkResult(String key, String value) {
        table.shouldHave(text(key), text(value));
    }
}
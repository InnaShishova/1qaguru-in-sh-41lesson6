package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private final SelenideElement
            yearSelect = $(".react-datepicker__year-select"),
            monthSelect = $(".react-datepicker__month-select"),
            daySelect = $(".react-datepicker__month");

    public void setDate(String day, String month, String year) {
        yearSelect.selectOption(year);
        monthSelect.selectOption(month);
        daySelect.$(byText(day)).click();
    }
}
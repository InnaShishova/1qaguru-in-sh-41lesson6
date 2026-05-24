package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__month").$(byText(day)).click();

        return this;
    }

    public RegistrationPage setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value) {
        $("#currentAddress").scrollTo().shouldBe(visible);
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setStateAndCity(String state, String city) {
        $("#state").click();
        $(byText(state)).click();

        $("#city").click();
        $(byText(city)).click();

        return this;
    }

    public RegistrationPage submit() {
        $("#submit").click();
        return this;
    }

    public RegistrationPage checkModalTitle(String value) {
        $(".modal-title").shouldHave(text(value));
        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        $(".table").shouldHave(text(key), text(value));
        return this;
    }
}
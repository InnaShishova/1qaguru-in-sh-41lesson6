package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import tests.testdata.TestData;

public class RegFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phoneNumber)
                .setBirthDate(testData.day, testData.month, testData.year)
                .setSubject(testData.subject)
                .setHobby(testData.hobby)
                .uploadPicture(testData.picture)
                .setAddress(testData.address)
                .setStateAndCity(testData.state, testData.city)
                .submit();

        registrationPage.checkModalTitle(testData.successMessage)
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phoneNumber)
                .checkResult("Date of Birth", testData.expectedBirthDate)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.picture)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}
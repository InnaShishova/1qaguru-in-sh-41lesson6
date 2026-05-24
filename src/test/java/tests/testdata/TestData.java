package tests.testdata;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = faker.options().option("Male", "Female", "Other");
    public String phoneNumber = faker.phoneNumber().subscriberNumber(10);

    public String day = "15";
    public String month = "October";
    public String year = "2025";
    public String expectedBirthDate = day + " " + month + "," + year;

    public String subject = "English";
    public String hobby = "Reading";
    public String picture = "filepicture.jpg";
    public String address = faker.address().fullAddress();

    public String state = "Haryana";
    public String city = "Panipat";

    public String successMessage = "Thanks for submitting the form";
}
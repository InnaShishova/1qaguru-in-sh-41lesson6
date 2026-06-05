package tests.testdata;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();

    public String gender = faker.options().option(
            "Male",
            "Female",
            "Other"
    );

    public String phoneNumber = faker.phoneNumber().subscriberNumber(10);

    public String day = String.valueOf(
            faker.number().numberBetween(10, 28)
    );

    public String month = faker.options().option(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    );

    public String year = String.valueOf(
            faker.number().numberBetween(1960, 2008)
    );

    public String expectedBirthDate =
            day + " " + month + "," + year;

    public String subject = faker.options().option(
            "English",
            "Math",
            "Physics",
            "Chemistry",
            "Computer Science",
            "History"
    );

    public String hobby = faker.options().option(
            "Sports",
            "Reading",
            "Music"
    );

    public String picture = "filepicture.jpg";

    public String address = faker.address().fullAddress();

    public String state = faker.options().option(
            "NCR",
            "Uttar Pradesh",
            "Haryana",
            "Rajasthan"
    );

    public String city = getCityByState(state);

    public String successMessage =
            "Thanks for submitting the form";

    private String getCityByState(String state) {

        switch (state) {

            case "NCR":
                return faker.options().option(
                        "Delhi",
                        "Gurgaon",
                        "Noida"
                );

            case "Uttar Pradesh":
                return faker.options().option(
                        "Agra",
                        "Lucknow",
                        "Merrut"
                );

            case "Haryana":
                return faker.options().option(
                        "Karnal",
                        "Panipat"
                );

            case "Rajasthan":
                return faker.options().option(
                        "Jaipur",
                        "Jaiselmer"
                );

            default:
                throw new IllegalArgumentException(
                        "Unknown state: " + state
                );
        }
    }
}
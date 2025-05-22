package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String city;
    private boolean employed;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "unknown@example.com", "unknown", false);
    }

    public Person(String firstName, String lastName, int age, String email, String city, boolean employed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
        this.employed = employed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}

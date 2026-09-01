package com.mergeconflict;

public class CustomerRequest {

    private String customerId;;
    private String firstName2;
    private String firstName1;
    private String firstName;
    private String newName;
    private String middleName2;
    private String middleName1;
    private String middleName;
    private String lastName2;
    private String lastName1;
    private String lastName;
    private String surName;
    private String email1;
    private String email2;
    private String email3;
    private String email4;
    private String email;
    private String phoneNumber1;
    private String phoneNumber2;
    private String phoneNumber;
    private Integer age;
    private Integer age1;
    private Integer age2;
    private Integer age3;
    private Integer age4;

    public CustomerRequest() {
    }

    public CustomerRequest(String customerId, String firstName, String lastName,
                           String email, String phoneNumber, Integer age) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

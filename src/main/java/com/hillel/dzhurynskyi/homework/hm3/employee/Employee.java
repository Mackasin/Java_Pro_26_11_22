package com.hillel.dzhurynskyi.homework.hm3.employee;

public class Employee {
    private String pib;
    private String post;
    private String email;
    private String phoneNumb;
    private int age;

    public Employee(String pib, String post, String email, String phoneNumb, int age) {
        this.pib = pib;
        this.post = post;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.age = age;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pib='" + pib + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", age=" + age +
                '}';
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }
}

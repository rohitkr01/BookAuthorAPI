package com.example.BookAuthorAPI;

public class Author {
    private String authorName;
    private String gender;
    private int age;

    private int rating;

    public Author() {
        this.authorName = authorName;
        this.gender = gender;
        this.age = age;
        this.rating = rating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

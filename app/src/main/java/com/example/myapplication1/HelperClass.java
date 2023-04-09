package com.example.myapplication1;

public class HelperClass {
    String name, email, username, password, number;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //constructeur
    public HelperClass(String name, String email, String username, String password, String number) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.number = number;

    }
    public HelperClass() {
    }
}

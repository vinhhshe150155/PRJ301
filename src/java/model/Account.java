/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private String email, password, name, address, phone, date;

    public Account() {
    }

    public Account(String email, String passwowd) {
        this.email = email;
        this.password = passwowd;
    }

    public Account(int id, String email, String passwowd, String name, String address, String phone, String date) {
        this.id = id;
        this.email = email;
        this.password = passwowd;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswowd(String passwowd) {
        this.password = passwowd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

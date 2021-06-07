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
    private String email, passwowd, name, address, phone;

    public Account() {
    }

    public Account(String email, String passwowd) {
        this.email = email;
        this.passwowd = passwowd;
    }

    public Account(String email, String passwowd, String name, String address, String phone) {
        this.email = email;
        this.passwowd = passwowd;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswowd() {
        return passwowd;
    }

    public void setPasswowd(String passwowd) {
        this.passwowd = passwowd;
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


    
}

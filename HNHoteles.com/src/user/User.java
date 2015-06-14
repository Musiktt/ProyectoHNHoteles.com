/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

/**
 *
 * @author Stward
 */
public class User {
    private String name;
    private String lastName;
    private String gender;
    private String email;
    private String password; //contains 6-20 characters, unless 1 number

    public User() {
    }

    public User(String name, String lastName, String gender, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", password=" + password + '}';
    }
}   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao1;

import org.springframework.stereotype.Component;



/**
 *
 * @author celos
 */
@Component
public class Student {

    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "Student{" + "first name = " + firstname + ", last name = " + lastname + ", date of birth = " + dob + '}';
    }
    private String dob;
 

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

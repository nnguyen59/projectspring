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
public class Grade {

    /**
     *
     */
    public String subject;

    @Override
    public String toString() {
        return "Grade{" + "subject = " + subject + ", grade = " + grade + '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String grade;
}

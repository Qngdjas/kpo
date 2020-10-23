/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo6;

import java.io.Serializable;

/**
 *
 * @author Qngdjas
 */
public class Teacher implements Serializable {

    protected static String hours;
    private String idTeacher;
    private Subjects subjects;
    private String fullName;
    private String students;

    public Teacher(String idTeacher, String fullName, Subjects subjects, String numberOfHours, String students) {
        this.idTeacher = idTeacher;
        this.fullName = fullName;
        this.subjects = subjects;
        this.hours = numberOfHours;
        this.students = students;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher [idTeacher = " + idTeacher + ", fullName = " + fullName + ", subjects = " + subjects + ", hours = " + hours + ", students = " + students + "]";
    }
}

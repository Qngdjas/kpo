/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo62;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
// задание последовательности элементов XML
@XmlType(propOrder = {"idTeacher", "fullName", "subjects", "hours", "students"})
/**
 *
 * @author Qngdjas
 */
public class Teacher {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String idTeacher;
    @XmlElement(required = true)
    private String fullName;
    @XmlElement(required = true)
    private Subjects subjects = new Subjects();
    @XmlElement(required = false)
    private String hours;
    @XmlElement(required = false)
    private String students;

    public Teacher() {
    }

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
        return "\nTeacher = [idTeacher = " + idTeacher + ", fullName = " + fullName + ", subjects = " + subjects + ", hours = " + hours + ", students = " + students + "]";
    }

    @XmlRootElement
    @XmlType(propOrder = {"name", "day", "classroom"})

    public static class Subjects {

        private String name;
        private String classroom;
        private String day;

        public Subjects() {
        }

        public Subjects(String name, String classroom, String day) {
            this.name = name;
            this.classroom = classroom;
            this.day = day;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassroom() {
            return classroom;
        }

        public void setClassroom(String classroom) {
            this.classroom = classroom;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        @Override
        public String toString() {
            return "[name = " + name + ", day = " + day + ", classroom = " + classroom + "]";
        }
    }
}

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
public class Subjects implements Serializable {

    private String name;
    private String classroom;
    private String day;

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
        return "[name = " + name + ", classroom = " + classroom + ", day = " + day + "]";
    }
}

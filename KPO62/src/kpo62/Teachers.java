/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo62;

/**
 *
 * @author Qngdjas
 */
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "timetable")
public class Teachers {

    @XmlElement(name = "teacher")
    private ArrayList<Teacher> list = new ArrayList<Teacher>();

    public Teachers() {
        super();
    }

    public void setList(ArrayList<Teacher> list) {
        this.list = list;
    }

    public boolean add(Teacher st) {
        return list.add(st);
    }

    @Override
    public String toString() {
        return "Teachers = " + list + ".";
    }
}

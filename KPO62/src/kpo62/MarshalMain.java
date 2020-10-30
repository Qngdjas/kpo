/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo62;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Qngdjas
 */
public class MarshalMain {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Teachers.class);
            Marshaller m = context.createMarshaller();
            Teachers st = new Teachers() { // анонимный класс дл€ добавлени€ студентов
                {   // добавление первого учител€
                    Teacher.Subjects sub = new Teacher.Subjects("music", "Wednesday", "A505");
                    Teacher s = new Teacher("3", "Kuropatkin Arnold Viktorovich", sub, "6", "18");
                    this.add(s);
                    // добавление второго учител€
                    sub = new Teacher.Subjects("english", "Tuesday", "B101");
                    s = new Teacher("4", "Bukin Gennadiy", sub, "3", "14");
                    this.add(s);
                }
            };
            // ћаршаллинг в файл
            m.marshal(st, new FileOutputStream("src/kpo62/TimetableDatabseByMarshalling.xml"));
            // копи€ на консоль
            m.marshal(st, System.out);
            System.out.println("\nXML-файл создан");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
        }
    }
}

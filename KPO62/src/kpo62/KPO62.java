/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo62;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Qngdjas
 */
public class KPO62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Считывание существующего XML (Демаршаллинг)
            JAXBContext jc = JAXBContext.newInstance(Teachers.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("src/kpo62/TimetableDatabse.xml");
            Teachers teachers = (Teachers) u.unmarshal(reader);
            //Вывод прочитанного
            System.out.println(teachers);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

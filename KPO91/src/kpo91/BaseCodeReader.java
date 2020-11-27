/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo91;

/**
 *
 * @author Qngdjas
 */
public class BaseCodeReader {

    static String path;
    static String file;
    private boolean syntactic;
    private boolean lexical;

    public BaseCodeReader(String path) {
        this.path = path;
    }

    public void readFile() {
        file = "файл по пути - \"" + path + "\"";
        System.out.println("IТm BaseCodeReader, IТve done getFile");
    }

    @Override
    public String toString() {
        return file;
    }
}

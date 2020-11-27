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
public class KPO91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "таков путь";
        BaseCodeReader reader = new BaseCodeReader(path);
        reader.readFile();
        Conversation.codeConversation(BaseCodeReader.file);
    }
    
}

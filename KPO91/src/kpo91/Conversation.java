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
public class Conversation {

    public static void codeConversation(String code) {
        if (Analysis.syntaxAnalyser(code) && Analysis.lexicalAnalyser(code)) {
            System.out.println("I’m Conversation, I’ve done codeConversation");
        } else {
            System.out.println("I’m Conversation, I’ve not done codeConversation");
        }
    }
}

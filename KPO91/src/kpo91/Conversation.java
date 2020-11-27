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

    //ѕреобразование кода в машинный
    public static String codeConversation(String code) {
        //≈сли анализ кода прошел успешно, то выполнн€ем преобразование
        if (Analysis.syntaxAnalyser(code) && Analysis.lexicalAnalyser(code)) {
            System.out.println("IТm Conversation, IТve done codeConversation");
            return code;
        //»наче сообщение об ошибке преобразовани€
        } else {
            System.out.println("IТm Conversation, IТve not done codeConversation");
            return null;
        }
    }
}

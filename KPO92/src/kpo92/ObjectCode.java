/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo92;

/**
 *
 * @author Qngdjas
 */
class ObjectCode {

    private static String file;
    private static String[] lexicalTable;
    private static String[] identificatorTable;
    private static String dsr;
    private static String[] triads;
    private static String optimizationCode;
    private static boolean syntactic;
    private static boolean lexical;
    private static String objCode;

    public ObjectCode() {
//ѕолучение исходного кода
        file = "код"/*чтение исходного кода с консоли*/;
    }
    //—интаксический и лексический анализ кода

    public static void syntaxAnalyser(String text) {
        boolean conclusion = true/*јнализ синтаксиса(text)*/;
        syntactic = conclusion;
        System.out.println("IТm Conversation, IТve done syntaxAnalyser");
    }

    public static void lexicalAnalyser(String text) {
        boolean conclusion = true/*јнализ лексики(text)*/;
        lexical = conclusion;
        System.out.println("IТm Conversation, IТve done lexicalAnalyser");
    }

    public static void getLexicalTable() {
        lexicalTable = new String[0]/*—оставление таблицы лексем*/;
        System.out.println("IТm Conversation, IТve done getLexicalTable");
    }

    public static void getIdentificatorTable() {
        identificatorTable = new String[0]/*—оставление таблицы идентификаторов*/;
        System.out.println("IТm Conversation, IТve done getIdentificatorTable()");
    }

    public static void getDsr() {
        dsr = ""/*ѕолучение DSR*/;
        System.out.println("IТm Conversation, IТve done getDsr()");
    }

    public static void getTriads() {
        triads = new String[0]/* —оставление таблицы триад*/;
        System.out.println("IТm Conversation, IТve done getTriads()");
    }

    public static void getOptimizationResult() {
        syntaxAnalyser(file);
        lexicalAnalyser(file);
        if (syntactic & lexical) {
            optimizationCode = "Complete"/* —оставление оптимизированного кода*/;
            System.out.println("IТm Conversation, IТve done getOptimizationResult()");
        } else {
            optimizationCode = "Error";
            System.out.println("IТm Conversation, IТve not done getOptimizationResult()");
        }
    }

    public static void getCode() {
        objCode = ""/*ѕреобразование в объектный код(oprimizationCode)*/;
        System.out.println("IТm Conversation, IТve done getCode()");
    }

    public static void getData() {
        /*¬ывод промежуточных результатов*/;
        syntaxAnalyser(file);
        lexicalAnalyser(file);
        getLexicalTable();
        getIdentificatorTable();
        getDsr();
        getDsr();
        getOptimizationResult();
        getCode();
        System.out.println("IТm Conversation, IТve done getData()");
    }

}

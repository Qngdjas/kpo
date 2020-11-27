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
//��������� ��������� ����
        file = "���"/*������ ��������� ���� � �������*/;
    }
    //�������������� � ����������� ������ ����

    public static void syntaxAnalyser(String text) {
        boolean conclusion = true/*������ ����������(text)*/;
        syntactic = conclusion;
        System.out.println("I�m Conversation, I�ve done syntaxAnalyser");
    }

    public static void lexicalAnalyser(String text) {
        boolean conclusion = true/*������ �������(text)*/;
        lexical = conclusion;
        System.out.println("I�m Conversation, I�ve done lexicalAnalyser");
    }

    public static void getLexicalTable() {
        lexicalTable = new String[0]/*����������� ������� ������*/;
        System.out.println("I�m Conversation, I�ve done getLexicalTable");
    }

    public static void getIdentificatorTable() {
        identificatorTable = new String[0]/*����������� ������� ���������������*/;
        System.out.println("I�m Conversation, I�ve done getIdentificatorTable()");
    }

    public static void getDsr() {
        dsr = ""/*��������� DSR*/;
        System.out.println("I�m Conversation, I�ve done getDsr()");
    }

    public static void getTriads() {
        triads = new String[0]/* ����������� ������� �����*/;
        System.out.println("I�m Conversation, I�ve done getTriads()");
    }

    public static void getOptimizationResult() {
        syntaxAnalyser(file);
        lexicalAnalyser(file);
        if (syntactic & lexical) {
            optimizationCode = "Complete"/* ����������� ����������������� ����*/;
            System.out.println("I�m Conversation, I�ve done getOptimizationResult()");
        } else {
            optimizationCode = "Error";
            System.out.println("I�m Conversation, I�ve not done getOptimizationResult()");
        }
    }

    public static void getCode() {
        objCode = ""/*�������������� � ��������� ���(oprimizationCode)*/;
        System.out.println("I�m Conversation, I�ve done getCode()");
    }

    public static void getData() {
        /*����� ������������� �����������*/;
        syntaxAnalyser(file);
        lexicalAnalyser(file);
        getLexicalTable();
        getIdentificatorTable();
        getDsr();
        getDsr();
        getOptimizationResult();
        getCode();
        System.out.println("I�m Conversation, I�ve done getData()");
    }

}

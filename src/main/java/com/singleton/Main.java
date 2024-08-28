package com.singleton;

public class Main {
    public static void main(String[] args) {

        DataBaseConection dataBaseConection = DataBaseConection.getInstance();
        System.out.println(" "+ dataBaseConection);

        DataBaseConection dataBaseConection1 = DataBaseConection.getInstance();
        System.out.println(" "+ dataBaseConection1);
        System.out.println();

        dataBaseConection.conectDataBase();
        dataBaseConection1.conectDataBase();


    }
}
package com.singleton;

import javax.xml.crypto.Data;

/**
 * Rules important
 * 1.- You need to have an empty constructor and private
 * 2.- You need to have an attribute static private
 * 3.- You need to have a static method public wich  return the instance
 * **/
public class DataBaseConection {

    private static DataBaseConection instance;


    private DataBaseConection(){
        System.out.println("Creating object");
    }

    public static DataBaseConection getInstance(){
        if (instance==null){
            instance = new DataBaseConection();
        }
        return instance;
    }

    public void conectDataBase(){
        System.out.println("Connecting to database" + instance);
    }

    public void desconectDataBase(){
        System.out.println("Disconnecting to database = " + instance);
    }



}

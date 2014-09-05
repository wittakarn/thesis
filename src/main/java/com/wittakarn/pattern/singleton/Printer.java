/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.singleton;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class Printer implements Serializable{
    private String name;
    private static Printer instance;
    
    public static Printer getInstance(String name){
        Printer spooler = null;
        if(instance == null){
            instance = new Printer();
            instance.name = name;
            System.out.println("Getting spooler of printer :" + name);
            spooler = instance;
        }else{
            System.out.println("Spooler is not avaliable");
        }
        return spooler;
    }
    
    public static void returnInstance(Printer spooler){
        if(instance != null && spooler.equals(instance)){
            System.out.println("Printer " + spooler.name + " is now avaliable");
            spooler = null;
            instance = null;
        }else{
            System.out.println("Spooler is now avaliable or passing wrong spoller");
        }
    }
    
    public void print(){
        if(instance != null){
            System.out.println("Paper had been printed finish");
        }else{
            System.out.println("Spooler is not avaliable");
        }
    }
}

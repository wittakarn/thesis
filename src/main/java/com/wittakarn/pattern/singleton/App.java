/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.singleton;

/**
 *
 * @author Wittakarn
 */
public class App {
    public static void main(String[] args) {
        //Spooler of HP printer is get by client1
        Printer hp1 = Printer.getInstance("HP");        
        //Spooler of HP printer is get by client2
        Printer hp2 = Printer.getInstance("HP");        
        //client1 return spoller to context
        Printer.returnInstance(hp1);        
        //Spooler of HP printer is get by client3
        Printer hp3 = Printer.getInstance("HP");
    }
}

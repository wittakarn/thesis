/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.pattern.facade;

import com.wittakarn.pattern.singleton.Printer;
import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class PrinterFacade implements Serializable {
    /**
     * Wrapping three method into only one method, this method can reduce
     * complicated method caller.
     */
    public static void printPaper() {
        Printer spooler = Printer.getInstance("HP");
        spooler.print();
        Printer.returnInstance(spooler);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.general_hierarchy;

/**
 *
 * @author Wittakarn
 */
public class App {
    public static void main(String[] args) {
        Directory d1 = new Directory();
        d1.setName("d1");
        Directory d2 = new Directory();
        d2.setName("d2");
        Directory d3 = new Directory();
        d3.setName("d3");
        File f1 = new File("jpeg");
        f1.setName("f1");
        f1.setSize("1kb");
        File f2 = new File("txt");
        f2.setName("f2");
        f2.setSize("3kb");
        File f3 = new File("properties");
        f3.setName("f3");
        f3.setSize("10kb");
        File f4 = new File("inf");
        f4.setName("f4");
        f4.setSize("8kb");
        
        d3.addNewDirectory(d2);
        d3.setSize("18kb");
        d2.addNewDirectory(f3);
        d2.addNewDirectory(f4);
        d2.setSize("18kb");
        Directory.printAllFileSystem(d3);
        
        d1.addNewDirectory(f1);
        d1.addNewDirectory(f2);
        d2.setSize("11kb");
        Directory.printAllFileSystem(d1);
    }
}

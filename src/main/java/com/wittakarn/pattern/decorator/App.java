/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.pattern.decorator;

/**
 *
 * @author Wittakarn
 */
public class App {

    public static void main(String[] args) {
        Coffee coffee1 = new Cappuccino();
        coffee1 = new Mocha(coffee1);
        coffee1 = new Mocha(coffee1);
        coffee1 = new WhipCreme(coffee1);
        System.out.println(coffee1.getDescription() + " $" + coffee1.cost());
        Coffee coffee2 = new Espresso();
        coffee2 = new Milk(coffee2);
        coffee2 = new Mocha(coffee2);
        coffee2 = new WhipCreme(coffee2);
        System.out.println(coffee2.getDescription() + " $" + coffee2.cost());
    }
}

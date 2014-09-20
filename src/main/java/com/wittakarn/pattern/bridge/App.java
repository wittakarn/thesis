/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.pattern.bridge;

/**
 *
 * @author Wittakarn
 */
public class App {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[]{new SimulatorDuck(new RedheadDuck()), 
                                    new SimulatorDuck(new RubberDuck())};        
        for (Duck duck : ducks) {
            duck.display();
        }
    }
}

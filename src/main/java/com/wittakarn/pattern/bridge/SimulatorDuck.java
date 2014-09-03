/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.bridge;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class SimulatorDuck extends Duck implements Serializable{

    public SimulatorDuck(ActingDuck actingDuck) {
        super(actingDuck);
    }

    @Override
    public void display() {
        System.out.println("Display" + " ===== " + actingDuck.quack() + " ===== " + actingDuck.swim());
    }
    
}

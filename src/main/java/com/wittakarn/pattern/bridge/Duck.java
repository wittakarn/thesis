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
public abstract class Duck implements Serializable{
    protected ActingDuck actingDuck;
    
    protected Duck(ActingDuck actingDuck){
        this.actingDuck = actingDuck;
    }
    
    public abstract void display();
}

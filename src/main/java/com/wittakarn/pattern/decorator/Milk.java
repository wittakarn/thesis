/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.pattern.decorator;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class Milk extends CondimentDecorator implements Serializable {
    Coffee coffee;
    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    public double cost() {
        return 2.15 + coffee.cost();
    }
}

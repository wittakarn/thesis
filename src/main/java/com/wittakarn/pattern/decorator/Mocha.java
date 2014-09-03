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
public class Mocha extends CondimentDecorator implements Serializable {

    Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    public double cost() {
        return 4.20 + coffee.cost();
    }

}

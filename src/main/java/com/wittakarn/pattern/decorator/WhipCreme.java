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
public class WhipCreme extends CondimentDecorator implements Serializable {
    Coffee coffee;
    public WhipCreme(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", WhipCreme";
    }
    public double cost() {
        return 3.13 + coffee.cost();
    }
}

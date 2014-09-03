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
public class Cappuccino extends Coffee implements Serializable {

    public Cappuccino() {
        description = "Cappuccino";
    }

    public double cost() {
        return 70;
    }

}

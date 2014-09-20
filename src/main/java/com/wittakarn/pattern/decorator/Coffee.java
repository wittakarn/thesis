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
public abstract class Coffee implements Serializable{
    protected String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Coffee() {
    }
    public Coffee(String description) {
        this.description = description;
    }
    public abstract double cost();
}

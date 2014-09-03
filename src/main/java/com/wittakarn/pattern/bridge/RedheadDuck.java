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
public class RedheadDuck implements ActingDuck, Serializable{

    @Override
    public String quack() {
        return "Redhead duck quack";
    }

    @Override
    public String swim() {
        return "Redhead duck swim";
    }
    
}

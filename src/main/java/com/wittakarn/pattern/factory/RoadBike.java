/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.factory;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class RoadBike implements Bicycle, Serializable{

    @Override
    public void printDescription() {
        System.out.println("Description of RoadBike");
    }
    
}

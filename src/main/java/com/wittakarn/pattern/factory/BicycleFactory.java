/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.factory;

/**
 *
 * @author Wittakarn
 */
public class BicycleFactory {
    public static Bicycle createBicycle(String order){
        Bicycle bicycle = null;
        if(order.equals("MountainBike")){
            bicycle = new MountainBike();
        }else if(order.equals("RoadBike")){
            bicycle = new RoadBike();
        }
        return bicycle;
    }
}

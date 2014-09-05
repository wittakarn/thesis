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
public class App {
    public static void main(String[] args) {
        //create an instance of MountainBike
        Bicycle mount = BicycleFactory.createBicycle("MountainBike");
        mount.printDescription();
        
        //create an instance of RoadBike
        Bicycle road = BicycleFactory.createBicycle("RoadBike");
        road.printDescription();
    }
}

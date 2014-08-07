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
public class Robot implements Serializable{
    private static final long serialVersionUID = 1L;
    
    protected ActingRobot actingRobot;
    
    public void BindActingRobot(ActingRobot robot){
        actingRobot = robot;
    }
    
    public void React(){}
}

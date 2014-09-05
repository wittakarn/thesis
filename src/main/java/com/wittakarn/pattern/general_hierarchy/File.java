/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.general_hierarchy;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class File extends FileSystem implements Serializable{
    private String type;

    public File(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}

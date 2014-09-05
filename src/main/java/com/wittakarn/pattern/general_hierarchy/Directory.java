/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.pattern.general_hierarchy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wittakarn
 */
public class Directory extends FileSystem implements Serializable{
    
    private List<FileSystem> fileSystems;

    public Directory() {
        fileSystems = new ArrayList<FileSystem>();
    }

    public List<FileSystem> getFileSystems() {
        return fileSystems;
    }

    public void setFileSystems(List<FileSystem> fileSystems) {
        this.fileSystems = fileSystems;
    }
    
    public void addNewDirectory(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    
    public static void printAllFileSystem(Directory directory){
        Directory d;
        File f;
        
        System.out.println("Directory: " + directory.getName() + "/" + directory.getSize());
        for (FileSystem fileSystem : directory.getFileSystems()) {
            if(fileSystem instanceof Directory){
                d = (Directory)fileSystem;
                printAllFileSystem(d);
            }else{
                f = (File)fileSystem;
                System.out.println("File: "  + f.getName() + "/" + f.getSize());
            }
        }
    }
}

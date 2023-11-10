package org.example;

import java.util.Objects;

public abstract class HardwareDevice {
    private final String name;

    public HardwareDevice(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}

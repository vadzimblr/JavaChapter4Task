package org.example;

import java.util.Objects;

public class RAM extends HardwareDevice {
    private int size;
    public RAM(int size){
        super("RAM: Samsung");
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RAM ram = (RAM) o;
        return size == ram.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size,getName());
    }
    @Override
    public String toString() {
        return "["+ getName() +": " + size +"MB]";
    }
}

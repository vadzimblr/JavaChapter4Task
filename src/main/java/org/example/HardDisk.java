package org.example;

import java.util.Objects;

public class HardDisk extends HardwareDevice{
    private int size;
    public HardDisk(int size){
        super("HardDisk: Western Digital");
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
        HardDisk hardDisk = (HardDisk) o;
        return size == hardDisk.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size,getName());
    }

    @Override
    public String toString() {
        return "[" + getName()+ ": " + size +"G]";
    }
}

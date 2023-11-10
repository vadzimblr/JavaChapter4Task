package org.example;

public class DiskDrive extends HardwareDevice {


    public DiskDrive() {
        super("DiskDrive: HP Disk Drive");
    }
    @Override
    public String toString() {
        return "[" + this.getName() + "]";
    }

}

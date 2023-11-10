package org.example;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(1);
        HardDisk hardDisk = new HardDisk(512);
        RAM ram = new RAM(4096);
        DiskDrive diskDrive = new DiskDrive();
        Computer myComputer = new Computer(cpu, hardDisk, ram, diskDrive);
        myComputer.turnOn();
        System.out.println(myComputer.toString() + "\n");
        System.out.println("Объем hdd: " + myComputer.getHardDisk().getSize());
        myComputer.virusScan();
        myComputer.turnOff();

    }
}
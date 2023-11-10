package org.example;

import java.util.Objects;
import java.util.Random;

public class Computer {
    private CPU cpu;
    private HardDisk hardDisk;
    private RAM ram;
    private DiskDrive diskDrive;
    public Computer(CPU cpu, HardDisk hardDisk, RAM ram, DiskDrive diskDrive){
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.diskDrive = diskDrive;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setDiskDrive(DiskDrive diskDrive) {
        this.diskDrive = diskDrive;
    }

    public CPU getCpu() {
        return cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public RAM getRam() {
        return ram;
    }

    public DiskDrive getDiskDrive() {
        return diskDrive;
    }

    public void virusScan(){
        Random random = new Random();
        int virusExist = random.nextInt(2);
        if(virusExist == 1){
            System.out.println("Virus scan is completed. Virus detected");
        }
        else{
            System.out.println("Virus scan is completed. Virus not detected");
        }
    }
    public void turnOn(){
        System.out.println("The computer is starting up");
        System.out.println("["+cpu.getName()+"]: The "+cpu.getName()+"is running.");
        System.out.println("["+hardDisk.getName()+"]: The "+hardDisk.getName()+"is running.");
        System.out.println("["+ram.getName()+"]: The "+ram.getName()+"is running.");
        System.out.println("["+diskDrive.getName()+"]: The "+diskDrive.getName()+"is running.");
    }
    public void turnOff(){
        System.out.println("The computer is shutting down");
        System.out.println("["+cpu.getName()+"]: The "+cpu.getName()+"is shutting down.");
        System.out.println("["+hardDisk.getName()+"]: The "+hardDisk.getName()+"is shutting down.");
        System.out.println("["+ram.getName()+"]: The "+ram.getName()+"is shutting down.");
        System.out.println("["+diskDrive.getName()+"]: The "+diskDrive.getName()+"is shutting down.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Computer computer = (Computer) o;
        return Objects.equals(cpu, computer.cpu) && Objects.equals(hardDisk, computer.hardDisk) && Objects.equals(ram, computer.ram) && Objects.equals(diskDrive, computer.diskDrive);
    }

    @Override
    public String toString() {
        return "Computer [" + "CPU=" + cpu.toString() + ", HardDisk=" + hardDisk.toString() + ", RAM=" + ram.toString() +
                ", DiskDrive=" + diskDrive.toString() +
                "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, hardDisk, ram, diskDrive);
    }
}

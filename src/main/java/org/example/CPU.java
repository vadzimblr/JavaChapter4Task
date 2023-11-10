package org.example;

import java.util.Objects;

public class CPU extends HardwareDevice{
    private final int cores;
    public CPU(int cores){
        super("CPU: Intel Pentium 4");
        this.cores = cores;
    }
    public int getCores(){
        return this.cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CPU cpu = (CPU) o;
        return cores == cpu.cores;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores,getName());
    }

    @Override
    public String toString() {
        return "["+ getName() +
                "cores=" + cores +
                "]";
    }
}

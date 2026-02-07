package org.example;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.*;
import oshi.software.os.OperatingSystem;

public class Main {
    public static void main(String[] args) {

        SystemInfo InfoSistema = new SystemInfo();

        var hardware = InfoSistema.getHardware();

        System.out.println("====================================================");
        OperatingSystem os = InfoSistema.getOperatingSystem();
        System.out.println("Sistema operacional: " + os);
        System.out.println("====================================================");

       //info basicas de hardware - OS
        System.out.println("====================================================");
        System.out.println("CPU informacoes");

        CentralProcessor CPU  = hardware.getProcessor();
        System.out.println(CPU.getProcessorIdentifier().getName());
        System.out.println("====================================================");

        //memoriaRAM
        System.out.println("memoriaRAM info");
        GlobalMemory memoria = hardware.getMemory();
        System.out.println("Memória total: " + (memoria.getTotal() / 1024 / 1024 / 1024) + " GB");
        System.out.println("memoria Virtual: " + memoria.getVirtualMemory());
        System.out.println("memoria fisica: " + memoria.getPhysicalMemory().getFirst());
        System.out.println("memoria fisica: " + memoria.getPhysicalMemory().getLast());
        System.out.println("Memória disponível: " + (memoria.getAvailable() / 1024 / 1024 / 1024) + " GB");
        System.out.println("====================================================");

        //placa-mae info
        ComputerSystem Sistema = hardware.getComputerSystem();
        System.out.println(" PLaca mae informacoes");

        System.out.println("sistema info: " + Sistema.getBaseboard().getVersion());
        //modelo
        System.out.println("sistema info: " + Sistema.getBaseboard().getModel());
        //fabriccante
        System.out.println("sistema info Fabricante: " + Sistema.getManufacturer());
        System.out.println("sistema info NUmero de serie: " + Sistema.getSerialNumber());

        System.out.println("====================================================");
        System.out.println("BIOS:");

        //firmware representa a BIos
        System.out.println(" Bios informacao" + Sistema.getFirmware().getManufacturer() + " - " +  Sistema.getFirmware().getVersion() + " - " + Sistema.getFirmware().getName() );
        System.out.println(Sistema.getFirmware().getName());
        System.out.println(Sistema.getFirmware().getReleaseDate());

        System.out.println("====================================================");

        //gpu
        for (GraphicsCard gpu : hardware.getGraphicsCards()) {
            System.out.println("GPU: " + gpu.getName() + " - VRAM: " + (gpu.getVRam() / 1024 / 1024) + " MB");
        }
    }
}
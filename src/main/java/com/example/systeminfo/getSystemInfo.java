package com.example.systeminfo;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;

import java.util.List;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/13 15:50
 * @Version: 1.0.0
 **/
public class getSystemInfo {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            SystemInfo info = new SystemInfo();
            HardwareAbstractionLayer hardware = info.getHardware();
            GlobalMemory memory = hardware.getMemory();
            CentralProcessor processor = hardware.getProcessor();
            List<HWDiskStore> diskStores = hardware.getDiskStores();
            System.out.println("内存大小："+(double)memory.getTotal()/1024/1024/1024+"G");
            System.out.println("剩余内存："+(double)(memory.getTotal() - memory.getAvailable())/1024/1024/1024+"G");
            System.out.println("使用内存："+(double)memory.getAvailable()/1024/1024/1024+"G");
//            System.out.println(processor);
//            System.out.println(diskStores);
            Thread.sleep(300);
        }

    }
}

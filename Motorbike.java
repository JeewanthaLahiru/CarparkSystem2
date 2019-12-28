package com.company;
import java.util.Scanner;

public class Motorbike extends Vehicle {
    int engineCapacity;
    public void SetValues(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter ID Plate number: ");
        String ID=scan.next();
        setIdplate(ID);
        System.out.println("Enter the brand name: ");
        String brand=scan.next();
        setBrand(brand);
        System.out.println("Enter entry time: ");
        String time=scan.next();
        setTime(time);
        System.out.println("Enter the Engine Capacity: ");
        engineCapacity=scan.nextInt();
    }
}

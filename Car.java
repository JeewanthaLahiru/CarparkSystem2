package com.company;
import java.util.Scanner;

public class Car extends Vehicle{
    public int doors;
    public String color;
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
        System.out.println("enter the number of doors: ");
        doors=scan.nextInt();
        System.out.println("enter the color: ");
        color=scan.next();

    }
    public void GetValues(){
        System.out.println(getIdplate()+" "+getTime()+" "+getBrand()+" "+doors+" "+color);
    }
}

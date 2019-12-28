package com.company;
import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {
    public void CarPark(){
        Car car=new Car();
        Van van= new Van();
        Motorbike bike=new Motorbike();
        Scanner scan=new Scanner(System.in);
        int n=0,vh;
        while(n!=-1){
            System.out.println("1.Add a new Vehicle");
            System.out.println("2.Delete a Vehicle");
            System.out.println("3.Print Vehicle List");
            n=scan.nextInt();
            switch (n){
                case 1:
                    System.out.println("\t1.Car\n\t2.Van\n\t3.Motorbike");
                    vh=scan.nextInt();
                    switch (vh){
                        case 1:
                            car.SetValues();break;
                        case 2:
                            van.Setvalues();break;
                        case 3:
                            bike.SetValues();break;
                    }
                    break;
                case 2:
            }
        }
    }
}

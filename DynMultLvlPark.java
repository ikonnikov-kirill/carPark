/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.arraylist.dynMultLvlPark;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author workway
 */
public class DynMultLvlPark {

    Scanner scanner = new Scanner(System.in);
    Random guess = new Random();
    int count = 0;

    private ArrayList<ArrayList<Car>> floors = new ArrayList<ArrayList<Car>>();

    public DynMultLvlPark() {
        System.out.println("How many floors in parking?");
        int d = scanner.nextInt();
        for (int i = 0; i < d; i++) {
            ArrayList<Car> core = new ArrayList<>();
            floors.add(core);
            int e = guess.nextInt(14 - 7) + 7;
            for (int j = 0; j < e; j++) {
                core.add(null);
                count++;
            }
        }
        System.out.println("car park created. " + d + " floors and " + count + " carspaces");

        count = 0;
    }

    public void addCar(Car car) {
        while (true) {
            int q = guess.nextInt(floors.size());
            ArrayList<Car> floor = floors.get(q);
            int w = guess.nextInt(floor.size());
            if (floor.get(w) == null) {
                floor.set(w, car);
                System.out.print("On level - " + q + "; carspace - " + w + "; parked car - ");
                car.info();
                return;
            }
                     count++;
            if (count == 30) {
                System.out.println("no spare carspaces");
                count = 0;
                return;
            }
        }
//        for (int i = 0; i < floors.size(); i++) {
//            ArrayList<Car> floor = floors.get(i);
//            for (int j = 0; j < floor.size(); j++) {
//                while (true) {
//
//                    if (floor.get(j) == null) {
//                        floor.set(j, car);
//                        System.out.println("Car " + car + " parked on level " + i + " carspace " + j);
//                        return;
//                    }
//                }
//            }
//        }
    }

    public void takeCar() {
        System.out.println("Take car from level: ");
        int a = scanner.nextInt();
        System.out.println("On level " + a + " Take car from space: ");
        int b = scanner.nextInt();
        ArrayList<Car> floor = floors.get(a);
        Car one = floor.get(b);
        if (one == null) {
            System.out.println("No car parked here");
            return;
        }
        System.out.println("From level " + a + " space " + b + " taken car ");
        one.info();
        floor.set(b, null);
    }

    public void findCar() {
        System.out.println("Find car: ");
        String p = scanner.next();
        Boolean notFound = false;
        for (int i = 0; i < floors.size(); i++) {
            ArrayList<Car> floor = floors.get(i);
            for (int j = 0; j < floor.size(); j++) {
                if (i == floors.size() - 1 & j == floor.size() - 1 & floor.get(j) == null & notFound == false) {
                    System.out.println(p + " not found.");
                }
                if (floor.get(j) == null) {
                    continue;
                }
                if (floor.get(j) != null & floor.get(j).getRego().equals(p) | floor.get(j).getColour().equals(p)
                        | floor.get(j).getMake().equals(p) | floor.get(j).getModel().equals(p)) {
                    notFound = true;
                    System.out.println("level " + i + " carspace " + j + " match, for " + p);
                }

            }
        }
    }

    public void status() {
        for (int i = 0; i < floors.size(); i++) {
            ArrayList<Car> floor = floors.get(i);
            for (int j = 0; j < floor.size(); j++) {
                if (floor.get(j) != null) {
                    System.out.println("On Level " + i + " carspace " + j + " parked car");
                    Car one = floor.get(j);
                    one.info();
                }
            }
        }
    }
//    private parking.Car[][] mlp;
//    
//    public MultiLevelPark() {
//        int g = guess.nextInt(9 - 5) + 5;
//        mlp = new parking.Car[g][];
//        for (int i = 0; i < mlp.length; i++) {
//            int u = guess.nextInt(7 - 3) + 3;
//            mlp[i] = new parking.Car[u];
//        }
//        int count = 0;
//        for (int i = 0; i < mlp.length; i++) {
//            for (int j = 0; j < mlp[i].length; j++) {
//                count++;
//            }
//        }
//        System.out.println("Car Park has " + g + " levels and " + count + " carspaces");
//    }
//
//    public void addCar(parking.Car car) {
//        for (int i = 0; i < mlp.length; i++) {
//            for (int j = 0; j < mlp[i].length; j++) {
//                if (i == mlp.length - 1) {
//                    if (mlp[i] != null) {
//                        System.out.println("parking is full");
//                        continue;
//                    }
//                }
//
//                if (mlp[i][j] == null) {
//                    mlp[i][j] = car;
//                    System.out.print("Car ");
//                    car.info();
//                    System.out.println(" parked on level " + i + " carspace " + j);
//                    return;
//                }
//            }
//        }
//    }
//
//    public void takeCar(parking.Car car) {
//        System.out.println("Please enter parking level");
//        int k = scanner.nextInt();
//        System.out.println("Please enter parking space");
//        int l = scanner.nextInt();
//        car = mlp[k][l];
//        System.out.print("Car ");
//        car.info();
//        System.out.println("from level " + k + " car space " + l + " taken away");
//        mlp[k][l] = null;
//    }
//
//    public void findCar() {
//        System.out.println("Please search car by ");
//        String g = scanner.next();
//        for (int i = 0; i < mlp.length; i++) {
//            for (int j = 0; j < mlp[i].length; j++) {
//                if (mlp[i][j] != null & mlp[i][j].getRego().equals(g) | mlp[i][j].getColour().equals(g)
//                        | mlp[i][j].getMake().equals(g) | mlp[i][j].getModel().equals(g)) {
//                    System.out.println("level " + i + " carspace " + j + " match, for " + g);
//                }
//            }
//        }
//    }
//
//    public void status() {
//        for (int i = 0; i < mlp.length; i++) {
//            for (int j = 0; j < mlp[i].length; j++) {
//                if (mlp[i][j] != null) {
//                    parking.Car one = mlp[i][j];
//                    System.out.println("parking level " + i + " space " + j + " Car ");
//                    one.info();
//                } else {
//                    System.out.println("parking level " + i + " space " + j + " no Car ");
//                }
//            }
//        }
//    }
//    
//    
//    
}

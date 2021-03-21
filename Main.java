/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.arraylist.dynMultLvlPark;

/**
 *
 * @author workway
 */
public class Main {

    public static void main(String[] args) {
        Car audi = new Car("abc123", "red", "audi", "a3");
        Car lada = new Car("bcd234", "yellow", "lada", "6");
        Car honda = new Car("cde345", "brown", "honda", "civic");
        Car ford = new Car("def456", "green", "ford", "mustang");
        
        DynMultLvlPark green = new DynMultLvlPark();
        green.addCar(lada);
        green.addCar(ford);
        green.addCar(audi);
        green.addCar(audi);
        green.addCar(honda);
        //green.takeCar();
        green.findCar();
        //green.status();
        
  }
}

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
public class Car {
    private String rego;
    private String colour;
    private String make;
    private String model;
    
    public Car (String rego, String colour, String make, String model) {
    this.rego=rego;
    this.colour=colour;
    this.make=make;
    this.model=model;
        System.out.println("New care created with reg "+rego+", colour "+colour+", make "+make+", model "+model);
    }
   
    public void info () {
        System.out.println("reg "+rego+", colour "+colour+", make "+make+", model "+model);
        
    }
    
    public String getRego() {
         return this.rego;
    }
    
    public String getColour () {
         return this.colour;
    }
    
    public String getMake () {
        return this.make;
    }
    
     public String getModel () {
        return this.model;
    } 
    
    
}

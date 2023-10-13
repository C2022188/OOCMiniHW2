/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Car car1 = new Car (130, "Ford", "KA","Red"); //creating an new object from class Car
       car1.getMake();
       car1.getType();
       car1.getSpeed();
       car1.getColour();
       
      System.out.println("The driver of the car: " + car1.getMake() + " " + car1.type + " - colour: " + car1.getColour() + ", exceed speed limit by " + car1.getSpeed() + " mph" ); 
      
      
      Airplane Air1 = new Airplane("Ryanair", "Boeing", "737-800", 189); //creating an new object from class Airplane
        Air1.getCompany();
        Air1.getMake();
        Air1.getType();
        Air1.getNumPassengers();
      
        System.out.println("On " + Air1.company + "'s " + Air1.make +" " + Air1.type + " has " + Air1.getNumPassengers() + " passengers."); //creating an new object from class Cruise
      
      Cruise Cru1 = new Cruise ("Royal Caribbean Cruises", "Oasis-class", "Quantum", 4000);
        Cru1.getCompany();
        Cru1.getMake();
        Cru1.getType();
        Cru1.getNumPassengers();
        
        System.out.println("On " + Cru1.company + "'s " + Cru1.make +" " + Cru1.type + " has " + Cru1.getNumPassengers() + " passengers.");
    }
}
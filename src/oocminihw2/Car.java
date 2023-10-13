/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author caroo
 */
public class Car extends Vehicle{ //class Car extends SuperClass Vehicle
    private String colour = "Red";

    public Car(float speed, String make, String type, String colour) {
        super(speed, make, type);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
  
}

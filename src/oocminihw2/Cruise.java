/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author caroo
 */
public class Cruise extends Airplane { //class Cruise extends class Airplane - because it's same information
    
    public String company = "Royal Caribbean Cruises";
    
    public Cruise(String company, String make, String type, int numPassengers) {
        super(company, make, type, numPassengers);
    }
    
}

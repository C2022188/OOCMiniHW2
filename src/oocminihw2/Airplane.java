/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author caroo
 */
public class Airplane extends Vehicle { //class Airplane extends SuperClass Vehicle
    
    public String company = "Ryanair";

    public Airplane(String company, String make, String type, int numPassengers) {
        super(make, type, numPassengers);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    

}

    

    


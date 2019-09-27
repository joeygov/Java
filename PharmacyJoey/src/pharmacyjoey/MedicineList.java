/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjoey;

import java.util.ArrayList;

/**
 *
 * @author destacamento_sd2022
 */
public class MedicineList {

    ArrayList<MedicineType> tambal = new ArrayList<>();
    private String medicineName;
    private String name;
    private String genericName;
    private float price;
    private int quantity;

    public MedicineList() {
    }

    public void setUsers(ArrayList<MedicineType> users) {
        this.tambal = tambal;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<MedicineType> getTambal() {
        return tambal;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getName() {
        return name;
    }

    public String getGenericName() {
        return genericName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString(){//overriding the toString() method  
            return "Name: "+name+"\nGenericname: "+genericName+ "\nPrice: "+ price;  
 }  

}

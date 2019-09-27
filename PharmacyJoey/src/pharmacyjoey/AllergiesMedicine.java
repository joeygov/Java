/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjoey;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author destacamento_sd2022
 */
public class AllergiesMedicine extends Medicine {

    public void showAllergiesMedicine() {
        List<Medicine> tambal = new ArrayList<Medicine>();

        // String brandName, String genericName, String dossage, String description, float price)
        tambal.add(new Medicine("Alerta", "antihistamine", "2x a day", "para sa ubo", 5));
        tambal.add(new Medicine("Benadryl", "antihistamine diphenhydramine ", "2x a day", "para sa ubo", 7));
        tambal.add(new Medicine("Chlor-Trimeton","antihistamine","3x a day", "para sa ubo", 6));
        tambal.add(new Medicine("Zyrtic", "antihistamine", "3x a day", "para sa ubo", 3));
        tambal.add(new Medicine("Claritin", "antihistamine", "4x a day", "para sa ubo", 5));
        
        System.out.println();
        System.out.println("MEDICINE FOR ALLERGIES:\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %40s %15s %20s %10s", "BRANDNAME", "GENIRICNAME", "DOSSAGE", "DESCRIPTION", "PRICE");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (Medicine ubo : tambal) {
            System.out.format("%20s %40s %15s %20s %10s", ubo.getBrandName(), ubo.getGenericName(), ubo.getDossage(), ubo.getDescription(), ubo.getPrice());
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }

}

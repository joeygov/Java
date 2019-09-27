/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjoey;

/**
 *
 * @author destacamento_sd2022
 */
public class Medicine {

    private String brandName;
    private String genericName;
    private String dossage;
    private String description;
    private double price;

    public Medicine() {
    }

    public Medicine(String brandName, String genericName, String dossage, String description, double price) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.dossage = dossage;
        this.description = description;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDossage() {
        return dossage;
    }

    public void setDossage(String dossage) {
        this.dossage = dossage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

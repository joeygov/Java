/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjoey;

import java.util.Scanner;

/**
 *
 * @author destacamento_sd2022
 */
public class PharmacyJoey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("CHOICES ARE:");
        System.out.println("1 for Cough Medicine\n2 for Pain Medicine\n3 Allergies Medicine\n4 To View All Medicines");
        System.out.print("Your Choice: ");
        AllergiesMedicine katol = new AllergiesMedicine();
        PainMedicine sakit = new PainMedicine();
        CoughMedicine ubo = new CoughMedicine();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                ubo.showCoughMedicine();
                break;
            case 2:
                sakit.showPainMedicine();
                break;
            case 3:
                katol.showAllergiesMedicine();
                break;
            case 4:
                ubo.showCoughMedicine();
                sakit.showPainMedicine();
                katol.showAllergiesMedicine();
                break;
            default:
                System.out.println("Invalid Cchoice!");
        }

    }
}

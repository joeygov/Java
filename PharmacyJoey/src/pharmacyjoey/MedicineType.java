/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjoey;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author destacamento_sd2022
 */
public class MedicineType extends CoughMedicine{

    public MedicineType() {
    }

    public void getOrder(String Orders){
        System.out.println("Please place your order: ");
        Scanner order = new Scanner(System.in);
        String item = order.next();
    }



}

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
public class Accounts {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> password = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("User Name: ");
            name.add(scanner.next());
            System.out.println("Password: ");
            password.add(scanner.nextInt());

//        System.out.println("Are you sure? ");
//        answer = scanner.next();
//        if (answer.equals("yes")) { //want it to go back to start another direcotry here
//            System.out.println("ACCOUNTS:");
//            System.out.println("Name: " + name + "\nPassword: " + password);
//        } else {
//
//        }
            for (String ngan : name) {
                System.out.printf(ngan);
            }

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1_prog6112;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class IceTask1_Prog6112 {

    public static void main(String[] args) {
        
        // Import Scanner object for user input
        Scanner kb = new Scanner(System.in);

        // Prompt the user for how many students there are
        System.out.print("Enter the number of students: ");
        int students = kb.nextInt();
        

        // two-dimensional array
        // Columns: 0 = Student Number, 1 = Challenge 1, 2 = Challenge 2, 3 = Challenge 3, 4 = Total Marks, 5 = Percentage
        double[][] results = new double[students][6];
    }
}

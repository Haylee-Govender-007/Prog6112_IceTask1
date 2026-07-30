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
        
        // Capture details for every student

        for (int i = 0; i < results.length; i++) {

            System.out.println("\nEnter details for student " + (i + 1));

            // Read student number
            System.out.print("Student number: ");
            results[i][0] = kb.nextInt();

            // Read Challenge 1 mark
            System.out.print("Challenge 1 mark: ");
            results[i][1] = kb.nextInt();

            // Read Challenge 2 mark
            System.out.print("Challenge 2 mark: ");
            results[i][2] = kb.nextInt();

            // Read Challenge 3 mark
            System.out.print("Challenge 3 mark: ");
            results[i][3] = kb.nextInt();

            // Calculate total marks
            results[i][4] = results[i][1]
                  + results[i][2]
                  + results[i][3];

            // Calculate percentage
            results[i][5] = (results[i][4] / 300.0) * 100;

}
    }
}

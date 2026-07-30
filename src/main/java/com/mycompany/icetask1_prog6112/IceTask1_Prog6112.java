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
        double[][] results = new double[students][5];
        
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
            
            }
        
        // Display Unsorted results
        System.out.println();
        System.out.println("UNSORTED RESULTS");
        displayResults(results);

        bubbleSort(results);

        // Display sorted results
        System.out.println();
        System.out.println("SORTED RESULTS");
        displayResults(results);
        
    }
    //Create method- bubbleSort
    public static void bubbleSort(double[][] valueToSort) {
        double[] temp;

        for (int i = 0; i < valueToSort.length - 1; i++) {
            for (int j = 0; j < valueToSort.length - 1 - i; j++) {

                if (valueToSort[j][4] < valueToSort[j + 1][4]) {
                    temp = valueToSort[j];
                    valueToSort[j] = valueToSort[j + 1];
                    valueToSort[j + 1] = temp;
                }//End of IF
            }//End of inner for
        }//End of outer for
    }//End of method
    
    //Create method- displayResults
    public static void displayResults(double[][] valueToSort) {

        System.out.println("Student Number\tChallenge 1\tChallenge 2\tChallenge 3\tPercentage");
        System.out.println("*".repeat(65));

        //loop-display each student record
        for (int i = 0; i < valueToSort.length; i++) {
            double percentage = (valueToSort[i][4] / 300 * 100);

            //Round to 2 decimal places without String.format
            long rounded = Math.round(percentage * 100); // e.g. 6667 for 66.67

            long wholePart = rounded / 100;
            long decimalPart = rounded % 100;

            String decimalStr = (decimalPart < 10) ? "0" + decimalPart : "" + decimalPart;
            String percentageDisplay = wholePart + "," + decimalStr + "%";

            int studentNumber = (int) valueToSort[i][0];
            int challenge1 = (int) valueToSort[i][1];
            int challenge2 = (int) valueToSort[i][2];
            int challenge3 = (int) valueToSort[i][3];

            System.out.println(studentNumber + "\t\t" + challenge1 + "\t\t" + challenge2 + "\t\t" + challenge3 + "\t\t" + percentageDisplay);
        }
    }
}

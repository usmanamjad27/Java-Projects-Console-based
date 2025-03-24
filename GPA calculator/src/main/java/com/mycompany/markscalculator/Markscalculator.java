/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.markscalculator;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Markscalculator {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input marks for quizzes
        double[] quizMarks = new double[4];
        double[] quizTotal = new double[4];
        System.out.println("Enter theory marks obtained and total marks for 4 quizzes:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Quiz " + (i + 1) + " marks obtained: ");
            quizMarks[i] = sc.nextDouble();
            System.out.print("Quiz " + (i + 1) + " total marks: ");
            quizTotal[i] = sc.nextDouble();
        }

        // Input marks for assignments
        double[] assignmentMarks = new double[4];
        double[] assignmentTotal = new double[4];
        System.out.println("Enter marks obtained and total marks for 4 assignments:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Assignment " + (i + 1) + " marks obtained: ");
            assignmentMarks[i] = sc.nextDouble();
            System.out.print("Assignment " + (i + 1) + " total marks: ");
            assignmentTotal[i] = sc.nextDouble();
        }

        // Input marks for midterm and final
        System.out.print("Enter your midterm marks obtained: ");
        double midterm = sc.nextDouble();
        System.out.print("Enter midterm total marks: ");
        double midtermTotal = sc.nextDouble();

        System.out.print("Enter your final exam marks obtained: ");
        double finalExam = sc.nextDouble();
        System.out.print("Enter final exam total marks: ");
        double finalTotal = sc.nextDouble();

        // Calculate percentages
        double quizPercentage = calculateWeightedAverage(quizMarks, quizTotal, 3.75);
        double assignmentPercentage = calculateWeightedAverage(assignmentMarks, assignmentTotal, 2.5);
        double midtermPercentage = (midterm / midtermTotal) * 25;
        double finalPercentage = (finalExam / finalTotal) * 50;

        // Total percentage
        double totalPercentage = quizPercentage + assignmentPercentage + midtermPercentage + finalPercentage;

        // Output the result
        System.out.printf("Your total percentage is: %.2f%%\n", totalPercentage);

        sc.close();
    }

    // Helper function to calculate weighted average
    public static double calculateWeightedAverage(double[] marks, double[] total, double weightPerItem) {
        double weightedTotal = 0;
        for (int i = 0; i < marks.length; i++) {
            weightedTotal += (marks[i] / total[i]) * weightPerItem;
        }
        return weightedTotal;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.markscalculator;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class labandtheorymarkscalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for quizzes
        double[] quizMarks = new double[4];
        double[] quizTotal = new double[4];
        System.out.println("Enter marks obtained and total marks for 4 quizzes:");
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

        // Input marks for midterm and final for theory
        System.out.print("Enter your midterm marks obtained (theory): ");
        double midtermTheory = sc.nextDouble();
        System.out.print("Enter midterm total marks (theory): ");
        double midtermTotalTheory = sc.nextDouble();

        System.out.print("Enter your final exam marks obtained (theory): ");
        double finalExamTheory = sc.nextDouble();
        System.out.print("Enter final exam total marks (theory): ");
        double finalTotalTheory = sc.nextDouble();

        // Input marks for lab assignments and midterm
        double[] labAssignmentMarks = new double[4];
        double[] labAssignmentTotal = new double[4];
        System.out.println("Enter marks obtained and total marks for 4 lab assignments:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Lab Assignment " + (i + 1) + " marks obtained: ");
            labAssignmentMarks[i] = sc.nextDouble();
            System.out.print("Lab Assignment " + (i + 1) + " total marks: ");
            labAssignmentTotal[i] = sc.nextDouble();
        }

        // Input marks for lab midterm
        System.out.print("Enter your lab midterm marks obtained: ");
        double labMidterm = sc.nextDouble();
        System.out.print("Enter lab midterm total marks: ");
        double labMidtermTotal = sc.nextDouble();

        // Input marks for lab final
        System.out.print("Enter your lab final marks obtained: ");
        double labFinal = sc.nextDouble();
        System.out.print("Enter lab final total marks: ");
        double labFinalTotal = sc.nextDouble();

        // Calculate theory percentages
        double quizPercentage = calculateWeightedAverage(quizMarks, quizTotal, 3.75);
        double assignmentPercentage = calculateWeightedAverage(assignmentMarks, assignmentTotal, 2.5);
        double midtermTheoryPercentage = (midtermTheory / midtermTotalTheory) * 25;
        double finalTheoryPercentage = (finalExamTheory / finalTotalTheory) * 50;

        // Theory total percentage
        double theoryPercentage = quizPercentage + assignmentPercentage + midtermTheoryPercentage + finalTheoryPercentage;

        // Calculate lab percentages
        double labAssignmentPercentage = calculateWeightedAverage(labAssignmentMarks, labAssignmentTotal, 6.25); // Lab Assignments (25% weight)
        double labMidtermPercentage = (labMidterm / labMidtermTotal) * 25;
        double labFinalPercentage = (labFinal / labFinalTotal) * 50; // Lab Final (50% weight)

        // Lab total percentage
        double labPercentage = labAssignmentPercentage + labMidtermPercentage + labFinalPercentage;

        // Total percentage (Theory + Lab)
        double totalPercentage = (theoryPercentage * 0.75) + (labPercentage * 0.25);

        // Output the result
        System.out.printf("Your total percentage (Theory + Lab) is: %.2f%%\n", totalPercentage);

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
 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praccode_l1_laxamanakingphillip;

/**
 *
 * @author admin
 */

import java.util.Scanner;

public class LA1_LaxamanaKingPhillip {
    public static void main(String[] args) {
        // PracCode_No1 - Java Output
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        // Display the entered information
        System.out.println("\nEntered Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);

        scanner.close();
        
    }
}

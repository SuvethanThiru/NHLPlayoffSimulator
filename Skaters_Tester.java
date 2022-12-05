/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_group_project;

/**
 *
 * @author suvethan
 */
import java.util.*;
public class Skaters_Tester 
{
  public static void main(String[] args) 
  {
    //Creating goalie objects
    Skater skater1 = new Skater("Ethan", "Letto", 15, 4, 19, "F");
    Skater skater2 = new Skater("Suvethan", "Thiru", 10, 4, 14, "F");
    Skater skater3 = new Skater("Aryan", "Patel", 5, 4, 9, "F");

    System.out.println("---START OF SKATER_TESTER---");

    //Printing information of objects and testing toString methods
    System.out.println("Skater 1: " + skater1);
    System.out.println("\nSkater 2: " + skater2);
    System.out.println("\nSkater 3: " + skater3);

    //Creating a scanner object and testing get and Try_To_Save methods for goalie1
    Scanner skaterTestScanner1 = new Scanner(System.in);
    System.out.println("\nSkater 1 (" + skater1.getGoals() + ", " + skater1.getAssists() + ", " + skater1.getPoints() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int skaterTestInput1 = Integer.parseInt(skaterTestScanner1.nextLine());
    System.out.println(skater1.Try_To_Score(skaterTestInput1));
    System.out.println("Total Stamina: " + skater1.staminaChange("Shot"));
    System.out.println("The game continues...");

    //Creating a scanner object and testing get and Try_To_Save methods for goalie2
    Scanner skaterTestScanner2 = new Scanner(System.in);
    System.out.println("\nSkater 2 (" + skater2.getGoals() + ", " + skater2.getAssists() + ", " + skater2.getPoints() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int skaterTestInput2 = Integer.parseInt(skaterTestScanner2.nextLine());
    System.out.println(skater2.Try_To_Score(skaterTestInput2));
    System.out.println("Total Stamina: " + skater2.staminaChange("Shot"));
    System.out.println("The game continues...");

    //Creating a scanner object and testing get and Try_To_Save methods for goalie3
    Scanner skaterTestScanner3 = new Scanner(System.in);
    System.out.println("\nSkater 3 (" + skater3.getGoals() + ", " + skater3.getAssists() + ", " + skater3.getPoints() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int skaterTestInput3 = Integer.parseInt(skaterTestScanner3.nextLine());
    System.out.println(skater3.Try_To_Score(skaterTestInput3));
    System.out.println("Total Stamina: " + skater3.staminaChange("Shot"));

    System.out.println("---END OF SKATER_TESTER---");
  }
}
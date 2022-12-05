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
public class Goalie_Tester 
{
  public static void main(String[] args) 
  {
    //Creating goalie objects
    Goalie goalie1 = new Goalie("Ethan", "Letto", 3.34, .900, 2, "SG");
    Goalie goalie2 = new Goalie("Suvethan", "Thiru", 2.32, .921, 2, "SG");
    Goalie goalie3 = new Goalie("Aryan", "Patel", 3.19, .700, 1, "BG");

    System.out.println("---START OF GOALIE_TESTER---");

    //Printing information of objects and testing toString methods
    System.out.println("Goalie 1: " + goalie1);
    System.out.println("\nGoalie 2: " + goalie2);
    System.out.println("\nGoalie 3: " + goalie3);

    //Creating a scanner object and testing get and Try_To_Save methods for goalie1
    Scanner goalieTestScanner1 = new Scanner(System.in);
    System.out.println("\nGoalie 1 (" + goalie1.getGAA() + ", " + goalie1.getSV() + ", " + goalie1.getSO() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int goalieTestInput1 = Integer.parseInt(goalieTestScanner1.nextLine());
    System.out.println(goalie1.Try_To_Save(goalieTestInput1));
    System.out.println("Total Stamina: " + goalie1.staminaChange("Shot"));
    System.out.println("The game continues...");

    //Creating a scanner object and testing get and Try_To_Save methods for goalie2
    Scanner goalieTestScanner2 = new Scanner(System.in);
    System.out.println("\nGoalie 2 (" + goalie2.getGAA() + ", " + goalie2.getSV() + ", " + goalie2.getSO() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int goalieTestInput2 = Integer.parseInt(goalieTestScanner2.nextLine());
    System.out.println(goalie2.Try_To_Save(goalieTestInput2));
    System.out.println("Total Stamina: " + goalie2.staminaChange("Shot"));
    System.out.println("The game continues...");

    //Creating a scanner object and testing get and Try_To_Save methods for goalie3
    Scanner goalieTestScanner3 = new Scanner(System.in);
    System.out.println("\nGoalie 3 (" + goalie3.getGAA() + ", " + goalie3.getSV() + ", " + goalie3.getSO() + ") encounters a goal opportunity...");
    System.out.println("Enter an input: ");
    int goalieTestInput3 = Integer.parseInt(goalieTestScanner3.nextLine());
    System.out.println(goalie3.Try_To_Save(goalieTestInput3));
    System.out.println("Total Stamina: " + goalie3.staminaChange("Shot"));

    System.out.println("---END OF GOALIE_TESTER---");
  }
}
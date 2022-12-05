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
/*
class Skater
A class that describes a Skater in a hockey game

Constructor
Skater( String First_Name , String Last_Name , Integer Goals , Integer Assists , Integer Points , String Position)

Methods
String toString()
int compareTo(Skater other)
String Try_To_Score(int userinput)
String getGoals()
String getAssists()
String getPoints()
double staminaChange(String action)
*/

import java.util.*;

//creating a child class of the abstract class
public class Skater extends HockeyPlayers {
  //Instance variables
  private Integer Goals; 
  private Integer Assists; 
  private Integer Points;
  double stam = totalStamina;

  //Creating a random object
  Random random = new Random();

  //Constructor
  public Skater( String First_Name , String Last_Name , Integer Goals , Integer Assists , Integer Points , String Position) {
    super(First_Name , Last_Name , Position); 
    this.Goals = Goals; 
    this.Assists = Assists;
    this.Points = Points;
    }
  
  public Skater( String First_Name , String Last_Name , String Position) {
    super(First_Name , Last_Name , Position); 
    }

  //Creating toString method
    public String toString() {
    return (super.toString() + "\nGoals: " + Goals + "    Assists: " + Assists +   "    Points: " + Points);
  }

  //Creating compareTo method
    public int compareTo(Skater other)
  {
    if (Points.compareTo(other.getPoints()) == 0)
    {
      return (Goals.compareTo(other.getGoals()));
    }
    
    else
    {
      return (Points.compareTo(other.getPoints()));
    }
  }    

  //Try to score method
    public String Try_To_Score(int userinput) {// only for one player playing against AI

      int j = random.nextInt(6 - 1 + 1 ) + 1;
      if (userinput == j) {

        int i = random.nextInt(6 - 1 + 1 ) + 1;
        if (i == 2 || i == 4)
        {
          return "save";
        }
        else
        {
          return "goal";
        }
      }
      else
      {
        return "miss";
      }
    }

  public String Try_To_Score2Player(int userinput, int userinput2) {// only for two players playing

      int j = random.nextInt(6 - 1 + 1 ) + 1;
      if (userinput == j) {

        int i = random.nextInt(6 - 1 + 1 ) + 1;
        if (userinput2 == i)
        {
          return "save";
        }
        else
        {
          return "goal";
        }
      }
      else
      {
        return "miss";
      }
    }

  //Creating get methods
    public int getGoals() {
    return Goals;
  }
  
  public int getAssists() {
    return Assists;
  }
  
  public int getPoints() {
    return Points;
  }

  //creating a method for the interface
  public double staminaChange(String action)
  {
    if (action.equals("Penatly"))
    {
      stam = stam + 10;
      return stam;
    }
    else if (action.equals("Shot"))
    {
      stam = stam - 7;
      return stam;
    }
    else
    {
      return stam;
    }
  }
} 
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
class Goalie
A class that describes a Goalie in a hockey game

Constructor
Goalie( String First_Name , String Last_Name , double GAA , double SV , Integer SO , String Position)

Methods
String toString()
int compareTo(Goalie other)
String Try_To_Save(int userinput)
String getGAA()
String getSV()
String getSO()
double staminaChange(String action)
*/

//creating a child class of the abstract class
public class Goalie extends HockeyPlayers{
  //Instance variables
  private double GAA;
  private double SV;
  private Integer SO;
  double stam = totalStamina;

  //Constructor
  public Goalie( String First_Name , String Last_Name , double GAA , double SV , Integer SO , String Position) {
    super(First_Name , Last_Name , Position); 
    this.GAA = GAA; 
    this.SV = SV;
    this.SO = SO;
  }

  //Creating a toString method
  public String toString() {
    return (super.toString() + "\nGoals Against Average: " + GAA + "    Save Percentage: " + SV + "    ShutOuts: " + SO);
  }

  //Try to save method

  public String Try_To_Save(int userinput) {// only for one player playing against AI

      int j = random.nextInt(6 - 1 + 1 ) + 1;
      if (j == 2 || j == 4) {

        int i = random.nextInt(6 - 1 + 1 ) + 1;
        if (userinput == i)
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

  public String Try_To_Save2Player(int userinput, int userinput2) {// only for two players

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
  public double getGAA() {
    return GAA;
  }
  
  public double getSV() {
    return SV;
  }
  
  public int getSO() {
    return SO;
  }

  //Creating a method for the interface
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
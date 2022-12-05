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
class HockeyPlayers
A class that describes a player

Constructor
HockeyPlayers( String First_Name , String Last_Name , String Position)

Methods
String toString()
void Player_Action()
int compareTo(HockeyPlayers other)
String getFirst_Name()
String getLast_Name()
String getPosition()
double staminaChange()
*/
import java.util.*;

interface Stamina
{
  public static final double totalStamina = 100;
  public double staminaChange();
}

//creating an abstract class
public abstract class HockeyPlayers implements Stamina, Comparable<HockeyPlayers>{
  //Instance variables
  protected String First_Name; 
  protected String Last_Name; 
  protected String Position; 

  //creating a scanner object
  Scanner scanner = new Scanner(System.in);

  //creating a random object
  Random random = new Random(); 

  //constructor
  public HockeyPlayers( String First_Name , String Last_Name , String Position) {
    this.First_Name = First_Name;
    this.Last_Name = Last_Name;
    this.Position = Position;
  } 

  //creating toString method
  public String toString() {
    return "First name: " + First_Name + "   Last name: " + Last_Name +   
"    Position: " + Position;
  } 

  //creating a method that carries out a player action
  public void Player_Action() {
    
    System.out.println("Choose a number from 1 - 6 to intiate an action ");
    int UserInput = scanner.nextInt();
    
    int i = random.nextInt(6 - 1 + 1) + 1; 
    
  }

  //creating compareTo method
  public int compareTo( HockeyPlayers other) {
    return 0;
  }

  //creating get methods
  public String getFirst_Name() {
    return First_Name;
  }
  
  public String getLast_Name() {
    return Last_Name;
  }
  
  public String getPosition() {
    return Position;
  }

  public double staminaChange()
  {
    return totalStamina;
  }
}

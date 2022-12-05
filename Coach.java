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
public class Coach 
{
  //Creating objects
  Scanner scanner = new Scanner(System.in);
  int Player_choice = scanner.nextInt();
  int Team_choice = scanner.nextInt(); 
  int Goalie_choice = scanner.nextInt(); 

  //Creating a method that allows the user to choose a team
  public void choose_Team() {
    System.out.println("Choose a number from 0 to 15 to choose a team" + Team_choice);
  }

  //Creating a method that allows the user to choose a player
  public void choose_Player() {
    System.out.println("Choose a number from 0 to 4 to choose a player to act" + Player_choice);
  }

  //Creating a method that allows the user to choose a goalie
  public void choose_Goalie(){
    System.out.println("Choose a number from 0 to 1 to choose a goalie" + Goalie_choice);
  }
}

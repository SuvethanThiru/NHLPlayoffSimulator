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
class Teams
A class that describes a Team in a hockey game

Constructor
public Teams( String T, String c, HockeyPlayers[] Goalie, HockeyPlayers[] Skater)
public Teams(String teamusing, String teamopp, String winningteam, String losingteam)

Methods
String toString()
int compareTo(Teams other)
String setteam1(String team)
String setteam2(String team)
void scorechangeteam1()
void scorechangeteam2()
String getscore()
int getteam1score()
int getteam2score()
int resetscore1()
int resetscore2()
String gamewinner()
String gameloser()
BigInteger viewership(int wins, intn losses)
*/

import java.util.*;
import java.math.BigInteger; //importing the BigInteger class

public class Teams implements Comparable<Teams>{
  //Instance variables
  protected String coach;
  protected String players;
  protected String teamname;
  protected String teamconf;
  protected String pentype;
  HockeyPlayers [] Goalies;
  HockeyPlayers [] Skaters;
  Skater [] Team1Players;
  Skater [] Team2Players;
  protected String winningteam;
  protected String losingteam;
  protected int scoreteam1 = 0;
  protected int scoreteam2 = 0;
  protected String team1 = "";
  protected String team2 = "";
  protected int rounds = 3;
  protected int periods = 3;
  protected String blank = "";
  //private BigInteger numberOfFans = new BigInteger("1500000");

  String getteamconf()  { return teamconf; }
  String getteamname()   { return teamname; }
  String getgoalie1()   { return Goalies [0].getLast_Name(); } 
  String getgoalie2()   { return Goalies [1].getLast_Name(); } 
  String getskater1()   { return Skaters [0].getLast_Name(); }
  String getskater2()   { return Skaters [1].getLast_Name(); }
  String getskater3()   { return Skaters [2].getLast_Name(); }
  String getskater4()   { return Skaters [3].getLast_Name(); }
  String getskater5()   { return Skaters [4].getLast_Name(); }

  //creating a random object
  Random random = new Random();

  //constructor
  public Teams( String T, String c, HockeyPlayers[] Goalie, HockeyPlayers[] Skater)
  {
    teamname = T; teamconf = c; Goalies = Goalie; Skaters = Skater; 
  }

  public Teams(String teamusing, String teamopp, String winningteam, String losingteam)
  {
    team2 = teamopp;
    team1 = teamusing;
    this.winningteam = winningteam;
    this.losingteam = losingteam;
    scoreteam1 = scoreteam1;
    scoreteam2 = scoreteam2;
  }

  //creating a compareTo method
  public int compareTo( Teams other)
  {
    if (teamconf.compareTo(other.getteamconf()) == 0)
    {
      return (teamname.compareTo(other.getteamname()));
    }
    
    else
    {
      return (teamconf.compareTo(other.getteamconf()));
    }
  }

  //creating a toString method
  public String toString()
  {
    return ("\nTeam Conference: " + getteamconf() + "\nTeam Name: " + getteamname()+ "\nPlayer #1: " +getskater1()+ "\nPlayer #2: " +getskater2()+ "\nPlayer #3: " +getskater3()+ "\nPlayer #4: " +getskater4()+ "\nPlayer #5: " +getskater5()+ "\nGoalie #1: " +getgoalie1()+ "\nGoalie #2: " +getgoalie2());
  } 

  //creating set methods
  public String setteam1(String team)
  {
    return team1 = team;
  }

  public String setteam2(String team)
  {
    return team2 = team;
  }

  //creating score changing methods
  public void scorechangeteam1()
  {
    scoreteam1 ++;
  }

  public void scorechangeteam2()
  {
    scoreteam2 ++;
  }

  //creating more get methods
  public String getscore ()
  {
    return team1 + ": " + scoreteam1 + " to "+ team2 + ": " + scoreteam2;
  }

  public int getteam1score()
  {
    return scoreteam1;
  }

  public int getteam2score()
  {
    return scoreteam2;
  }

  public int resetscore1()
  {
    return scoreteam1 = 0;
  }

  //creating a method to reset the score
  public int resetscore2()
  {
    return scoreteam2 = 0;
  }

  //creating a method to determine the winner
  public String gamewinner()
  {
    if (scoreteam1 > scoreteam2)
    {
      return team1;
    }
    else
    {
      return team2;
    }
  }

  //creating a method to determine the loser
  public String gameloser()
  {
    if (scoreteam1 > scoreteam2)
    {
      return team2;
    }
    else
    {
      return team1;
    }
  }

  //creating a method to determine the severity of a penalty
  public int Penalty (int avtime)
  {
    return 2;
  }

  public int Penalty (int avtime, int addtime, int i)
  {
    return 2 + i;
  }
  

  //creating a BigInteger method to calculate viewership based on wins and losses
  public BigInteger viewership(String team)
  {
    if (team.equals("new york rangers"))
    {
      return new BigInteger("12000000");
    }

    else if (team.equals("toronto maple leafs"))
    {
      return new BigInteger("18000000");
    }

    else if (team.equals("carolina hurracanes"))
    {
      return new BigInteger("6000000");
    }
    
    else if (team.equals("florida panthers"))
    {
      return new BigInteger("9000000");
    }

    else if (team.equals("boston bruins"))
    {
      return new BigInteger("2000000");
    }
    
    else if (team.equals("pittsburgh penguins"))
    {
      return new BigInteger("11000000");
    }

    else if (team.equals("tampa bay lightning"))
    {
      return new BigInteger("13000000");
    }
    
    else if (team.equals("washington capitals"))
    {
      return new BigInteger("5000000");
    }
    
    else if (team.equals("edmonton oilers"))
    {
      return new BigInteger("12500000");
    }

      else if (team.equals("la kings"))
    {
      return new BigInteger("4000000");
    }

    else if (team.equals("calgary flames"))
    {
      return new BigInteger("10500000");
    }
    
    else if (team.equals("dallas stars"))
    {
      return new BigInteger("7000000");
    }

    else if (team.equals("colorado avalanche"))
    {
      return new BigInteger("11000000");
    }

    else if (team.equals("nashville predators"))
    {
      return new BigInteger("3000000");
    }

    else if (team.equals("st.louis blues"))
    {
      return new BigInteger("2000000");
    }

    else if (team.equals("minnesota wild"))
    {
      return new BigInteger("5000000");
    }
      
    else
    {
      return new BigInteger("9000000");
    }
  }
}
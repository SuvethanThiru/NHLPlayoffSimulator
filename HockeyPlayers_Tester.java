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

public class HockeyPlayers_Tester {
  public static void main(String[] args) {

    //creating skater and goalie arrays for all teams
    HockeyPlayers [] TOR_Players;
    TOR_Players = new Skater[4];

    TOR_Players[0] = new Skater("Auston" , "Matthews" , 60 , 46 , 106 , "F");
    TOR_Players[1] = new Skater("Mitch" , "Marner" , 35 , 62 , 97 , "F");
    TOR_Players[2] = new Skater("William" , "Nylander" , 34 , 46 , 80 , "F");
    TOR_Players[3] = new Skater("Morgan" , "Rielly" , 10 , 58 , 68 , "D");
    TOR_Players[4] = new Skater("TJ" , "Brodie" , 4 , 24 , 28 , "D");

    HockeyPlayers [] TBL_Players; 
    TBL_Players = new Skater[4];
    
    TBL_Players[0] = new Skater("Steven", "Stamkos", 42, 64, 106, "F");
    TBL_Players[1] = new Skater("Nikita", "Kucherov", 25, 44, 69, "F");
    TBL_Players[2] = new Skater("Brayden", "Point", 28, 30, 58, "F");
    TBL_Players[3] = new Skater("Victor", "Hedman", 20, 65, 85, "D");
    TBL_Players[4] = new Skater("Mikhail", "Sergachev", 7, 31, 38, "D");
    
    HockeyPlayers [] FLA_Players; 
    FLA_Players = new Skater[4];
    
    FLA_Players[0] = new Skater("Jonathan", "Huberdeau", 30, 85, 115, "F");
    FLA_Players[1] = new Skater("Aleksander", "Barkov", 39, 49, 88, "F");
    FLA_Players[2] = new Skater("Sam", "Reinhart", 33, 49, 82, "F");
    FLA_Players[3] = new Skater("Aaron", "Ekblad", 15, 42, 57, "D");
    FLA_Players[4] = new Skater("Mackenzie", "Weegar", 8, 36, 44, "D");

    HockeyPlayers [] WSH_Players; 
    WSH_Players = new Skater[4];
    
    WSH_Players[0] = new Skater("Alex" , "Ovechkin" , 50 , 40 , 90 , "F");
    WSH_Players[1] = new Skater("Evgeny" , "Kuznetsov" , 24 , 54 , 78 ,"F");
    WSH_Players[2] = new Skater("Tom" , "Wilson" , 24 , 28 , 52 , "F");
    WSH_Players[3] = new Skater("John" , "Carlson" , 17 , 54 , 71 , "D");
    WSH_Players[4] = new Skater("Dmitry" , "Orlov" , 12 , 23 , 35 , "D");

    HockeyPlayers [] BOS_Players; 
    BOS_Players = new Skater[4];
    
    BOS_Players[0] = new Skater("Brad", "Marchand", 32, 42, 80, "F");
    BOS_Players[1] = new Skater("David", "Pastrnak", 40, 37, 77, "F");
    BOS_Players[2] = new Skater("Patrice", "Bergeron", 25, 40, 65, "F");
    BOS_Players[3] = new Skater("Charlie", "McAvoy", 10, 46, 56 ,"D");
    BOS_Players[4] = new Skater("Matt", "Grzelcyk", 4, 20, 24, "D");

    HockeyPlayers [] CAR_Players; 
    CAR_Players = new Skater[4];
    
    CAR_Players[0] = new Skater("Sebastian" ,  "Aho" , 37 , 44 , 81 , "F");
    CAR_Players[1] = new Skater("Andrei" , "Svechnikov" , 30 , 39 , 69 , "F");
    CAR_Players[2] = new Skater("Teuvo" , "Teravainen" , 22 , 43 , 65 , "F");
    CAR_Players[3] = new Skater("Tony" , "DeAngelo" , 10 , 41 , 51 , "D");
    CAR_Players[4] = new Skater("Jaccob" , "Slavin" , 4 , 38 , 42 , "D");

    HockeyPlayers [] NYR_Players; 
    NYR_Players = new Skater[4];
    
    NYR_Players[0] = new Skater("Artemi", "Panarin", 22, 74, 96, "F");
    NYR_Players[1] = new Skater("Mika", "Zibanejad", 29, 52, 81, "D");
    NYR_Players[2] = new Skater("Chris", "Kreider", 52, 25, 77, "F");
    NYR_Players[3] = new Skater("Adam", "Fox", 11, 63, 74, "D");
    NYR_Players[4] = new Skater("Jacob", "Trouba", 11, 28, 39, "D");

    HockeyPlayers [] PIT_Players; 
    PIT_Players = new Skater[4];
    
    PIT_Players[0] = new Skater("Jake" , "Geuntzel" , 40 , 44 , 84 , "F");
    PIT_Players[1] = new Skater("Sidney" , "Crosby" , 31 , 53 , 84 , "F");
    PIT_Players[2] = new Skater("Bryan" , "Rust" , 24 , 34 , 58 , "F");
    PIT_Players[3] = new Skater("Kris" , "Letang" , 10 , 58 , 68 , "D");
    PIT_Players[4] = new Skater("Mike" , "Matheson" , 11 , 20 , 31 , "D");

    HockeyPlayers [] COL_Players; 
    COL_Players = new Skater[4];
    
    COL_Players[0] = new Skater("Mikko", "Rantanen", 36, 56, 92, "F");
    COL_Players[1] = new Skater("Nathan", "MacKinnon", 32, 56, 88, "F");
    COL_Players[2] = new Skater("Nazem", "Kadri", 28, 59, 87, "D");
    COL_Players[3] = new Skater("Cale", "Makar", 28, 58, 86, "D");
    COL_Players[4] = new Skater("Devon", "Toews", 13, 44, 57, "D");

    HockeyPlayers [] NSH_Players; 
    NSH_Players = new Skater[4];
    
    NSH_Players[0] = new Skater("Matt", "Duchene", 43, 43, 86, "F");
    NSH_Players[1] = new Skater("Filip", "Forsburg", 42, 42, 64, "F");
    NSH_Players[2] = new Skater("Mikael", "Grandlund", 11, 53, 64, "F");
    NSH_Players[3] = new Skater("Roman", "Josi", 23, 73, 96, "D");
    NSH_Players[4] = new Skater("Mattias", "Ekholm", 6, 25, 31, "D");

    HockeyPlayers [] STL_Players; 
    STL_Players = new Skater[4];
    
    STL_Players[0] = new Skater("Vladimir" , "Tarasenko" , 34 , 48 , 82 , "F");
    STL_Players[1] = new Skater("Robert" , "Thomas" , 20 , 57 , 77 , "F");
    STL_Players[2] = new Skater("Pavel" , "Buchnevich" , 30 , 46 , 76 , "F");
    STL_Players[3] = new Skater("Justin" , "Faulk" , 16 ,31 ,47 , "D");
    STL_Players[4] = new Skater("Torey" , "Krug" , 9 , 34 , 43 , "D");

    HockeyPlayers [] MIN_Players; 
    MIN_Players = new Skater[4];
    
    MIN_Players[0] = new Skater("Kirill", "Kaprizov", 47, 61, 108, "F");
    MIN_Players[1] = new Skater("Kevin", "Fiala", 33, 52, 85, "F");
    MIN_Players[2] = new Skater("Mats", "Zuccarello", 24, 55, 79, "F");
    MIN_Players[3] = new Skater("Jared", "Spurgeon", 10, 30, 40, "D");
    MIN_Players[4] = new Skater("Jonas", "Brodin", 5, 25, 30, "D");
      
    HockeyPlayers [] EDM_Players; 
    EDM_Players = new Skater[4];
    
    EDM_Players[0] = new Skater("Connor" , "McDavid" , 44 , 79 , 123 , "F");
    EDM_Players[1] = new Skater("Leon" , "Draistial" , 55 , 55 , 110 , "F");
    EDM_Players[2] = new Skater("Zach" , "Hyman" , 27 , 27 , 54 , "F");
    EDM_Players[3] = new Skater("Evan" , "Bouchard" , 12 , 31 , 43 , "D");
    EDM_Players[4] = new Skater("Tyson" , "Barrie" , 7 , 34 , 41 , "D");

    HockeyPlayers [] LAK_Players; 
    LAK_Players = new Skater[4];
    
    LAK_Players[0] = new Skater("Anze" , "Kopitar" , 19 , 48 , 67 , "F");
    LAK_Players[1] = new Skater("Adrian" , "Kempe" , 35 , 19 , 54 , "F");
    LAK_Players[2] = new Skater("Phillip" , "Danault" , 27 , 24 , 51 , "F");
    LAK_Players[3] = new Skater("Drew" , "Doughty" , 7 , 24 , 31 , "D");
    LAK_Players[4] = new Skater("Sean" , "Durzi" , 3 , 24 , 27 , "D");

    HockeyPlayers [] CGY_Players; 
    CGY_Players = new Skater[4];
    
    CGY_Players[0] = new Skater("Johnny" , "Gaudreau" , 40 , 75 , 115 , "F");
    CGY_Players[1] = new Skater("Matthew" , "Tkachuk" , 42 , 62 , 104 , "F");
    CGY_Players[2] = new Skater("Elias" , "Lindholm" , 42 , 40 , 82 , "F");
    CGY_Players[3] = new Skater("Rasmus" , "Andersson" , 4 , 46 , 50 , "D");
    CGY_Players[4] = new Skater("Noah" , "Hanifin" , 10 , 38 , 48 , "D");

    HockeyPlayers [] DAL_Players; 
    DAL_Players = new Skater[4];
    
    DAL_Players[0] = new Skater("Joe" , "Pavelski" , 27 , 54 , 81 , "F");
    DAL_Players[1] = new Skater("Jason" , "Robertson" , 41 , 38 , 79 , "F");
    DAL_Players[2] = new Skater("Roope" , "Hintz" , 37 , 35 , 72 , "F");
    DAL_Players[3] = new Skater("John" , "Klingberg" , 6 , 41 , 47 , "D");
    DAL_Players[4] = new Skater("Miro" , "Heiskanen" , 5 , 31 , 36 , "D"); 

    HockeyPlayers [] TOR_Goalies; 
    TOR_Goalies = new Goalie[1];
  
    TOR_Goalies[0] = new Goalie("Jack" , "Campbell" , 2.64 , .914 , 5 ,"SG");
    TOR_Goalies[1] = new Goalie("Petr" , "Mrazek" , 3.34 , .888 , 0 ,"BG");
    
    HockeyPlayers [] TBL_Goalies;
    TBL_Goalies = new Goalie[1];
      
    TBL_Goalies[0] = new Goalie("Andrei" , "Vasilevskiy" , 2.49 , .916 , 2 , "SG");
    TBL_Goalies[1] = new Goalie("Brian" , "Elliot" , 2.43 , .912 , 1 , "BG");
    
    HockeyPlayers [] FLA_Goalies;
    FLA_Goalies = new Goalie[1];
  
    FLA_Goalies[0] = new Goalie("Sergei" , "Bobrovsky" , 2.67 , .913 , 3 , "SG");
    FLA_Goalies[1] = new Goalie("Spencer" , "Knight" , 2.79 , .908 , 2 , "BG");
    
    HockeyPlayers [] WSH_Goalies;
    WSH_Goalies = new Goalie[1];
  
    WSH_Goalies[0] = new Goalie("Ilya" , "Samsonov" , 3.02 , .896 , 3 , "SG");
    WSH_Goalies[1] = new Goalie("Vitek" , "Vanecek" , 2.67 , .908 , 4 , "BG");

    HockeyPlayers [] BOS_Goalies;    
    BOS_Goalies = new Goalie[1];
  
    BOS_Goalies[0] = new Goalie("Linus" , "Ullmark" , 2.45 , .917 , 1 , "SG");
    BOS_Goalies[1] = new Goalie("Jeremy" , "Swayman" , 2.41 , .914 , 3 , "BG" );

    HockeyPlayers [] CAR_Goalies; 
    CAR_Goalies = new Goalie[1];
  
    CAR_Goalies[0] = new Goalie("Frederik" , "Anderson" , 2.17 , .922 , 4 , "SG");
    CAR_Goalies[1] = new Goalie("Antti" , "Raanta" , 2.45 , .912 , 2 , "BG");
    
    HockeyPlayers [] NYR_Goalies;
    NYR_Goalies = new Goalie[1];
  
    NYR_Goalies[0] = new Goalie("Igor" , "Shesterkin" , 2.07 , .935 , 6 , "SG");
    NYR_Goalies[1] = new Goalie("Alexander" , "Georgiev" , 2.92 , 8.98 , 2 , "BG");  
    
    HockeyPlayers [] PIT_Goalies;
    PIT_Goalies = new Goalie[1];
  
    PIT_Goalies[0] = new Goalie("Tristan" , "Jarry" , 2.42 , .919 , 4 , "SG");
    PIT_Goalies[1] = new Goalie("Casey" , "DeSmith" , 2.79 , .914 , 3 , "BG");
    
    HockeyPlayers [] COL_Goalies;   
    COL_Goalies = new Goalie[1];
  
    COL_Goalies[0] = new Goalie("Darcy" , "Keumper" , 2.54 , .921 , 5 , "SG");
    COL_Goalies[1] = new Goalie("Pavel" , "Francouz" , 2.55 , .916 , 2 , "BG");
    
    HockeyPlayers [] NSH_Goalies;  
    NSH_Goalies = new Goalie[1];
  
    NSH_Goalies[0] = new Goalie("Juuse" , "Saros" , 2.64 , .918 , 4 , "SG");
    NSH_Goalies[1] = new Goalie("David" , "Rittich" , 3.57 , .886 , 0 , "BG");
    
    HockeyPlayers [] STL_Goalies;
    STL_Goalies = new Goalie[1];
  
    STL_Goalies[0] = new Goalie("Ville" , "Husso" , 2.56 , .919 , 2 , "SG");
    STL_Goalies[1] = new Goalie("Jordan" , "Binnington" , 3.13 , .901 , 2 , "BG");
    
    HockeyPlayers [] MIN_Goalies; 
    MIN_Goalies = new Goalie[1];
  
    MIN_Goalies[0] = new Goalie("Cam" , "Talbot" , 2.76 , .911 , 3 , "SG");
    MIN_Goalies[1] = new Goalie("Marc-Andre" , "Fleury" , 2.74 , .910 , 0 , "BG");
    
    HockeyPlayers [] EDM_Goalies;
    EDM_Goalies = new Goalie[1];
  
    EDM_Goalies[0] = new Goalie("Mikko" , "Koskinen" , 3.10 , .903 , 1 , "SG");
    EDM_Goalies[1] = new Goalie("Mike" , "Smith" , 2.81 , .915 , 2 , "BG");
    
    HockeyPlayers [] LAK_Goalies;
    LAK_Goalies = new Goalie[1];
  
    LAK_Goalies[0] = new Goalie("Jonathan" , "Quick" , 2.59 , .910 , 2 , "SG");
    LAK_Goalies[1] = new Goalie("Cal" , "Petersen" , 2.89 , .895 , 3 , "BG");
    
    HockeyPlayers [] CGY_Goalies;    
    CGY_Goalies = new Goalie[1];
      
    CGY_Goalies[0] = new Goalie("Jacob" , "Markstrom" , 2.22 , .922 , 9 , "SG");
    CGY_Goalies[1] = new Goalie("Dan" , "Vladar" , 2.75 , .906 , 2 , "BG");
    
    HockeyPlayers [] DAL_Goalies; 
    DAL_Goalies = new Goalie[1];
      
    DAL_Goalies[0] = new Goalie("Jake" , "Oettinger" , 2.53 , .914 , 1 , "SG");
    DAL_Goalies[1] = new Goalie("Braden" , "Holtby" , 2.78 , .913 , 0 , "BG");
    
TOR_Players[1].toString();
    

    //Creating an array of goal scenarios
   String [] Goal_Scenario;
    Goal_Scenario = new String [3];
    Goal_Scenario[0] = ("The player chosen takes a slap shot from the point..");
    Goal_Scenario[1] = ("The player chosen breaks into the zone gets passed the defence and shoots...");
    Goal_Scenario[2] = ("The player chosen gets a pass from the point he takes a wrist shot...");  

    //Creating an array of miss scenarios
  String [] Miss_Scenario;
  Miss_Scenario = new String [3]; 
    Miss_Scenario[0] = ("The player chosen skates into the zone and takes a slap shot...");
    Miss_Scenario[1] = ("The player chosen gets a pass into the zone, skates around the net and shoots...");  
    Miss_Scenario[2] = ("The player chosen skates past the defence he is on a breakaway...");
    //}      

    //Creating an array of goal_save scenarios
  String [] Goal_Save_Scenario;
  Goal_Save_Scenario = new String [3]; 
    Goal_Save_Scenario[0] = ("...It hits the post and stays out NO GOAL");
    Goal_Save_Scenario[1] = ("...the shot is caught by the goalie NO GOAL");
    Goal_Save_Scenario[2] = ("... he trys to deke out the goalie but loses the puck NO GOAL");

    //Creating an array of goal_miss scenarios
  String [] Goal_Miss_Scenario;
  Goal_Miss_Scenario = new String [3];  
    Goal_Miss_Scenario[0] = ("...it hits the crossbar and goes in GOAL");
    Goal_Miss_Scenario[1] = ("...it beats the goalie on the high glove side, top corner GOAL");
    Goal_Miss_Scenario[2] = ("...and wires right past the goalie five hole, GOAL");
    
  }
}
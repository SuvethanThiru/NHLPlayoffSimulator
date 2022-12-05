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
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import java.util.Random;
import static javafx.application.Application.launch;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class CS_Group_Project extends Application
{
 
  @Override
  public void start(Stage primaryStage) 
  {
    double sceneWidth = 1800;
    double sceneHeight = 1000;
    
    Label title = new Label("NHL 2022 PLAYOFFS BRACKET");
    title.setTranslateY(-450);
    title.setStyle("-fx-font: 30 arial;");
    
    Rectangle westQuarter1 = new Rectangle(0, 0, 200, 75);
    westQuarter1.setFill(Color.WHITE);
    westQuarter1.setStroke(Color.BLACK);
    westQuarter1.setTranslateX(-750);
    westQuarter1.setTranslateY(-360);
    String westImageUrl1 = "https://upload.wikimedia.org/wikipedia/en/thumb/4/45/Colorado_Avalanche_logo.svg/1200px-Colorado_Avalanche_logo.svg.png";
    Image westImage1 = new Image(westImageUrl1,100,35,true,true);
    ImageView westImageView1 = new ImageView(westImage1);     
    HBox col = new HBox();
    col.getChildren().add(westImageView1);
    col.setTranslateX(60);
    col.setTranslateY(122);
    Label colName = new Label("Colorado Avalanche");
    colName.setTranslateX(-725);
    colName.setTranslateY(-355);
    colName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter2 = new Rectangle(0, 0, 200, 75);
    westQuarter2.setFill(Color.WHITE);
    westQuarter2.setStroke(Color.BLACK);
    westQuarter2.setTranslateX(-750);
    westQuarter2.setTranslateY(-275);
    String westImageUrl2 = "https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/Nashville_Predators_Logo_%282011%29.svg/1200px-Nashville_Predators_Logo_%282011%29.svg.png";
    Image westImage2 = new Image(westImageUrl2,100,35,true,true);
    ImageView westImageView2 = new ImageView(westImage2);     
    HBox nsh = new HBox();
    nsh.getChildren().add(westImageView2);
    nsh.setTranslateX(60);
    nsh.setTranslateY(207);
    Label nshName = new Label("Nashville Predators");
    nshName.setTranslateX(-720);
    nshName.setTranslateY(-270);
    nshName.setStyle("-fx-font: 13 arial;");
    
    Rectangle westQuarter3 = new Rectangle(0, 0, 200, 75);
    westQuarter3.setFill(Color.WHITE);
    westQuarter3.setStroke(Color.BLACK);
    westQuarter3.setTranslateX(-750);
    westQuarter3.setTranslateY(-150);
    String westImageUrl3 = "https://upload.wikimedia.org/wikipedia/en/thumb/1/1b/Minnesota_Wild.svg/1200px-Minnesota_Wild.svg.png";
    Image westImage3 = new Image(westImageUrl3,100,35,true,true);
    ImageView westImageView3 = new ImageView(westImage3);     
    HBox min = new HBox();
    min.getChildren().add(westImageView3);
    min.setTranslateX(60);
    min.setTranslateY(327);
    Label minName = new Label("Minnesota Wild");
    minName.setTranslateX(-725);
    minName.setTranslateY(-145);
    minName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter4 = new Rectangle(0, 0, 200, 75);
    westQuarter4.setFill(Color.WHITE);
    westQuarter4.setStroke(Color.BLACK);
    westQuarter4.setTranslateX(-750);
    westQuarter4.setTranslateY(-65);
    String westImageUrl4 = "https://upload.wikimedia.org/wikipedia/en/thumb/e/ed/St._Louis_Blues_logo.svg/1200px-St._Louis_Blues_logo.svg.png";
    Image westImage4 = new Image(westImageUrl4,100,35,true,true);
    ImageView westImageView4 = new ImageView(westImage4);     
    HBox stl = new HBox();
    stl.getChildren().add(westImageView4);
    stl.setTranslateX(60);
    stl.setTranslateY(413);
    Label stlName = new Label("St. Louis Blues");
    stlName.setTranslateX(-725);
    stlName.setTranslateY(-60);
    stlName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter5 = new Rectangle(0, 0, 200, 75);
    westQuarter5.setFill(Color.WHITE);
    westQuarter5.setStroke(Color.BLACK);
    westQuarter5.setTranslateX(-750);
    westQuarter5.setTranslateY(60);
    String westImageUrl5 = "https://upload.wikimedia.org/wikipedia/en/thumb/6/61/Calgary_Flames_logo.svg/1200px-Calgary_Flames_logo.svg.png";
    Image westImage5 = new Image(westImageUrl5,100,35,true,true);
    ImageView westImageView5 = new ImageView(westImage5);     
    HBox cgy = new HBox();
    cgy.getChildren().add(westImageView5);
    cgy.setTranslateX(60);
    cgy.setTranslateY(533);
    Label cgyName = new Label("Calgary Flames");
    cgyName.setTranslateX(-725);
    cgyName.setTranslateY(60);
    cgyName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter6 = new Rectangle(0, 0, 200, 75);
    westQuarter6.setFill(Color.WHITE);
    westQuarter6.setStroke(Color.BLACK);
    westQuarter6.setTranslateX(-750);
    westQuarter6.setTranslateY(145);
    String westImageUrl6 = "https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Dallas_Stars_logo_%282013%29.svg/1200px-Dallas_Stars_logo_%282013%29.svg.png";
    Image westImage6 = new Image(westImageUrl6,100,35,true,true);
    ImageView westImageView6 = new ImageView(westImage6);     
    HBox dal = new HBox();
    dal.getChildren().add(westImageView6);
    dal.setTranslateX(60);
    dal.setTranslateY(619);
    Label dalName = new Label("Dallas Stars");
    dalName.setTranslateX(-725);
    dalName.setTranslateY(145);
    dalName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter7 = new Rectangle(0, 0, 200, 75);
    westQuarter7.setFill(Color.WHITE);
    westQuarter7.setStroke(Color.BLACK);
    westQuarter7.setTranslateX(-750);
    westQuarter7.setTranslateY(270);
    String westImageUrl7 = "https://upload.wikimedia.org/wikipedia/en/thumb/4/4d/Logo_Edmonton_Oilers.svg/1200px-Logo_Edmonton_Oilers.svg.png";
    Image westImage7 = new Image(westImageUrl7,100,35,true,true);
    ImageView westImageView7 = new ImageView(westImage7);     
    HBox edm = new HBox();
    edm.getChildren().add(westImageView7);
    edm.setTranslateX(60);
    edm.setTranslateY(739);
    Label edmName = new Label("Edmonton Oilers");
    edmName.setTranslateX(-725);
    edmName.setTranslateY(265);
    edmName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westQuarter8 = new Rectangle(0, 0, 200, 75);
    westQuarter8.setFill(Color.WHITE);
    westQuarter8.setStroke(Color.BLACK);
    westQuarter8.setTranslateX(-750);
    westQuarter8.setTranslateY(355);
    String westImageUrl8 = "https://upload.wikimedia.org/wikipedia/en/thumb/6/63/Los_Angeles_Kings_logo.svg/1200px-Los_Angeles_Kings_logo.svg.png";
    Image westImage8 = new Image(westImageUrl8,100,35,true,true);
    ImageView westImageView8 = new ImageView(westImage8);     
    HBox lak = new HBox();
    lak.getChildren().add(westImageView8);
    lak.setTranslateX(60);
    lak.setTranslateY(825);
    Label lakName = new Label("Los Angeles Kings");
    lakName.setTranslateX(-725);
    lakName.setTranslateY(350);
    lakName.setStyle("-fx-font: 15 arial;");
    
    Rectangle westSemi1 = new Rectangle(0, 0, 200, 75);
    westSemi1.setFill(Color.WHITE);
    westSemi1.setStroke(Color.BLACK);
    westSemi1.setTranslateX(-500);
    westSemi1.setTranslateY(-250);
    
    Rectangle westSemi2 = new Rectangle(0, 0, 200, 75);
    westSemi2.setFill(Color.WHITE);
    westSemi2.setStroke(Color.BLACK);
    westSemi2.setTranslateX(-500);
    westSemi2.setTranslateY(-165);
    
    Rectangle westSemi3 = new Rectangle(0, 0, 200, 75);
    westSemi3.setFill(Color.WHITE);
    westSemi3.setStroke(Color.BLACK);
    westSemi3.setTranslateX(-500);
    westSemi3.setTranslateY(170);
    
    Rectangle westSemi4 = new Rectangle(0, 0, 200, 75);
    westSemi4.setFill(Color.WHITE);
    westSemi4.setStroke(Color.BLACK);
    westSemi4.setTranslateX(-500);
    westSemi4.setTranslateY(255);
    
    Rectangle westFinals1 = new Rectangle(0, 0, 200, 75);
    westFinals1.setFill(Color.WHITE);
    westFinals1.setStroke(Color.BLACK);
    westFinals1.setTranslateX(-300);
    westFinals1.setTranslateY(-42.5);
    
    Rectangle westFinals2 = new Rectangle(0, 0, 200, 75);
    westFinals2.setFill(Color.WHITE);
    westFinals2.setStroke(Color.BLACK);
    westFinals2.setTranslateX(-300);
    westFinals2.setTranslateY(42.5);
    
    Rectangle eastQuarter1 = new Rectangle(0, 0, 200, 75);
    eastQuarter1.setFill(Color.WHITE);
    eastQuarter1.setStroke(Color.BLACK);
    eastQuarter1.setTranslateX(750);
    eastQuarter1.setTranslateY(-360);
    String eastImageUrl1 = "https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Florida_Panthers_2016_logo.svg/1200px-Florida_Panthers_2016_logo.svg.png";
    Image eastImage1 = new Image(eastImageUrl1,100,35,true,true);
    ImageView eastImageView1 = new ImageView(eastImage1);     
    HBox fla = new HBox();
    fla.getChildren().add(eastImageView1);
    fla.setTranslateX(1700);
    fla.setTranslateY(122);
    Label flaName = new Label("Florida Panthers");
    flaName.setTranslateX(715);
    flaName.setTranslateY(-355);
    flaName.setStyle("-fx-font: 15 arial;");
    
    Rectangle eastQuarter2 = new Rectangle(0, 0, 200, 75);
    eastQuarter2.setFill(Color.WHITE);
    eastQuarter2.setStroke(Color.BLACK);
    eastQuarter2.setTranslateX(750);
    eastQuarter2.setTranslateY(-275);
    String eastImageUrl2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Washington_Capitals.svg/1200px-Washington_Capitals.svg.png";
    Image eastImage2 = new Image(eastImageUrl2,100,35,true,true);
    ImageView eastImageView2 = new ImageView(eastImage2);     
    HBox wsh = new HBox();
    wsh.getChildren().add(eastImageView2);
    wsh.setTranslateX(1680);
    wsh.setTranslateY(207);
    Label wshName = new Label("Washington Capitals");
    wshName.setTranslateX(715);
    wshName.setTranslateY(-270);
    wshName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastQuarter3 = new Rectangle(0, 0, 200, 75);
    eastQuarter3.setFill(Color.WHITE);
    eastQuarter3.setStroke(Color.BLACK);
    eastQuarter3.setTranslateX(750);
    eastQuarter3.setTranslateY(-150);
    String eastImageUrl3 = "https://upload.wikimedia.org/wikipedia/en/thumb/b/b6/Toronto_Maple_Leafs_2016_logo.svg/1200px-Toronto_Maple_Leafs_2016_logo.svg.png";
    Image eastImage3 = new Image(eastImageUrl3,100,35,true,true);
    ImageView eastImageView3 = new ImageView(eastImage3);     
    HBox tor = new HBox();
    tor.getChildren().add(eastImageView3);
    tor.setTranslateX(1700);
    tor.setTranslateY(327);
    Label torName = new Label("Toronto Maple Leafs");
    torName.setTranslateX(715);
    torName.setTranslateY(-150);
    torName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastQuarter4 = new Rectangle(0, 0, 200, 75);
    eastQuarter4.setFill(Color.WHITE);
    eastQuarter4.setStroke(Color.BLACK);
    eastQuarter4.setTranslateX(750);
    eastQuarter4.setTranslateY(-65);
    String eastImageUrl4 = "https://upload.wikimedia.org/wikipedia/en/thumb/2/2f/Tampa_Bay_Lightning_Logo_2011.svg/1200px-Tampa_Bay_Lightning_Logo_2011.svg.png";
    Image eastImage4 = new Image(eastImageUrl4,100,35,true,true);
    ImageView eastImageView4 = new ImageView(eastImage4);     
    HBox tbl = new HBox();
    tbl.getChildren().add(eastImageView4);
    tbl.setTranslateX(1700);
    tbl.setTranslateY(413);
    Label tblName = new Label("Tampa Bay Lighting");
    tblName.setTranslateX(715);
    tblName.setTranslateY(-65);
    tblName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastQuarter5 = new Rectangle(0, 0, 200, 75);
    eastQuarter5.setFill(Color.WHITE);
    eastQuarter5.setStroke(Color.BLACK);
    eastQuarter5.setTranslateX(750);
    eastQuarter5.setTranslateY(60);
    String eastImageUrl5 = "https://upload.wikimedia.org/wikipedia/en/thumb/3/32/Carolina_Hurricanes.svg/1200px-Carolina_Hurricanes.svg.png";
    Image eastImage5 = new Image(eastImageUrl5,100,35,true,true);
    ImageView eastImageView5 = new ImageView(eastImage5);     
    HBox car = new HBox();
    car.getChildren().add(eastImageView5);
    car.setTranslateX(1680);
    car.setTranslateY(533);
    Label carName = new Label("Carolina Hurricanes");
    carName.setTranslateX(715);
    carName.setTranslateY(55);
    carName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastQuarter6 = new Rectangle(0, 0, 200, 75);
    eastQuarter6.setFill(Color.WHITE);
    eastQuarter6.setStroke(Color.BLACK);
    eastQuarter6.setTranslateX(750);
    eastQuarter6.setTranslateY(145);
    String eastImageUrl6 = "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Boston_Bruins.svg/1200px-Boston_Bruins.svg.png";
    Image eastImage6 = new Image(eastImageUrl6,100,35,true,true);
    ImageView eastImageView6 = new ImageView(eastImage6);     
    HBox bos = new HBox();
    bos.getChildren().add(eastImageView6);
    bos.setTranslateX(1700);
    bos.setTranslateY(619);
    Label bosName = new Label("Boston Bruins");
    bosName.setTranslateX(715);
    bosName.setTranslateY(140);
    bosName.setStyle("-fx-font: 15 arial;");
    
    Rectangle eastQuarter7 = new Rectangle(0, 0, 200, 75);
    eastQuarter7.setFill(Color.WHITE);
    eastQuarter7.setStroke(Color.BLACK);
    eastQuarter7.setTranslateX(750);
    eastQuarter7.setTranslateY(270);
    String eastImageUrl7 = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/New_York_Rangers.svg/1200px-New_York_Rangers.svg.png";
    Image eastImage7 = new Image(eastImageUrl7,100,35,true,true);
    ImageView eastImageView7 = new ImageView(eastImage7);     
    HBox nyr = new HBox();
    nyr.getChildren().add(eastImageView7);
    nyr.setTranslateX(1700);
    nyr.setTranslateY(739);
    Label nyrName = new Label("New York Rangers");
    nyrName.setTranslateX(715);
    nyrName.setTranslateY(260);
    nyrName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastQuarter8 = new Rectangle(0, 0, 200, 75);
    eastQuarter8.setFill(Color.WHITE);
    eastQuarter8.setStroke(Color.BLACK);
    eastQuarter8.setTranslateX(750);
    eastQuarter8.setTranslateY(355);
    String eastImageUrl8 = "https://upload.wikimedia.org/wikipedia/en/thumb/c/c0/Pittsburgh_Penguins_logo_%282016%29.svg/1200px-Pittsburgh_Penguins_logo_%282016%29.svg.png";
    Image eastImage8 = new Image(eastImageUrl8,100,35,true,true);
    ImageView eastImageView8 = new ImageView(eastImage8);     
    HBox pit = new HBox();
    pit.getChildren().add(eastImageView8);
    pit.setTranslateX(1700);
    pit.setTranslateY(825);
    Label pitName = new Label("Pittsburgh Penguins");
    pitName.setTranslateX(715);
    pitName.setTranslateY(345);
    pitName.setStyle("-fx-font: 13 arial;");
    
    Rectangle eastSemi1 = new Rectangle(0, 0, 200, 75);
    eastSemi1.setFill(Color.WHITE);
    eastSemi1.setStroke(Color.BLACK);
    eastSemi1.setTranslateX(500);
    eastSemi1.setTranslateY(-250);
    
    Rectangle eastSemi2 = new Rectangle(0, 0, 200, 75);
    eastSemi2.setFill(Color.WHITE);
    eastSemi2.setStroke(Color.BLACK);
    eastSemi2.setTranslateX(500);
    eastSemi2.setTranslateY(-165);
    
    Rectangle eastSemi3 = new Rectangle(0, 0, 200, 75);
    eastSemi3.setFill(Color.WHITE);
    eastSemi3.setStroke(Color.BLACK);
    eastSemi3.setTranslateX(500);
    eastSemi3.setTranslateY(170);
    
    Rectangle eastSemi4 = new Rectangle(0, 0, 200, 75);
    eastSemi4.setFill(Color.WHITE);
    eastSemi4.setStroke(Color.BLACK);
    eastSemi4.setTranslateX(500);
    eastSemi4.setTranslateY(255);
    
    Rectangle eastFinals1 = new Rectangle(0, 0, 200, 75);
    eastFinals1.setFill(Color.WHITE);
    eastFinals1.setStroke(Color.BLACK);
    eastFinals1.setTranslateX(300);
    eastFinals1.setTranslateY(-42.5);
    
    Rectangle eastFinals2 = new Rectangle(0, 0, 200, 75);
    eastFinals2.setFill(Color.WHITE);
    eastFinals2.setStroke(Color.BLACK);
    eastFinals2.setTranslateX(300);
    eastFinals2.setTranslateY(42.5);
    
    Rectangle westChamp = new Rectangle(0, 0, 250, 100);
    westChamp.setFill(new Color(0, 0, 1, 0.5));
    westChamp.setStroke(Color.BLACK);
    westChamp.setTranslateY(-175);
    
    Rectangle eastChamp = new Rectangle(0, 0, 250, 100);
    eastChamp.setFill(new Color(1, 0, 0, 0.5));
    eastChamp.setStroke(Color.BLACK);
    eastChamp.setTranslateY(175);
    
    Rectangle champ = new Rectangle(0, 0, 300, 150);
    champ.setFill(Color.WHITE);
    champ.setStroke(Color.BLACK);
    
    StackPane pane = new StackPane (title, westQuarter1, col, colName, westQuarter2, nsh, nshName, westQuarter3, min, minName, westQuarter4, stl, stlName, westQuarter5, cgy, cgyName, westQuarter6, dal, dalName, westQuarter7, edm, edmName, westQuarter8, lak, lakName, westSemi1, westSemi2, westSemi3, westSemi4, westFinals1, westFinals2, eastQuarter1, fla, flaName, eastQuarter2, wsh, wshName, eastQuarter3, tor, torName, eastQuarter4, tbl, tblName, eastQuarter5, car, carName, eastQuarter6, bos, bosName, eastQuarter7, nyr, nyrName, eastQuarter8, pit, pitName, eastSemi1, eastSemi2, eastSemi3, eastSemi4, eastFinals1, eastFinals2, westChamp, eastChamp, champ);
    Scene scene = new Scene (pane, sceneWidth, sceneHeight, Color.LIGHTGRAY);
    
    primaryStage.setTitle("NHL 2022 Playoffs Bracket");
    primaryStage.setScene (scene);
    primaryStage.show();
  }
  
  public static void main ( String[] args )
  {
    //creating a scanner object
    Scanner scanner = new Scanner (System.in);

    launch(args);
    
    //creating skater and goalie arrays
    Skater [] Team1Players = new Skater[5];
    Skater [] Team2Players = new Skater[5];
    Goalie [] Team1Goalies = new Goalie [2];
    Goalie [] Team2Goalies = new Goalie [2];

    //creating skater and goalie arrays for all teams
    HockeyPlayers [] TOR_Players;
    TOR_Players = new Skater[5];

    TOR_Players[0] = new Skater("Auston" , "Matthews" , 60 , 46 , 106 , "F");
    TOR_Players[1] = new Skater("Mitch" , "Marner" , 35 , 62 , 97 , "F");
    TOR_Players[2] = new Skater("William" , "Nylander" , 34 , 46 , 80 , "F");
    TOR_Players[3] = new Skater("Morgan" , "Rielly" , 10 , 58 , 68 , "D");
    TOR_Players[4] = new Skater("TJ" , "Brodie" , 4 , 24 , 28 , "D");

    HockeyPlayers [] TBL_Players; 
    TBL_Players = new Skater[5];
    
    TBL_Players[0] = new Skater("Steven", "Stamkos", 42, 64, 106, "F");
    TBL_Players[1] = new Skater("Nikita", "Kucherov", 25, 44, 69, "F");
    TBL_Players[2] = new Skater("Brayden", "Point", 28, 30, 58, "F");
    TBL_Players[3] = new Skater("Victor", "Hedman", 20, 65, 85, "D");
    TBL_Players[4] = new Skater("Mikhail", "Sergachev", 7, 31, 38, "D");
    
    HockeyPlayers [] FLA_Players; 
    FLA_Players = new Skater[5];
    
    FLA_Players[0] = new Skater("Jonathan", "Huberdeau", 30, 85, 115, "F");
    FLA_Players[1] = new Skater("Aleksander", "Barkov", 39, 49, 88, "F");
    FLA_Players[2] = new Skater("Sam", "Reinhart", 33, 49, 82, "F");
    FLA_Players[3] = new Skater("Aaron", "Ekblad", 15, 42, 57, "D");
    FLA_Players[4] = new Skater("Mackenzie", "Weegar", 8, 36, 44, "D");

    HockeyPlayers [] WSH_Players; 
    WSH_Players = new Skater[5];
    
    WSH_Players[0] = new Skater("Alex" , "Ovechkin" , 50 , 40 , 90 , "F");
    WSH_Players[1] = new Skater("Evgeny" , "Kuznetsov" , 24 , 54 , 78 ,"F");
    WSH_Players[2] = new Skater("Tom" , "Wilson" , 24 , 28 , 52 , "F");
    WSH_Players[3] = new Skater("John" , "Carlson" , 17 , 54 , 71 , "D");
    WSH_Players[4] = new Skater("Dmitry" , "Orlov" , 12 , 23 , 35 , "D");

    HockeyPlayers [] BOS_Players; 
    BOS_Players = new Skater[5];
    
    BOS_Players[0] = new Skater("Brad", "Marchand", 32, 42, 80, "F");
    BOS_Players[1] = new Skater("David", "Pastrnak", 40, 37, 77, "F");
    BOS_Players[2] = new Skater("Patrice", "Bergeron", 25, 40, 65, "F");
    BOS_Players[3] = new Skater("Charlie", "McAvoy", 10, 46, 56 ,"D");
    BOS_Players[4] = new Skater("Matt", "Grzelcyk", 4, 20, 24, "D");
    
    HockeyPlayers [] CAR_Players; 
    CAR_Players = new Skater[5];
    
    CAR_Players[0] = new Skater("Sebastian" ,  "Aho" , 37 , 44 , 81 , "F");
    CAR_Players[1] = new Skater("Andrei" , "Svechnikov" , 30 , 39 , 69 , "F");
    CAR_Players[2] = new Skater("Teuvo" , "Teravainen" , 22 , 43 , 65 , "F");
    CAR_Players[3] = new Skater("Tony" , "DeAngelo" , 10 , 41 , 51 , "D");
    CAR_Players[4] = new Skater("Jaccob" , "Slavin" , 4 , 38 , 42 , "D");
    
    HockeyPlayers [] NYR_Players; 
    NYR_Players = new Skater[5];
    
    NYR_Players[0] = new Skater("Artemi", "Panarin", 22, 74, 96, "F");
    NYR_Players[1] = new Skater("Mika", "Zibanejad", 29, 52, 81, "D");
    NYR_Players[2] = new Skater("Chris", "Kreider", 52, 25, 77, "F");
    NYR_Players[3] = new Skater("Adam", "Fox", 11, 63, 74, "D");
    NYR_Players[4] = new Skater("Jacob", "Trouba", 11, 28, 39, "D");
    
    HockeyPlayers [] PIT_Players; 
    PIT_Players = new Skater[5];
    
    PIT_Players[0] = new Skater("Jake" , "Geuntzel" , 40 , 44 , 84 , "F");
    PIT_Players[1] = new Skater("Sidney" , "Crosby" , 31 , 53 , 84 , "F");
    PIT_Players[2] = new Skater("Bryan" , "Rust" , 24 , 34 , 58 , "F");
    PIT_Players[3] = new Skater("Kris" , "Letang" , 10 , 58 , 68 , "D");
    PIT_Players[4] = new Skater("Mike" , "Matheson" , 11 , 20 , 31 , "D");

    HockeyPlayers [] COL_Players; 
    COL_Players = new Skater[5];
    
    COL_Players[0] = new Skater("Mikko", "Rantanen", 36, 56, 92, "F");
    COL_Players[1] = new Skater("Nathan", "MacKinnon", 32, 56, 88, "F");
    COL_Players[2] = new Skater("Nazem", "Kadri", 28, 59, 87, "D");
    COL_Players[3] = new Skater("Cale", "Makar", 28, 58, 86, "D");
    COL_Players[4] = new Skater("Devon", "Toews", 13, 44, 57, "D");

    HockeyPlayers [] NSH_Players; 
    NSH_Players = new Skater[5];
    
    NSH_Players[0] = new Skater("Matt", "Duchene", 43, 43, 86, "F");
    NSH_Players[1] = new Skater("Filip", "Forsburg", 42, 42, 64, "F");
    NSH_Players[2] = new Skater("Mikael", "Grandlund", 11, 53, 64, "F");
    NSH_Players[3] = new Skater("Roman", "Josi", 23, 73, 96, "D");
    NSH_Players[4] = new Skater("Mattias", "Ekholm", 6, 25, 31, "D");

    HockeyPlayers [] STL_Players; 
    STL_Players = new Skater[5];
    
    STL_Players[0] = new Skater("Vladimir" , "Tarasenko" , 34 , 48 , 82 , "F");
    STL_Players[1] = new Skater("Robert" , "Thomas" , 20 , 57 , 77 , "F");
    STL_Players[2] = new Skater("Pavel" , "Buchnevich" , 30 , 46 , 76 , "F");
    STL_Players[3] = new Skater("Justin" , "Faulk" , 16 ,31 ,47 , "D");
    STL_Players[4] = new Skater("Torey" , "Krug" , 9 , 34 , 43 , "D");

    HockeyPlayers [] MIN_Players; 
    MIN_Players = new Skater[5];
    
    MIN_Players[0] = new Skater("Kirill", "Kaprizov", 47, 61, 108, "F");
    MIN_Players[1] = new Skater("Kevin", "Fiala", 33, 52, 85, "F");
    MIN_Players[2] = new Skater("Mats", "Zuccarello", 24, 55, 79, "F");
    MIN_Players[3] = new Skater("Jared", "Spurgeon", 10, 30, 40, "D");
    MIN_Players[4] = new Skater("Jonas", "Brodin", 5, 25, 30, "D");
      
    HockeyPlayers [] EDM_Players; 
    EDM_Players = new Skater[5];
    
    EDM_Players[0] = new Skater("Connor" , "McDavid" , 44 , 79 , 123 , "F");
    EDM_Players[1] = new Skater("Leon" , "Draistial" , 55 , 55 , 110 , "F");
    EDM_Players[2] = new Skater("Zach" , "Hyman" , 27 , 27 , 54 , "F");
    EDM_Players[3] = new Skater("Evan" , "Bouchard" , 12 , 31 , 43 , "D");
    EDM_Players[4] = new Skater("Tyson" , "Barrie" , 7 , 34 , 41 , "D");

    HockeyPlayers [] LAK_Players; 
    LAK_Players = new Skater[5];
    
    LAK_Players[0] = new Skater("Anze" , "Kopitar" , 19 , 48 , 67 , "F");
    LAK_Players[1] = new Skater("Adrian" , "Kempe" , 35 , 19 , 54 , "F");
    LAK_Players[2] = new Skater("Phillip" , "Danault" , 27 , 24 , 51 , "F");
    LAK_Players[3] = new Skater("Drew" , "Doughty" , 7 , 24 , 31 , "D");
    LAK_Players[4] = new Skater("Sean" , "Durzi" , 3 , 24 , 27 , "D");

    HockeyPlayers [] CGY_Players; 
    CGY_Players = new Skater[5];
    
    CGY_Players[0] = new Skater("Johnny" , "Gaudreau" , 40 , 75 , 115 , "F");
    CGY_Players[1] = new Skater("Matthew" , "Tkachuk" , 42 , 62 , 104 , "F");
    CGY_Players[2] = new Skater("Elias" , "Lindholm" , 42 , 40 , 82 , "F");
    CGY_Players[3] = new Skater("Rasmus" , "Andersson" , 4 , 46 , 50 , "D");
    CGY_Players[4] = new Skater("Noah" , "Hanifin" , 10 , 38 , 48 , "D");

    HockeyPlayers [] DAL_Players; 
    DAL_Players = new Skater[5];
    
    DAL_Players[0] = new Skater("Joe" , "Pavelski" , 27 , 54 , 81 , "F");
    DAL_Players[1] = new Skater("Jason" , "Robertson" , 41 , 38 , 79 , "F");
    DAL_Players[2] = new Skater("Roope" , "Hintz" , 37 , 35 , 72 , "F");
    DAL_Players[3] = new Skater("John" , "Klingberg" , 6 , 41 , 47 , "D");
    DAL_Players[4] = new Skater("Miro" , "Heiskanen" , 5 , 31 , 36 , "D"); 
    
    Goalie [] TOR_Goalies; 
    TOR_Goalies = new Goalie[2]; 
    TOR_Goalies[0] = new Goalie("Jack" , "Campbell" , 2.64 , .914 , 5 ,"SG");
    TOR_Goalies[1] = new Goalie("Petr" , "Mrazek" , 3.34 , .888 , 0 ,"BG");
    
    HockeyPlayers [] TBL_Goalies;
    TBL_Goalies = new Goalie[2];
      
    TBL_Goalies[0] = new Goalie("Andrei" , "Vasilevskiy" , 2.49 , .916 , 2 , "SG");
    TBL_Goalies[1] = new Goalie("Brian" , "Elliot" , 2.43 , .912 , 1 , "BG");
    
    HockeyPlayers [] FLA_Goalies;
    FLA_Goalies = new Goalie[2];
  
    FLA_Goalies[0] = new Goalie("Sergei" , "Bobrovsky" , 2.67 , .913 , 3 , "SG");
    FLA_Goalies[1] = new Goalie("Spencer" , "Knight" , 2.79 , .908 , 2 , "BG");
    
    HockeyPlayers [] WSH_Goalies;
    WSH_Goalies = new Goalie[2];
  
    WSH_Goalies[0] = new Goalie("Ilya" , "Samsonov" , 3.02 , .896 , 3 , "SG");
    WSH_Goalies[1] = new Goalie("Vitek" , "Vanecek" , 2.67 , .908 , 4 , "BG");

    HockeyPlayers [] BOS_Goalies;    
    BOS_Goalies = new Goalie[2];
  
    BOS_Goalies[0] = new Goalie("Linus" , "Ullmark" , 2.45 , .917 , 1 , "SG");
    BOS_Goalies[1] = new Goalie("Jeremy" , "Swayman" , 2.41 , .914 , 3 , "BG" );

    HockeyPlayers [] CAR_Goalies; 
    CAR_Goalies = new Goalie[2];
  
    CAR_Goalies[0] = new Goalie("Frederik" , "Anderson" , 2.17 , .922 , 4 , "SG");
    CAR_Goalies[1] = new Goalie("Antti" , "Raanta" , 2.45 , .912 , 2 , "BG");
    
    HockeyPlayers [] NYR_Goalies;
    NYR_Goalies = new Goalie[2];
  
    NYR_Goalies[0] = new Goalie("Igor" , "Shesterkin" , 2.07 , .935 , 6 , "SG");
    NYR_Goalies[1] = new Goalie("Alexander" , "Georgiev" , 2.92 , .898 , 2 , "BG");  
    
    HockeyPlayers [] PIT_Goalies;
    PIT_Goalies = new Goalie[2];
  
    PIT_Goalies[0] = new Goalie("Tristan" , "Jarry" , 2.42 , .919 , 4 , "SG");
    PIT_Goalies[1] = new Goalie("Casey" , "DeSmith" , 2.79 , .914 , 3 , "BG");
    
    HockeyPlayers [] COL_Goalies;   
    COL_Goalies = new Goalie[2];
  
    COL_Goalies[0] = new Goalie("Darcy" , "Keumper" , 2.54 , .921 , 5 , "SG");
    COL_Goalies[1] = new Goalie("Pavel" , "Francouz" , 2.55 , .916 , 2 , "BG");
    
    HockeyPlayers [] NSH_Goalies;  
    NSH_Goalies = new Goalie[2];
  
    NSH_Goalies[0] = new Goalie("Juuse" , "Saros" , 2.64 , .918 , 4 , "SG");
    NSH_Goalies[1] = new Goalie("David" , "Rittich" , 3.57 , .886 , 0 , "BG");
    
    HockeyPlayers [] STL_Goalies;
    STL_Goalies = new Goalie[2];
  
    STL_Goalies[0] = new Goalie("Ville" , "Husso" , 2.56 , .919 , 2 , "SG");
    STL_Goalies[1] = new Goalie("Jordan" , "Binnington" , 3.13 , .901 , 2 , "BG");
    
    HockeyPlayers [] MIN_Goalies; 
    MIN_Goalies = new Goalie[2];
  
    MIN_Goalies[0] = new Goalie("Cam" , "Talbot" , 2.76 , .911 , 3 , "SG");
    MIN_Goalies[1] = new Goalie("Marc-Andre" , "Fleury" , 2.74 , .910 , 0 , "BG");
    
    HockeyPlayers [] EDM_Goalies;
    EDM_Goalies = new Goalie[2];
  
    EDM_Goalies[0] = new Goalie("Mikko" , "Koskinen" , 3.10 , .903 , 1 , "SG");
    EDM_Goalies[1] = new Goalie("Mike" , "Smith" , 2.81 , .915 , 2 , "BG");
    
    HockeyPlayers [] LAK_Goalies;
    LAK_Goalies = new Goalie[2];
  
    LAK_Goalies[0] = new Goalie("Jonathan" , "Quick" , 2.59 , .910 , 2 , "SG");
    LAK_Goalies[1] = new Goalie("Cal" , "Petersen" , 2.89 , .895 , 3 , "BG");
    
    HockeyPlayers [] CGY_Goalies;    
    CGY_Goalies = new Goalie[2];
      
    CGY_Goalies[0] = new Goalie("Jacob" , "Markstrom" , 2.22 , .922 , 9 , "SG");
    CGY_Goalies[1] = new Goalie("Dan" , "Vladar" , 2.75 , .906 , 2 , "BG");
    
    HockeyPlayers [] DAL_Goalies; 
    DAL_Goalies = new Goalie[2];
      
    DAL_Goalies[0] = new Goalie("Jake" , "Oettinger" , 2.53 , .914 , 1 , "SG");
    DAL_Goalies[1] = new Goalie("Braden" , "Holtby" , 2.78 , .913 , 0 , "BG");

    //creating a teams array
    Teams [] teams = new Teams [16];

    teams [0] = new Teams ("Toronto Maple Leafs", "Eastern" , TOR_Goalies, TOR_Players);
    teams [1] = new Teams ("New York Rangers", "Eastern", NYR_Goalies, NYR_Players);
    teams [4] = new Teams ("Tampa Bay Lightning", "Eastern" , TBL_Goalies, TBL_Players);
    teams [5] = new Teams ("Florida Panthers", "Eastern" , FLA_Goalies, FLA_Players);
    teams [15] = new Teams ("Washington Capitals", "Eastern", WSH_Goalies, WSH_Players);
    teams [14] = new Teams ("Boston Bruins", "Eastern" , BOS_Goalies, BOS_Players);
    teams [3] = new Teams ("Carolina Hurracanes", "Eastern" , CAR_Goalies, CAR_Players);
    teams [7] = new Teams ("Pittsburgh Penguins", "Eastern" , PIT_Goalies, PIT_Players);
    teams [6] = new Teams ("Colorado Avalanche", "Western", COL_Goalies, COL_Players);
    teams [9] = new Teams ("Nashville Predators", "Western" , NSH_Goalies, NSH_Players);
    teams [10] = new Teams ("St.Louis Blues", "Western" , STL_Goalies, STL_Players);
    teams [11] = new Teams ("Minnesota Wild", "Western" , MIN_Goalies, MIN_Players);
    teams [12] = new Teams ("Edmonton Oilers", "Western", EDM_Goalies, EDM_Players);
    teams [13] = new Teams ("Los Angeles Kings", "Western" , LAK_Goalies, LAK_Players);
    teams [2] = new Teams ("Calgary Flames", "Western" , CGY_Goalies, CGY_Players);
    teams [8] = new Teams ("Dallas Stars", "Western" , DAL_Goalies, DAL_Players);

    //creating an array for goal scenarios
    String [] Goal_Scenario;
    Goal_Scenario = new String [3];
    Goal_Scenario[0] = ("The player chosen takes a slap shot from the point..");
    Goal_Scenario[1] = ("The player chosen breaks into the zone gets passed the defence and shoots...");
    Goal_Scenario[2] = ("The player chosen gets a pass from the point he takes a wrist shot...");  

    //creating an array for miss scenarios
  String [] Miss_Scenario;
  Miss_Scenario = new String [3]; 
    Miss_Scenario[0] = ("The player chosen skates into the zone and takes a slap shot...");
    Miss_Scenario[1] = ("The player chosen gets a pass into the zone, skates around the net and shoots...");  
    Miss_Scenario[2] = ("The player chosen skates past the defence he is on a breakaway...");
    //}      

    //creating an array for goal_save scenarios
  String [] Goal_Save_Scenario;
  Goal_Save_Scenario = new String [3]; 
    Goal_Save_Scenario[0] = ("...It hits the post and stays out NO GOAL");
    Goal_Save_Scenario[1] = ("...the shot is caught by the goalie NO GOAL");
    Goal_Save_Scenario[2] = ("... he trys to deke out the goalie but loses the puck NO GOAL");

    //sorting the array
    Arrays.sort(teams);

    //creating a for loop
    for ( int i=0; i<teams.length; i++ )
    {
      System.out.println( teams[i].toString() );
    }

    //Printing a prompt message
    System.out.println("\nChoose a team from the teams avaliable and use the statistics to help your decision.");

    //creating a random object
    Random random = new Random();
    String teamchoose1  = scanner.nextLine();
    int teampos1 = 0;
    int team1lost = 0;
    int team2lost = 0;
    int ifchoosen = -1;
    int playerselect = 0;
    int indexarrlist;
    int teampos2 = 0;
    String teamvs = "";
    String teamvs2 = "";
    ArrayList <String> teamsleft = new ArrayList <String> ();
    Skater allskaters = new Skater ("Ethan", "Letto", 15, 4, 19, "F");
    countrounds ROUNDS = new countrounds ();
    int rounds = 0;
    int result;
    String playerchoose;
    Teams [] penalty = new Teams [16];
    penalty [0] = new Teams ("Toronto Maple Leafs", "Eastern" , TOR_Goalies, TOR_Players);
    Teams [] team = new Teams [16];
    team [0] = new Teams ("Toronto Maple Leafs", "Eastern" , TOR_Goalies, TOR_Players);
    int userinput;
    int userinput2;
    String actionreturn;
    int goalsteam1 = 0;
    int goalsteam2 = 0;
    int PM = 0;
    int APM = 0;

    //creating a for loop
    for ( int i=0; i<teams.length; i++ )
    {
      if (((teams[i].getteamname()).toLowerCase()).equals(teamchoose1.toLowerCase()))
      {
        teampos1 = i;
        ifchoosen = 0;
      }

      if (ifchoosen == -1 && i == teams.length -1)
      {
        i = 0;

        //allowing the first user to choose a team
        System.out.println("The team you have entered is was either not inputted fully or not on the list. Please enter the team you want to select.");
        teamchoose1  = scanner.nextLine();
      }
    }

    //creating another for loop
    for ( int i=0; i<teams.length; i++ )
    {
      if (!((teams[i].getteamname()).toLowerCase()).equals(teamchoose1.toLowerCase()) && (!(teams[teampos1].getteamconf()).equals(teams[i].getteamconf())))
      {
        System.out.println( teams[i].toString());
      }
    }

    //allowing the second user to choose a team
    System.out.println("\nChoose a team from the teams avaliable and use the statistics to help your decision. You cannot choose the team the other player has choosen.");

    String teamchoose2  = scanner.nextLine();

    ifchoosen = -1;

    //creating a for loop
    for ( int i=0; i < teams.length; i ++ )
    {
      if ((teamchoose2.toLowerCase()).equals(teamchoose1.toLowerCase()))
      {
        System.out.println("\nThe team you have choosen is has already been choosen, please choose a different team.");

        teamchoose2  = scanner.nextLine();

        i = 0;
      }
      else if (((teams[i].getteamname()).toLowerCase()).equals(teamchoose2.toLowerCase()))
      {
        teampos2 = i;
        if ((teams[teampos1].getteamconf()).equals(teams[i].getteamconf()))
        {
          System.out.println("\nThe team you have choosen is in the same conference as the other choosen team. Please choose another team.");

          teamchoose2  = scanner.nextLine();

          i = 0;
        
        }
        else
        {
          ifchoosen = 0;
        }
      }

      if (ifchoosen == -1 && i == teams.length -1)
      {
        i = 0;
        
        System.out.println("The team you have entered is was either not inputted fully or not on the list. Please enter the team you want to select.");
        teamchoose2 = scanner.nextLine();
      }
    }

    //Printing out an instruction message for the first user to choose a team
    System.out.println("\nNow its time for the game to start, the player that chose their team first, please get ready to play.");

    if ((teamchoose1.toLowerCase()).equals((teams[6].getteamname()).toLowerCase()))
    {
      teamvs = teams[1].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0] = ((Skater) TOR_Players [0]);
      Team1Players [1] = ((Skater) TOR_Players [1]);
      Team1Players [2] = ((Skater) TOR_Players [2]);
      Team1Players [3] = ((Skater) TOR_Players [3]);
      Team1Players [4] = ((Skater) TOR_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) TOR_Goalies [0]);
      Team1Goalies [1] = ((Goalie) TOR_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[5].getteamname()).toLowerCase()))
    {
      teamvs = teams[6].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) TBL_Players [0]);
      Team1Players [1]= ((Skater) TBL_Players [1]);
      Team1Players [2]= ((Skater) TBL_Players [2]);
      Team1Players [3]= ((Skater) TBL_Players [3]);
      Team1Players [4]= ((Skater) TBL_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) TBL_Goalies [0]);
      Team1Goalies [1] = ((Goalie) TBL_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[8].getteamname()).toLowerCase()))
    {
      teamvs = teams[10].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) CGY_Players [0]);
      Team1Players [1]= ((Skater) CGY_Players [1]);
      Team1Players [2]= ((Skater) CGY_Players [2]);
      Team1Players [3]= ((Skater) CGY_Players [3]);
      Team1Players [4]= ((Skater) CGY_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) CGY_Goalies [0]);
      Team1Goalies [1] = ((Goalie) CGY_Goalies [1]);
    }
    else if (teamchoose1.toLowerCase().equals(teams[10].getteamname()))
    {
      teamvs = teams[8].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) DAL_Players [0]);
      Team1Players [1]= ((Skater) DAL_Players [1]);
      Team1Players [2]= ((Skater) DAL_Players [2]);
      Team1Players [3]= ((Skater) DAL_Players [3]);
      Team1Players [4]= ((Skater) DAL_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) DAL_Goalies [0]);
      Team1Goalies [1] = ((Goalie) DAL_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[1].getteamname()).toLowerCase()))
    {
      teamvs = teams[0].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) CAR_Players [0]);
      Team1Players [1]= ((Skater) CAR_Players [1]);
      Team1Players [2]= ((Skater) CAR_Players [2]);
      Team1Players [3]= ((Skater) CAR_Players [3]);
      Team1Players [4]= ((Skater) CAR_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) CAR_Goalies [0]);
      Team1Goalies [1] = ((Goalie) CAR_Goalies [1]);
    }
    else if (teamchoose1.toLowerCase().equals(teams[0].getteamname().toLowerCase()))
    {
      teamvs = teams[1].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) BOS_Players [0]);
      Team1Players [1]= ((Skater) BOS_Players [1]);
      Team1Players [2]= ((Skater) BOS_Players [2]);
      Team1Players [3]= ((Skater) BOS_Players [3]);
      Team1Players [4]= ((Skater) BOS_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) BOS_Goalies [0]);
      Team1Goalies [1] = ((Goalie) BOS_Goalies [1]);
    }
    else if (teamchoose1.toLowerCase().equals(teams[3].getteamname().toLowerCase()))
    {
      teamvs = teams[4].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) NYR_Players [0]);
      Team1Players [1]= ((Skater) NYR_Players [1]);
      Team1Players [2]= ((Skater) NYR_Players [2]);
      Team1Players [3]= ((Skater) NYR_Players [3]);
      Team1Players [4]= ((Skater) NYR_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) NYR_Goalies [0]);
      Team1Goalies [1] = ((Goalie) NYR_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[4].getteamname()).toLowerCase()))
    {
      teamvs = teams[3].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) PIT_Players [0]);
      Team1Players [1]= ((Skater) PIT_Players [1]);
      Team1Players [2]= ((Skater) PIT_Players [2]);
      Team1Players [3]= ((Skater) PIT_Players [3]);
      Team1Players [4]= ((Skater) PIT_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) PIT_Goalies [0]);
      Team1Goalies [1] = ((Goalie) PIT_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[2].getteamname()).toLowerCase()))
    {
      teamvs = teams[7].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) FLA_Players [0]);
      Team1Players [1]= ((Skater) FLA_Players [1]);
      Team1Players [2]= ((Skater) FLA_Players [2]);
      Team1Players [3]= ((Skater) FLA_Players [3]);
      Team1Players [4]= ((Skater) FLA_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) FLA_Goalies [0]);
      Team1Goalies [1] = ((Goalie) FLA_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[7].getteamname()).toLowerCase()))
    {
      teamvs = teams[2].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) WSH_Players [0]);
      Team1Players [1]= ((Skater) WSH_Players [1]);
      Team1Players [2]= ((Skater) WSH_Players [2]);
      Team1Players [3]= ((Skater) WSH_Players [3]);
      Team1Players [4]= ((Skater) WSH_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) WSH_Goalies [0]);
      Team1Goalies [1] = ((Goalie) WSH_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[9].getteamname()).toLowerCase()))
    {
      teamvs = teams[14].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) COL_Players [0]);
      Team1Players [1]= ((Skater) COL_Players [1]);
      Team1Players [2]= ((Skater) COL_Players [2]);
      Team1Players [3]= ((Skater) COL_Players [3]);
      Team1Players [4]= ((Skater) COL_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) COL_Goalies [0]);
      Team1Goalies [1] = ((Goalie) COL_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[14].getteamname()).toLowerCase()))
    {
      teamvs = teams[9].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) NSH_Players [0]);
      Team1Players [1]= ((Skater) NSH_Players [1]);
      Team1Players [2]= ((Skater) NSH_Players [2]);
      Team1Players [3]= ((Skater) NSH_Players [3]);
      Team1Players [4]= ((Skater) NSH_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) NSH_Goalies [0]);
      Team1Goalies [1] = ((Goalie) NSH_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[15].getteamname()).toLowerCase()))
    {
      teamvs = teams[13].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) STL_Players [0]);
      Team1Players [1]= ((Skater) STL_Players [1]);
      Team1Players [2]= ((Skater) STL_Players [2]);
      Team1Players [3]= ((Skater) STL_Players [3]);
      Team1Players [4]= ((Skater) STL_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) STL_Goalies [0]);
      Team1Goalies [1] = ((Goalie) STL_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[13].getteamname()).toLowerCase()))
    {
      teamvs = teams[15].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) MIN_Players [0]);
      Team1Players [1]= ((Skater) MIN_Players [1]);
      Team1Players [2]= ((Skater) MIN_Players [2]);
      Team1Players [3]= ((Skater) MIN_Players [3]);
      Team1Players [4]= ((Skater) MIN_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) MIN_Goalies [0]);
      Team1Goalies [1] = ((Goalie) MIN_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[11].getteamname()).toLowerCase()))
    {
      teamvs = teams[12].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) EDM_Players [0]);
      Team1Players [1]= ((Skater) EDM_Players [1]);
      Team1Players [2]= ((Skater) EDM_Players [2]);
      Team1Players [3]= ((Skater) EDM_Players [3]);
      Team1Players [4]= ((Skater) EDM_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) EDM_Goalies [0]);
      Team1Goalies [1] = ((Goalie) EDM_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[12].getteamname()).toLowerCase()))
    {
      teamvs = teams[11].getteamname();
      Team1Players = new Skater [5];
      Team1Players [0]= ((Skater) LAK_Players [0]);
      Team1Players [1]= ((Skater) LAK_Players [1]);
      Team1Players [2]= ((Skater) LAK_Players [2]);
      Team1Players [3]= ((Skater) LAK_Players [3]);
      Team1Players [4]= ((Skater) LAK_Players [4]);

      Team1Goalies = new Goalie [2];
      Team1Goalies [0] = ((Goalie) LAK_Goalies [0]);
      Team1Goalies [1] = ((Goalie) LAK_Goalies [1]);
    }

    //Printing out the first user's team and the who they are facing
    System.out.println("\nYour team the " +teamchoose1+ " is playing the " + teamvs +  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamvs.toLowerCase()))));

    Teams teamsvsing = new Teams (teamchoose1, teamvs, "", "");

    for (int i = 0; i < 9; i ++)
    {

      rounds = rounds ++;
      //Printing stamina of players
      System.out.println( teams[teampos1].getskater1() + allskaters.staminaChange("Stamina"));
      System.out.println( teams[teampos1].getskater2() +allskaters.staminaChange("Stamina"));
      System.out.println( teams[teampos1].getskater3() + allskaters.staminaChange("Stamina"));
      System.out.println( teams[teampos1].getskater4() +allskaters.staminaChange("Stamina"));
      System.out.println( teams[teampos1].getskater5() +allskaters.staminaChange("Stamina"));

      //Allowing the user to choose a team
      System.out.println("Choose one of the players above by inputting their last name.");

      playerchoose = scanner.nextLine();

      //creating a while loop
      int x = 0;
      while (x == 0)
      {
        if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater1()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater2()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater3()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater4()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater5()).toLowerCase()))
        {
          x = 1;
        }
        else 
        {
          System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
          playerchoose = scanner.nextLine();
        }
      }

      //Prompting the user for an input
      System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");

      userinput = scanner.nextInt();

      x = 0;
      while (x == 0)
      {
        if (userinput > 0 && userinput <= 6)
        {
          x = 1;
        }
        else
        {
          System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
          userinput = scanner.nextInt();
        }
      }

      //Creating the try to score scenarios
      actionreturn = Team1Players[4].Try_To_Score(userinput);

      if (actionreturn.equals("goal"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Scenario[k]);
        teamsvsing.scorechangeteam1();
      }
      else if (actionreturn.equals("save"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Save_Scenario[k]);
      }
      else
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Miss_Scenario[k]);
      }

      allskaters.staminaChange("Shot");

      //Prompting the user for an input
      System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");

      userinput = scanner.nextInt();

      x = 0;
      while (x == 0)
      {
        if (userinput > 0 && userinput <= 6)
        {
          x = 1;
        }
        else
        {
          System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
          userinput = scanner.nextInt();
        }
      }

      //Creating the try to save scenarios
      actionreturn = Team1Goalies[0].Try_To_Save(userinput);

      if (actionreturn.equals("goal"))
      {
        teamsvsing.scorechangeteam2();
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Scenario[k]);
      }
      else if (actionreturn.equals("save"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Save_Scenario[k]);
      }
      else
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Miss_Scenario[k]);
      }

      int r = random.nextInt(8 - 1 + 1 ) + 1;
      if (i == 1)
      {
        PM = penalty[0].Penalty(PM);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a two minute minor.");
      }
      
      else if (i == 2)
      {
        PM = penalty[0].Penalty(PM, APM, i);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
      }
  
      else if (i == 3)
      {
        PM = penalty[0].Penalty(PM, APM, i);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a five minute major.");
      }
  
      else
      {
        allskaters.staminaChange("Stamina");
      }

      //creating an overtime scenario
      if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
      {
        i = 7;
        System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
      }

      //Printing out the current score
      System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
    }
    
    teamsleft.add (teamsvsing.gamewinner());

    if (!(teamchoose1.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
    {
      team1lost ++;
    }

    result = ROUNDS.countingRounds(rounds);
    
    //Printing out the final score and the winner
    System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

    rounds = 0;

    if ((teamchoose2.toLowerCase()).equals((teams[6].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[5].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0] = ((Skater) TOR_Players [0]);
      Team2Players [1] = ((Skater) TOR_Players [1]);
      Team2Players [2] = ((Skater) TOR_Players [2]);
      Team2Players [3] = ((Skater) TOR_Players [3]);
      Team2Players [4] = ((Skater) TOR_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) TOR_Goalies [0]);
      Team2Goalies [1] = ((Goalie) TOR_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[5].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[6].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) TBL_Players [0]);
      Team2Players [1]= ((Skater) TBL_Players [1]);
      Team2Players [2]= ((Skater) TBL_Players [2]);
      Team2Players [3]= ((Skater) TBL_Players [3]);
      Team2Players [4]= ((Skater) TBL_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) TBL_Goalies [0]);
      Team2Goalies [1] = ((Goalie) TBL_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[8].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[10].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) CGY_Players [0]);
      Team2Players [1]= ((Skater) CGY_Players [1]);
      Team2Players [2]= ((Skater) CGY_Players [2]);
      Team2Players [3]= ((Skater) CGY_Players [3]);
      Team2Players [4]= ((Skater) CGY_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) CGY_Goalies [0]);
      Team2Goalies [1] = ((Goalie) CGY_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[10].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[8].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) DAL_Players [0]);
      Team2Players [1]= ((Skater) DAL_Players [1]);
      Team2Players [2]= ((Skater) DAL_Players [2]);
      Team2Players [3]= ((Skater) DAL_Players [3]);
      Team2Players [4]= ((Skater) DAL_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) DAL_Goalies [0]);
      Team2Goalies [1] = ((Goalie) DAL_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[1].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[0].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) CAR_Players [0]);
      Team2Players [1]= ((Skater) CAR_Players [1]);
      Team2Players [2]= ((Skater) CAR_Players [2]);
      Team2Players [3]= ((Skater) CAR_Players [3]);
      Team2Players [4]= ((Skater) CAR_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) CAR_Goalies [0]);
      Team2Goalies [1] = ((Goalie) CAR_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[0].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[1].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) BOS_Players [0]);
      Team2Players [1]= ((Skater) BOS_Players [1]);
      Team2Players [2]= ((Skater) BOS_Players [2]);
      Team2Players [3]= ((Skater) BOS_Players [3]);
      Team2Players [4]= ((Skater) BOS_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) BOS_Goalies [0]);
      Team2Goalies [1] = ((Goalie) BOS_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[3].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[4].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) NYR_Players [0]);
      Team2Players [1]= ((Skater) NYR_Players [1]);
      Team2Players [2]= ((Skater) NYR_Players [2]);
      Team2Players [3]= ((Skater) NYR_Players [3]);
      Team2Players [4]= ((Skater) NYR_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) NYR_Goalies [0]);
      Team2Goalies [1] = ((Goalie) NYR_Goalies [1]);
    }
    else if ((teamchoose2.toLowerCase()).equals((teams[4].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[3].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) PIT_Players [0]);
      Team2Players [1]= ((Skater) PIT_Players [1]);
      Team2Players [2]= ((Skater) PIT_Players [2]);
      Team2Players [3]= ((Skater) PIT_Players [3]);
      Team2Players [4]= ((Skater) PIT_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) PIT_Goalies [0]);
      Team2Goalies [1] = ((Goalie) PIT_Goalies [1]);
    }
    else if ((teamchoose1.toLowerCase()).equals((teams[2].getteamname()).toLowerCase()))
    {
      teamvs2 = teams[7].getteamname();
      Team2Players = new Skater [5]  ;
      Team2Players [0]= ((Skater) FLA_Players [0]);
      Team2Players [1]= ((Skater) FLA_Players [1]);
      Team2Players [2]= ((Skater) FLA_Players [2]);
      Team2Players [3]= ((Skater) FLA_Players [3]);
      Team2Players [4]= ((Skater) FLA_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) FLA_Goalies [0]);
      Team2Goalies [1] = ((Goalie) FLA_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[7].getteamname().toLowerCase()))
    {
      teamvs2 = teams[2].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) WSH_Players [0]);
      Team2Players [1]= ((Skater) WSH_Players [1]);
      Team2Players [2]= ((Skater) WSH_Players [2]);
      Team2Players [3]= ((Skater) WSH_Players [3]);
      Team2Players [4]= ((Skater) WSH_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) WSH_Goalies [0]);
      Team2Goalies [1] = ((Goalie) WSH_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[9].getteamname().toLowerCase()))
    {
      teamvs2 = teams[14].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) COL_Players [0]);
      Team2Players [1]= ((Skater) COL_Players [1]);
      Team2Players [2]= ((Skater) COL_Players [2]);
      Team2Players [3]= ((Skater) COL_Players [3]);
      Team2Players [4]= ((Skater) COL_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) COL_Goalies [0]);
      Team2Goalies [1] = ((Goalie) COL_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[14].getteamname().toLowerCase()))
    {
      teamvs2 = teams[9].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) NSH_Players [0]);
      Team2Players [1]= ((Skater) NSH_Players [1]);
      Team2Players [2]= ((Skater) NSH_Players [2]);
      Team2Players [3]= ((Skater) NSH_Players [3]);
      Team2Players [4]= ((Skater) NSH_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) NSH_Goalies [0]);
      Team2Goalies [1] = ((Goalie) NSH_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[15].getteamname().toLowerCase()))
    {
      teamvs2 = teams[13].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) STL_Players [0]);
      Team2Players [1]= ((Skater) STL_Players [1]);
      Team2Players [2]= ((Skater) STL_Players [2]);
      Team2Players [3]= ((Skater) STL_Players [3]);
      Team2Players [4]= ((Skater) STL_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) STL_Goalies [0]);
      Team2Goalies [1] = ((Goalie) STL_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[13].getteamname().toLowerCase()))
    {
      teamvs2 = teams[15].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) MIN_Players [0]);
      Team2Players [1]= ((Skater) MIN_Players [1]);
      Team2Players [2]= ((Skater) MIN_Players [2]);
      Team2Players [3]= ((Skater) MIN_Players [3]);
      Team2Players [4]= ((Skater) MIN_Players [5]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) MIN_Goalies [0]);
      Team2Goalies [1] = ((Goalie) MIN_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[11].getteamname().toLowerCase()))
    {
      teamvs2 = teams[12].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) EDM_Players [0]);
      Team2Players [1]= ((Skater) EDM_Players [1]);
      Team2Players [2]= ((Skater) EDM_Players [2]);
      Team2Players [3]= ((Skater) EDM_Players [3]);
      Team2Players [4]= ((Skater) EDM_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) EDM_Goalies [0]);
      Team2Goalies [1] = ((Goalie) EDM_Goalies [1]);
    }
    else if (teamchoose2.toLowerCase().equals(teams[12].getteamname().toLowerCase()))
    {
      teamvs2 = teams[11].getteamname();
      Team2Players = new Skater [5];
      Team2Players [0]= ((Skater) LAK_Players [0]);
      Team2Players [1]= ((Skater) LAK_Players [1]);
      Team2Players [2]= ((Skater) LAK_Players [2]);
      Team2Players [3]= ((Skater) LAK_Players [3]);
      Team2Players [4]= ((Skater) LAK_Players [4]);

      Team2Goalies = new Goalie [2];
      Team2Goalies [0] = ((Goalie) LAK_Goalies [0]);
      Team2Goalies [1] = ((Goalie) LAK_Goalies [1]);
    }

    //Printing out the chosen team and the opposing team.
    System.out.println("\nYour team the " +teamchoose2+ " is playing the " +teamvs2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose2.toLowerCase()).add(team[0].viewership(teamvs2.toLowerCase()))));

    teamsvsing.setteam1(teamchoose2);
    teamsvsing.setteam2(teamvs2);
    teamsvsing.resetscore1();
    teamsvsing.resetscore2();

    //creating a for loop
    for (int i = 0; i < 9; i ++)
    {
      

      rounds = rounds ++;
      System.out.println( teams[teampos2].getskater1()  + allskaters.staminaChange("Stamina") ); 
      System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
      System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
      System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
      System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

      //allowing the user to choose a player
      System.out.println("Choose one of the players above.");

      playerchoose = scanner.nextLine();

      int x = 0;
      while (x == 0)
      {
        if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
        {
          x = 1;
        }
        else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
        {
          x = 1;
        }
        else 
        {
          System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
          playerchoose = scanner.nextLine();
        }
      }

      //Prompting the user for an input
      System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");

      userinput = scanner.nextInt();

      x = 0;
      while (x == 0)
      {
        if (userinput > 0 && userinput <= 6)
        {
          x = 1;
        }
        else
        {
          System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
          userinput = scanner.nextInt();
        }
      }

      //creating a try to score scenario
      actionreturn = Team2Players[4].Try_To_Score(userinput);

      if (actionreturn.equals("goal"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Scenario[k]);
        teamsvsing.scorechangeteam1();
      }
      else if (actionreturn.equals("save"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Save_Scenario[k]);
      }
      else
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Miss_Scenario[k]);
      }

      allskaters.staminaChange("Shot");

      //Prompting the user for an input
      System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");

      userinput = scanner.nextInt();

      x = 0;
      while (x == 0)
      {
        if (userinput > 0 && userinput <= 6)
        {
          x = 1;
        }
        else
        {
          System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
          userinput = scanner.nextInt();
        }
      }

      //creating a try to save scenario
      actionreturn = Team2Goalies[3].Try_To_Save(userinput);

      if (actionreturn.equals("goal"))
      {
        teamsvsing.scorechangeteam2();
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Scenario[k]);
      }
      else if (actionreturn.equals("save"))
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Goal_Save_Scenario[k]);
      }
      else
      {
        int k = random.nextInt(2 - 0 + 1 ) + 0;
        System.out.println(Miss_Scenario[k]);
      }

      int r = random.nextInt(8 - 1 + 1 ) + 1;
      if (i == 1)
      {
        PM = penalty[0].Penalty(PM);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a two minute minor.");
      }
      
      else if (i == 2)
      {
        PM = penalty[0].Penalty(PM, APM, i);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
      }
  
      else if (i == 3)
      {
        PM = penalty[0].Penalty(PM, APM, i);
        allskaters.staminaChange("Penalty");
        System.out.println("The other team has drawn a penalty. Its a five minute major.");
      }
  
      else
      {
        allskaters.staminaChange("Stamina");
      }
      
      //creating an overtime scenario
      if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
      {
        i = 7;
        System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
      }

      //printing out the current score
      System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
    }

    teamsleft.add(teamsvsing.gamewinner());

    if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
    {
      team2lost ++;
    }

    result = ROUNDS.countingRounds(rounds);
    
    //printing the final score and the winner
    System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

    rounds = 0;

    if (!teams[6].getteamname().equals(teamsleft.get(0)) && !teams[6].getteamname().equals(teamsleft.get(1)) && !teams[5].getteamname().equals(teamsleft.get(0)) && !teams[5].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 1 + 1 ) + 1;
      if (a == 1)
      {
        teamsleft.add(teams[6].getteamname());
      }
      else
      {
        teamsleft.add(teams[5].getteamname());
      }

      if (teampos1 == 7 || teampos1 == 2 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
        
      else if (teampos2 == 7 || teampos2 == 2 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[0].getteamname().equals(teamsleft.get(0)) || !teams[0].getteamname().equals(teamsleft.get(1)) || !teams[1].getteamname().equals(teamsleft.get(0)) || !teams[1].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 1 + 1 ) + 1;
      if (a == 1)
      {
        teamsleft.add(teams[1].getteamname());
      }
      else
      {
        teamsleft.add(teams[0].getteamname());
      }

      if (teampos1 == 3 || teampos1 == 4 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 3 || teampos2 == 4 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[2].getteamname().equals(teamsleft.get(0)) && !teams[2].getteamname().equals(teamsleft.get(1)) && !teams[7].getteamname().equals(teamsleft.get(0)) && !teams[7].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 1 + 1 ) + 1;
      if (a == 1)
      {
        teamsleft.add(teams[2].getteamname());
      }
      else
      {
        teamsleft.add(teams[7].getteamname());
      }

      if (teampos1 == 6 || teampos1 == 5 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 6 || teampos2 == 5 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[3].getteamname().equals(teamsleft.get(0)) && !teams[3].getteamname().equals(teamsleft.get(1)) && !teams[4].getteamname().equals(teamsleft.get(0)) && !teams[4].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 1 + 1 ) + 1;
      if (a == 1)
      {
        teamsleft.add(teams[3].getteamname());
      }
      else
      {
        teamsleft.add(teams[4].getteamname());
      }

      if (teampos1 == 0 || teampos1 == 1 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 0 || teampos2 == 1 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }
    
    if (!teams[8].getteamname().equals(teamsleft.get(0)) && !teams[8].getteamname().equals(teamsleft.get(1)) && !teams[10].getteamname().equals(teamsleft.get(0)) && !teams[10].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 1 + 1 ) + 1;
      if (a == 1)
      {
        teamsleft.add(teams[8].getteamname());
      }
      else
      {
        teamsleft.add(teams[10].getteamname());
      }

      if (teampos1 == 12 || teampos1 == 11 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 12 || teampos2 == 11 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[9].getteamname().equals(teamsleft.get(0)) && !teams[9].getteamname().equals(teamsleft.get(1)) && !teams[14].getteamname().equals(teamsleft.get(0)) && !teams[14].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 0 + 1 ) + 0;
      if (a == 1)
      {
        teamsleft.add(teams[9].getteamname());
      }
      else
      {
        teamsleft.add(teams[14].getteamname());
      }

      if (teampos1 == 15 || teampos1 == 13 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 15 || teampos2 == 13 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[11].getteamname().equals(teamsleft.get(0)) && !teams[11].getteamname().equals(teamsleft.get(1)) && !teams[12].getteamname().equals(teamsleft.get(0)) && !teams[12].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 0 + 1 ) + 0;
      if (a == 1)
      {
        teamsleft.add(teams[12].getteamname());
      }
      else
      {
        teamsleft.add(teams[11].getteamname());
      }

      if (teampos1 == 8 || teampos1 == 10 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 8 || teampos2 == 10 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }

    if (!teams[13].getteamname().equals(teamsleft.get(0)) && !teams[13].getteamname().equals(teamsleft.get(1)) && !teams[15].getteamname().equals(teamsleft.get(0)) && !teams[15].getteamname().equals(teamsleft.get(1)))
    {
      int a = random.nextInt(2 - 0 + 1 ) + 0;
      if (a == 1)
      {
        teamsleft.add(teams[10].getteamname());
      }
      else
      {
        teamsleft.add(teams[8].getteamname());
      }

      if (teampos1 == 14 || teampos1 == 9 && team1lost == 0)
      {
        teamvs = teamsleft.get(teamsleft.size() - 1);
      }
      else if (teampos2 == 14 || teampos2 == 9 && team2lost == 0)
      {
        teamvs2 = teamsleft.get(teamsleft.size() - 1);
      }
    }
    
    if (team1lost == 0)
    {
      System.out.println("\nYour team the " +teamchoose1+ " is playing the " +teamvs+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamvs.toLowerCase()))));
      
      teamsvsing.setteam1(teamchoose1);
      teamsvsing.setteam2(teamvs);
      teamsvsing.resetscore1();
      teamsvsing.resetscore2();
      
      for (int i = 0; i < 9; i ++)
      {

        rounds = rounds ++;
        //Printing the skaters
        System.out.println( teams[teampos1].getskater1() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater2() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater3() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater4() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater5() + allskaters.staminaChange("Stamina") );

        //Prompting the user to choose a player
        System.out.println("Choose one of the players above by inputting thier last name.");

        playerchoose = scanner.nextLine();
  
        int x = 0;
        while (x == 0)
        {
          if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater1()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater2()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater3()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater4()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater5()).toLowerCase()))
          {
            x = 1;
          }
          else 
          {
            System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
            playerchoose = scanner.nextLine();
          }
        }

        //Prompting the user for input to try and score
        System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team1Players[4].Try_To_Score(userinput);
  
        if (actionreturn.equals("goal"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
          teamsvsing.scorechangeteam1();
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        //Prompting the user for an input to try and save
        System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
      
        actionreturn = Team1Goalies[0].Try_To_Save(userinput);
  
        if (actionreturn.equals("goal"))
        {
          teamsvsing.scorechangeteam2();
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        int r = random.nextInt(8 - 1 + 1 ) + 1;
        if (i == 1)
        {
          PM = penalty[0].Penalty(PM);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a two minute minor.");
        }
        
        else if (i == 2)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
        }
    
        else if (i == 3)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a five minute major.");
        }
    
        else
        {
          allskaters.staminaChange("Stamina");
        }
  
        if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
        {
          i = 7;
          System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
        }

        //Printing the current score
        System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
      }

      teamsleft.remove(teamsvsing.gameloser());
      
      if (!(teamchoose1.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
      {
        team1lost++;
      }

      result = ROUNDS.countingRounds(rounds);
      
      //Printing the final score and winner
      System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

      rounds = 0;
    }
    else 
    {
      team1lost ++;
    }

    if (team2lost == 0)
    {
      System.out.println("/nYour team the " +teamchoose2+ " is playing the " +teamvs2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose2.toLowerCase()).add(team[0].viewership(teamvs2.toLowerCase()))));
      
      teamsvsing.setteam1(teamchoose2);
      teamsvsing.setteam2(teamvs2);
      teamsvsing.resetscore1();
      teamsvsing.resetscore2();
      
      for (int i = 0; i < 9; i ++)
      {
        rounds = rounds ++;
  
        System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
        System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

        //Prompting the user to choose a player
        System.out.println("Choose one of the players above.");
  
        playerchoose = scanner.nextLine();
  
        int x = 0;
        while (x == 0)
        {
          if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
          {
            x = 1;
          }
          else 
          {
            System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
            playerchoose = scanner.nextLine();
          }
        }

        //Prompting the user to try and score
        System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team2Players[4].Try_To_Score(userinput);
  
        if (actionreturn.equals("goal"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
          teamsvsing.scorechangeteam1();
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        //Prompting the user to try and save
        System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team2Goalies[3].Try_To_Save(userinput);
  
        if (actionreturn.equals("goal"))
        {
          teamsvsing.scorechangeteam2();
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        int r = random.nextInt(8 - 1 + 1 ) + 1;
        if (i == 1)
        {
          PM = penalty[0].Penalty(PM);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a two minute minor.");
        }
        
        else if (i == 2)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
        }
    
        else if (i == 3)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a five minute major.");
        }
    
        else
        {
          allskaters.staminaChange("Stamina");
        }
  
        if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
        {
          i = 7;
          //Printing the status of the game
          System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
        }
      //Printing the current score
      System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
      }

      teamsleft.remove(teamsvsing.gameloser());
      
      if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
      {
        team2lost ++;
      }

      result = ROUNDS.countingRounds(rounds);
      
      //Printing the final score and winner
      System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

      rounds = 0;
    }
    else 
    {
      team2lost ++;
    }

    if (teamsleft.contains(teams[6]) && teamsleft.contains(teams[7]) && !teams[6].equals(teams[teampos1]) && !teams[7].equals(teams[teampos1]) && !teams[6].equals(teams[teampos2]) && !teams[7].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[7]) || teamvs.equals(teams[6]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
        }
      }
      else if (teamvs2.equals(teams[7]) || teamvs2.equals(teams[6]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
        }
      }
      else if (!teamvs.equals(teams[7]) && teamvs.equals(teams[6]) && !teamvs2.equals(teams[7]) && teamvs2.equals(teams[6]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[7].getteamname();
          } 
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[7].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[6].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[6].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[6]) && teamsleft.contains(teams[2]) && !teams[6].equals(teams[teampos1]) && !teams[2].equals(teams[teampos1]) && !teams[6].equals(teams[teampos2]) && !teams[2].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[2]) || teamvs.equals(teams[6]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
        }
      }
      else if (teamvs2.equals(teams[2]) || teamvs2.equals(teams[6]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
        }
      }
      else if (!teamvs.equals(teams[2]) && teamvs.equals(teams[6]) && !teamvs2.equals(teams[2]) && teamvs2.equals(teams[6]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[6].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[2].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[2].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0) 
          {
            teamvs = teams[6].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[6].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[5]) && teamsleft.contains(teams[2]) && !teams[5].equals(teams[teampos1]) && !teams[2].equals(teams[teampos1]) && !teams[5].equals(teams[teampos2]) && !teams[2].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[2]) || teamvs.equals(teams[5]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
        }
      }
      else if (teamvs2.equals(teams[2]) || teamvs2.equals(teams[5]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
        }
      }
      else if (!teamvs.equals(teams[2]) && teamvs.equals(teams[5]) && !teamvs2.equals(teams[2]) && teamvs2.equals(teams[5]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[2].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[2].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[2].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[5].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[5].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[5]) && teamsleft.contains(teams[7]) && !teams[5].equals(teams[teampos1]) && !teams[7].equals(teams[teampos1]) && !teams[5].equals(teams[teampos2]) && !teams[7].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[7]) || teamvs.equals(teams[5]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
        }
      }
      else if (teamvs2.equals(teams[7]) || teamvs2.equals(teams[5]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
        }
      }
      else if (!teamvs.equals(teams[7]) && teamvs.equals(teams[5]) && !teamvs2.equals(teams[7]) && teamvs2.equals(teams[5]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[5].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[7].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[7].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[7].getteamname());
          
          if (teampos1 == 0 || teampos1 == 1 || teampos1 == 3 || teampos1 == 4 && team1lost == 0)
          {
            teamvs = teams[5].getteamname();
          }
            
          else if (teampos2 == 0 || teampos2 == 1 || teampos2 == 3 || teampos2 == 4 && team2lost == 0)
          {
            teamvs2 = teams[5].getteamname();
          }
        }
      }
    }

    if (teamsleft.contains(teams[0]) && teamsleft.contains(teams[3]) && !teams[0].equals(teams[teampos1]) && !teams[3].equals(teams[teampos1]) && !teams[0].equals(teams[teampos2]) && !teams[3].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[3]) || teamvs.equals(teams[0]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
        }
      }
      else if (teamvs2.equals(teams[3]) || teamvs2.equals(teams[0]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
        }
      }
      else if (!teamvs.equals(teams[3]) && teamvs.equals(teams[0]) && !teamvs2.equals(teams[3]) && teamvs2.equals(teams[0]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[3].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[3].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[0].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[0].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[0]) && teamsleft.contains(teams[4]) && !teams[0].equals(teams[teampos1]) && !teams[4].equals(teams[teampos1]) && !teams[0].equals(teams[teampos2]) && !teams[4].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[4]) || teamvs.equals(teams[0]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
        }
      }
      else if (teamvs2.equals(teams[4]) || teamvs2.equals(teams[0]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
        }
      }
      else if (!teamvs.equals(teams[4]) && teamvs.equals(teams[0]) && !teamvs2.equals(teams[4]) && teamvs2.equals(teams[0]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[0].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[4].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[4].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[0].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[0].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[1]) && teamsleft.contains(teams[4]) && !teams[1].equals(teams[teampos1]) && !teams[4].equals(teams[teampos1]) && !teams[1].equals(teams[teampos2]) && !teams[4].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[4]) || teamvs.equals(teams[1]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
        }
      }
      else if (teamvs2.equals(teams[4]) || teamvs2.equals(teams[1]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
        }
      }
      else if (!teamvs.equals(teams[4]) && teamvs.equals(teams[1]) && !teamvs2.equals(teams[4]) && teamvs2.equals(teams[1]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[4].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[4].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[4].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[1].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[1].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[1]) && teamsleft.contains(teams[3]) && !teams[1].equals(teams[teampos1]) && !teams[3].equals(teams[teampos1]) && !teams[1].equals(teams[teampos2]) && !teams[3].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[3]) || teamvs.equals(teams[1]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
        }
      }
      else if (teamvs2.equals(teams[3]) || teamvs2.equals(teams[1]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
        }
      }
      else if (!teamvs.equals(teams[3]) && teamvs.equals(teams[1]) && !teamvs2.equals(teams[3]) && teamvs2.equals(teams[1]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[1].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[3].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[3].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[3].getteamname());
          
          if (teampos1 == 6 || teampos1 == 7 || teampos1 == 2 || teampos1 == 5 && team1lost == 0)
          {
            teamvs = teams[1].getteamname();
          }
            
          else if (teampos2 == 6 || teampos2 == 7 || teampos2 == 2 || teampos2 == 5 && team2lost == 0)
          {
            teamvs2 = teams[1].getteamname();
          }
        }
      }
    }

    if (teamsleft.contains(teams[8]) && teamsleft.contains(teams[12]) && !teams[8].equals(teams[teampos1]) && !teams[12].equals(teams[teampos1]) && !teams[8].equals(teams[teampos2]) && !teams[12].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[12]) || teamvs.equals(teams[8]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
        }
        else
        {
          teamsleft.remove(teams[12].getteamname());
        }
      }
      else if (teamvs2.equals(teams[12]) || teamvs2.equals(teams[8]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
        }
        else
        {
          teamsleft.remove(teams[12].getteamname());
        }
      }
      else if (!teamvs.equals(teams[12]) && teamvs.equals(teams[8]) && !teamvs2.equals(teams[12]) && teamvs2.equals(teams[8]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[12].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[12].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[12].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[8].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[8].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[8]) && teamsleft.contains(teams[11]) && !teams[8].equals(teams[teampos1]) && !teams[11].equals(teams[teampos1]) && !teams[8].equals(teams[teampos2]) && !teams[11].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[11]) || teamvs.equals(teams[8]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
        }
      }
      else if (teamvs2.equals(teams[11]) || teamvs2.equals(teams[8]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
        }
      }
      else if (!teamvs.equals(teams[11]) && teamvs.equals(teams[8]) && !teamvs2.equals(teams[11]) && teamvs2.equals(teams[8]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[8].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[11].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[11].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[8].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[8].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[10]) && teamsleft.contains(teams[11]) && !teams[10].equals(teams[teampos1]) && !teams[11].equals(teams[teampos1]) && !teams[10].equals(teams[teampos2]) && !teams[11].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[11]) || teamvs.equals(teams[10]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[10].getteamname());
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
        }
      }
      else if (teamvs2.equals(teams[11]) || teamvs2.equals(teams[10]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[10].getteamname());
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
        }
      }
      else if (!teamvs.equals(teams[11]) && teamvs.equals(teams[10]) && !teamvs2.equals(teams[11]) && teamvs2.equals(teams[10]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[10].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[11].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[11].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[11].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[10].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[10].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[10]) && teamsleft.contains(teams[12]) && !teams[10].equals(teams[teampos1]) && !teams[12].equals(teams[teampos1]) && !teams[10].equals(teams[teampos2]) && !teams[12].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[12]) || teamvs.equals(teams[10]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[10].getteamname());
        }
        else
        {
          teamsleft.remove(teams[12].getteamname());
        }
      }
      else if (teamvs2.equals(teams[12]) || teamvs2.equals(teams[10]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[12].getteamname());
        }
        else
        {
          teamsleft.remove(teams[10].getteamname());
        }
      }
      else if (!teamvs.equals(teams[12]) && teamvs.equals(teams[10]) && !teamvs2.equals(teams[12]) && teamvs2.equals(teams[10]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[10].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[12].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[12].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[12].getteamname());
          
          if (teampos1 == 9 || teampos1 == 15 || teampos1 == 13 || teampos1 == 14 && team1lost == 0)
          {
            teamvs = teams[10].getteamname();
          }
            
          else if (teampos2 == 9 || teampos2 == 15 || teampos2 == 13 || teampos2 == 14 && team2lost == 0)
          {
            teamvs2 = teams[10].getteamname();
          }
        }
      }
    }

    if (teamsleft.contains(teams[9]) && teamsleft.contains(teams[15]) && !teams[9].equals(teams[teampos1]) && !teams[15].equals(teams[teampos1]) && !teams[9].equals(teams[teampos2]) && !teams[15].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[15]) || teamvs.equals(teams[9]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
        }
        else
        {
          teamsleft.remove(teams[15].getteamname());
        }
      }
      else if (teamvs2.equals(teams[15]) || teamvs2.equals(teams[9]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
        }
        else
        {
          teamsleft.remove(teams[15].getteamname());
        }
      }
      else if (!teamvs.equals(teams[15]) && teamvs.equals(teams[9]) && !teamvs2.equals(teams[15]) && teamvs2.equals(teams[9]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
          
          if (teampos1 == 8 || teampos1 == 12 || teampos1 == 11 || teampos1 == 10 && team1lost == 0)
          {
            teamvs = teams[15].getteamname();
          }
            
          else if (teampos2 == 8 || teampos2 == 12 || teampos2 == 11 || teampos2 == 10 && team2lost == 0)
          {
            teamvs2 = teams[15].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[15].getteamname());
          
          if (teampos1 == 8 || teampos1 == 12 || teampos1 == 11 || teampos1 == 10 && team1lost == 0)
          {
            teamvs = teams[9].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 9 && team2lost == 0)
          {
            teamvs2 = teams[9].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[9]) && teamsleft.contains(teams[13]) && !teams[9].equals(teams[teampos1]) && !teams[13].equals(teams[teampos1]) && !teams[9].equals(teams[teampos2]) && !teams[13].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[13]) || teamvs.equals(teams[9]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
        }
      }
      else if (teamvs2.equals(teams[13]) || teamvs2.equals(teams[8]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
        }
      }
      else if (!teamvs.equals(teams[13]) && teamvs.equals(teams[9]) && !teamvs2.equals(teams[13]) && teamvs2.equals(teams[9]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[9].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[13].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[13].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[9].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[9].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[14]) && teamsleft.contains(teams[13]) && !teams[14].equals(teams[teampos1]) && !teams[13].equals(teams[teampos1]) && !teams[14].equals(teams[teampos2]) && !teams[13].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[13]) || teamvs.equals(teams[14]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[14].getteamname());
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
        }
      }
      else if (teamvs2.equals(teams[13]) || teamvs2.equals(teams[14]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[14].getteamname());
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
        }
      }
      else if (!teamvs.equals(teams[13]) && teamvs.equals(teams[14]) && !teamvs2.equals(teams[13]) && teamvs2.equals(teams[14]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[14].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[13].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[13].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[13].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[14].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[14].getteamname();
          }
        }
      }
    }

    else if (teamsleft.contains(teams[14]) && teamsleft.contains(teams[15]) && !teams[14].equals(teams[teampos1]) && !teams[15].equals(teams[teampos1]) && !teams[14].equals(teams[teampos2]) && !teams[15].equals(teams[teampos2]))
    {
      if (teamvs.equals(teams[15]) || teamvs.equals(teams[14]) && team1lost == 2 )
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[14].getteamname());
        }
        else
        {
          teamsleft.remove(teams[15].getteamname());
        }
      }
      else if (teamvs2.equals(teams[15]) || teamvs2.equals(teams[14]) && team2lost == 2)
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[15].getteamname());
        }
        else
        {
          teamsleft.remove(teams[14].getteamname());
        }
      }
      else if (!teamvs.equals(teams[15]) && teamvs.equals(teams[14]) && !teamvs2.equals(teams[15]) && teamvs2.equals(teams[14]))
      {
        int a = random.nextInt(2 - 1 + 1 ) + 1;
        if (a == 1)
        {
          teamsleft.remove(teams[14].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[15].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[15].getteamname();
          }
          
        }
        else
        {
          teamsleft.remove(teams[15].getteamname());
          
          if (teampos1 == 10 || teampos1 == 12 || teampos1 == 11 || teampos1 == 8 && team1lost == 0)
          {
            teamvs = teams[14].getteamname();
          }
            
          else if (teampos2 == 10 || teampos2 == 12 || teampos2 == 11 || teampos2 == 8 && team2lost == 0)
          {
            teamvs2 = teams[14].getteamname();
          }
        }
      }
    }

    if (team1lost == 0)
    {
      System.out.println("\nYour team the " +teamchoose1+ " is playing the " +teamvs+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamvs.toLowerCase()))));
      
      teamsvsing.setteam1(teamchoose1);
      teamsvsing.setteam2(teamvs);
      teamsvsing.resetscore1();
      teamsvsing.resetscore2();
      
      for (int i = 0; i < 9; i ++)
      {
        rounds = rounds ++;
        System.out.println( teams[teampos1].getskater1() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater2() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater3() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater4() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater5() + allskaters.staminaChange("Stamina") );

        //Prompting the user to choose a player
        System.out.println("Choose one of the players above by inputting thier last name.");
  
        playerchoose = scanner.nextLine();
  
        int x = 0;
        while (x == 0)
        {
          if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater1()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater2()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater3()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater4()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater5()).toLowerCase()))
          {
            x = 1;
          }
          else 
          {
            System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
            playerchoose = scanner.nextLine();
          }
        }

        //Prompting the user for an input to try and score
        System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team1Players[4].Try_To_Score(userinput);
  
        if (actionreturn.equals("goal"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
          teamsvsing.scorechangeteam1();
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        //Prompting the user for an input to try and save
        System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
      
        actionreturn = Team1Goalies[0].Try_To_Save(userinput);
  
        if (actionreturn.equals("goal"))
        {
          teamsvsing.scorechangeteam2();
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        int r = random.nextInt(8 - 1 + 1 ) + 1;
        if (i == 1)
        {
          PM = penalty[0].Penalty(PM);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a two minute minor.");
        }
        
        else if (i == 2)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
        }
    
        else if (i == 3)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a five minute major.");
        }
    
        else
        {
          allskaters.staminaChange("Stamina");
        }
  
        if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
        {
          i = 7;
          //Printing the current status of the game if it goes into overtime
          System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
        }

        //Printing the current score of the match
        System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
      }

      teamsleft.remove(teamsvsing.gameloser());
      
      if (!(teamchoose1.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
      {
        team1lost++;
      }

      result = ROUNDS.countingRounds(rounds);
      
      //Printing the final score and winner
      System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

      rounds = 0;
    }
    else 
    {
      team1lost ++;
    }

    if (team2lost == 0)
    {
      System.out.println("\nYour team the " +teamchoose2+ " is playing the " +teamvs2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose2.toLowerCase()).add(team[0].viewership(teamvs2.toLowerCase()))));
      
      teamsvsing.setteam1(teamchoose2);
      teamsvsing.setteam2(teamvs2);
      teamsvsing.resetscore1();
      teamsvsing.resetscore2();
      
      for (int i = 0; i < 9; i ++)
      {
        rounds = rounds ++;
        System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
        System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

        //Prompting the user for an input to choose a player
        System.out.println("Choose one of the players above.");
  
        playerchoose = scanner.nextLine();
  
        int x = 0;
        while (x == 0)
        {
          if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
          {
            x = 1;
          }
          else 
          {
            System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
            playerchoose = scanner.nextLine();
          }
        }

        //Prompting the user for an input to try and score
        System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team2Players[4].Try_To_Score(userinput);
  
        if (actionreturn.equals("goal"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
          teamsvsing.scorechangeteam1();
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        //Prompting the user for an input to try and save
        System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
  
        userinput = scanner.nextInt();
  
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
  
        actionreturn = Team2Goalies[3].Try_To_Save(userinput);
  
        if (actionreturn.equals("goal"))
        {
          teamsvsing.scorechangeteam2();
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

        int r = random.nextInt(8 - 1 + 1 ) + 1;
        if (i == 1)
        {
          PM = penalty[0].Penalty(PM);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a two minute minor.");
        }
        
        else if (i == 2)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
        }
    
        else if (i == 3)
        {
          PM = penalty[0].Penalty(PM, APM, i);
          allskaters.staminaChange("Penalty");
          System.out.println("The other team has drawn a penalty. Its a five minute major.");
        }
    
        else
        {
          allskaters.staminaChange("Stamina");
        }
  
        if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
        {
          i = 7;
          //Printing the current status of the game if it goes into overtime
          System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
        }

      //Printing the current score of the match
      System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
      }

      teamsleft.remove(teamsvsing.gameloser());
      
      if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
      {
        team2lost ++;
      }

      result = ROUNDS.countingRounds(rounds);
      
      //Printing the final score and winner
      System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

      rounds = 0;
    }
    else 
    {
      team2lost ++;
    }

    if ((teamsleft.size()) == 2)
    {
      System.out.println("\nYour team the " +teamchoose1+ " is playing the " +teamchoose2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamchoose2.toLowerCase()))));
      
      teamsvsing.setteam1(teamchoose1);
      teamsvsing.setteam2(teamchoose2);
      teamsvsing.resetscore1();
      teamsvsing.resetscore2();
          
      for (int i = 0; i < 9; i ++)
      {
        rounds = rounds ++;
        System.out.println( teams[teampos1].getskater1() + allskaters.staminaChange("Stamina") ); 
        System.out.println( teams[teampos1].getskater2() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater3() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater4() + allskaters.staminaChange("Stamina") );
        System.out.println( teams[teampos1].getskater5() + allskaters.staminaChange("Stamina") );

        //Prompting the user for an input to choose a player
        System.out.println("Player1, please hoose one of the players above.");
      
        playerchoose = scanner.nextLine();
      
        int x = 0;
        while (x == 0)
        {
          if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater1()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater2()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater3()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater4()).toLowerCase()))
          {
            x = 1;
          }
          else if ((playerchoose.toLowerCase()).equals((teams[teampos1].getskater5()).toLowerCase()))
          {
            x = 1;
          }
          else 
          {
            System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
            playerchoose = scanner.nextLine();
          }
        }

            //Prompting the user for an input to try and score
        System.out.println("\nPlayer1, please enter a number between 1 and 6 to try to score on the other team.");
      
        userinput = scanner.nextInt();
      
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
           }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }

        System.out.println("\nPlayer2, please enter a number between 1 and 6 to try to save Player1's shot.");
        
        userinput2 = scanner.nextInt();
      
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
           }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
      
        //actionreturn = (Team2Players[3, 4].Try_To_Score2Player(userinput, userinput2);
        actionreturn = Team2Players[3].Try_To_Score2Player(userinput, userinput2);
        actionreturn = Team2Players[4].Try_To_Score2Player(userinput, userinput2);
  
        if (actionreturn.equals("goal"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
          teamsvsing.scorechangeteam1();
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }

            //Prompting the user for an input to try and save
        System.out.println("\nPlayer2 now has a chance to score, Player2, enter a number between 1 and 6.");
      
        userinput = scanner.nextInt();
      
        x = 0;
        while (x == 0)
        {
          if (userinput > 0 && userinput <= 6)
          {
            x = 1;
          }
          else
          {
            System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
            userinput = scanner.nextInt();
          }
        }
        
        System.out.println("\nPlayer1, please enter a number between 1 and 6 to try to save Player2's shot.");
        
        userinput2 = scanner.nextInt();
      
        //actionreturn = Team2Goalies [3, 4].Try_To_Save2Player(userinput, userinput2);
        actionreturn = Team2Goalies [3].Try_To_Save2Player(userinput, userinput2);
        actionreturn = Team2Goalies [4].Try_To_Save2Player(userinput, userinput2);
      
        if (actionreturn.equals("goal"))
        {
          teamsvsing.scorechangeteam2();
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Scenario[k]);
        }
        else if (actionreturn.equals("save"))
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Goal_Save_Scenario[k]);
        }
        else
        {
          int k = random.nextInt(2 - 0 + 1 ) + 0;
          System.out.println(Miss_Scenario[k]);
        }
      
        if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
        {
          i = 7;
              //Printing the current status of the game if it goes into overtime
          System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
        }
          //Printing the current score of the game
      System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
      }
    
      teamsleft.remove(teamsvsing.gameloser());
          
      if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
      {
        team2lost ++;
      }

      result = ROUNDS.countingRounds(rounds);
      
          //Printing the final score and winner
      System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

      rounds = 0;

      System.out.println("The Stanley Cup winner is " +teamsvsing.gamewinner());
    }

    else if ((teamsleft.size()) == 3)
    {
      if (teamsleft.contains(teams[teampos1].getteamname()))
      {
        for(int i = 0; i > 3; i ++)
        {
          if(!(teams[teampos1].getteamname()).equals(teamsleft.get(i)) && !teamsleft.contains(teamvs))
          {
            teamvs = teamsleft.get(i);
          }
          else if (!(teams[teampos1].getteamname()).equals(teamsleft.get(i)) && teamsleft.contains(teamvs))
          {
            teamvs2 = teamsleft.get(i);
          }
        }
        int o = random.nextInt(2 - 1 + 1 ) + 1;
        if (o == 1)
        {
          teamsleft.remove(teamvs);

          System.out.println("\nYour team the " +teamchoose1+ " is playing the " +teamvs2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamvs2.toLowerCase()))));
          
          teamsvsing.setteam1(teamchoose1);
          teamsvsing.setteam2(teamvs2);
          teamsvsing.resetscore1();
          teamsvsing.resetscore2();
          
          for (int i = 0; i < 9; i ++)
          {
            rounds = rounds ++;
            System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
            System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

            //Prompting the user for an input to choose a player
            System.out.println("Choose one of the players above.");
      
            playerchoose = scanner.nextLine();
      
            int x = 0;
            while (x == 0)
            {
              if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
              {
                x = 1;
              }
              else 
              {
                System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
                playerchoose = scanner.nextLine();
              }
            }

            //Prompting the user for an input to try and score
            System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Players[4].Try_To_Score(userinput);
      
            if (actionreturn.equals("goal"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
              teamsvsing.scorechangeteam1();
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            //Primpting the user for an input to try and save
            System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Goalies[3].Try_To_Save(userinput);
      
            if (actionreturn.equals("goal"))
            {
              teamsvsing.scorechangeteam2();
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            int r = random.nextInt(8 - 1 + 1 ) + 1;
            if (i == 1)
            {
              PM = penalty[0].Penalty(PM);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a two minute minor.");
            }
            
            else if (i == 2)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
            }
        
            else if (i == 3)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a five minute major.");
            }
        
            else
            {
              allskaters.staminaChange("Stamina");
            }
      
            if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
            {
              i = 7;
              //Printing the current status of the game if it goes into overtime
              System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
            }
            //Printing the current score of the game
          System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
          }
    
          teamsleft.remove(teamsvsing.gameloser());
          
          if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
          {
            team2lost ++;
          }

          result = ROUNDS.countingRounds(rounds);
          
          //Printing the final score and winner
          System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

          rounds = 0;
        }
        else
        {
          teamsleft.remove(teamvs2);

          System.out.println("\nYour team the " +teamchoose1+ " is playing the " +teamvs+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose1.toLowerCase()).add(team[0].viewership(teamvs.toLowerCase()))));
          
          teamsvsing.setteam1(teamchoose1);
          teamsvsing.setteam2(teamvs);
          teamsvsing.resetscore1();
          teamsvsing.resetscore2();
          
          for (int i = 0; i < 9; i ++)
          {
            rounds = rounds ++;
            System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
            System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

            //Prompting the user for an input to choose a player
            System.out.println("Choose one of the players above.");
      
            playerchoose = scanner.nextLine();
      
            int x = 0;
            while (x == 0)
            {
              if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
              {
                x = 1;
              }
              else 
              {
                System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
                playerchoose = scanner.nextLine();
              }
            }

            //Prompting the user for an input to try and score
            System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Players[4].Try_To_Score(userinput);
      
            if (actionreturn.equals("goal"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
              teamsvsing.scorechangeteam1();
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            //Prompting the user for an input to try and save
            System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Goalies[3].Try_To_Save(userinput);
      
            if (actionreturn.equals("goal"))
            {
              teamsvsing.scorechangeteam2();
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            int r = random.nextInt(8 - 1 + 1 ) + 1;
            if (i == 1)
            {
              PM = penalty[0].Penalty(PM);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a two minute minor.");
            }
            
            else if (i == 2)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
            }
        
            else if (i == 3)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a five minute major.");
            }
        
            else
            {
              allskaters.staminaChange("Stamina");
            }
      
            if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
            {
              i = 7;
              //Printing the current status of the game if it goes into overtime
              System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
            }
          //Printing the current score of the game
          System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
          }
    
          teamsleft.remove(teamsvsing.gameloser());
          
          if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
          {
            team2lost ++;
          }

          result = ROUNDS.countingRounds(rounds);
          
          //Printing the final score and winner
          System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

          rounds = 0;
        }
      }
      else if ((teamsleft.contains(teams[teampos2].getteamname())))
      {
        for(int i = 0; i > 3; i ++)
        {
          if(!teams[teampos2].equals(teamsleft.get(i)) && !teamsleft.contains(teamvs))
          {
            teamvs = teamsleft.get(i);
          }
          else if (!(teams[teampos2].getteamname()).equals(teamsleft.get(i)) && teamsleft.contains(teamvs))
          {
            teamvs2 = teamsleft.get(i);
          }
        }
        int o = random.nextInt(2 - 1 + 1 ) + 1;
        if (o == 1)
        {
          teamsleft.remove(teamvs);

          System.out.println("\nYour team the " +teamchoose2+ " is playing the " +teamvs2+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose2.toLowerCase()).add(team[0].viewership(teamvs2.toLowerCase()))));
          
          teamsvsing.setteam1(teamchoose2);
          teamsvsing.setteam2(teamvs2);
          teamsvsing.resetscore1();
          teamsvsing.resetscore2();
          
          for (int i = 0; i < 9; i ++)
          {
            rounds = rounds ++;
            System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
            System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

            //Prompting the user for an input to choose a player
            System.out.println("Choose one of the players above.");
      
            playerchoose = scanner.nextLine();
      
            int x = 0;
            while (x == 0)
            {
              if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
              {
                x = 1;
              }
              else 
              {
                System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
                playerchoose = scanner.nextLine();
              }
            }

            //Prompting the user for an input to try and score
            System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Players[4].Try_To_Score(userinput);
      
            if (actionreturn.equals("goal"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
              teamsvsing.scorechangeteam1();
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            //Prompting the user for an input to try and save
            System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Goalies[3].Try_To_Save(userinput);
      
            if (actionreturn.equals("goal"))
            {
              teamsvsing.scorechangeteam2();
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            int r = random.nextInt(8 - 1 + 1 ) + 1;
            if (i == 1)
            {
              PM = penalty[0].Penalty(PM);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a two minute minor.");
            }
            
            else if (i == 2)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
            }
        
            else if (i == 3)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a five minute major.");
            }
        
            else
            {
              allskaters.staminaChange("Stamina");
            }
      
            if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
            {
              i = 7;
              //Printing the currentn status of the game if it goes into overtime
              System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
            }
          //Printing the current score of the game
          System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
          }
    
          teamsleft.remove(teamsvsing.gameloser());
          
          if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
          {
            team2lost ++;
          }

          result = ROUNDS.countingRounds(rounds);
          
          //Printing the final score and the winner
          System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

          rounds = 0;
        }        
        else
        {
          teamsleft.remove(teamvs2);

          System.out.println("\nYour team the " +teamchoose2+ " is playing the " +teamvs+  ".\nThe game is starting... The Fan Viewership of this game is: " + (team[0].viewership(teamchoose2.toLowerCase()).add(team[0].viewership(teamvs.toLowerCase()))));
          
          teamsvsing.setteam1(teamchoose2);
          teamsvsing.setteam2(teamvs);
          teamsvsing.resetscore1();
          teamsvsing.resetscore2();
          
          for (int i = 0; i < 9; i ++)
          {
            rounds = rounds ++;
            System.out.println( teams[teampos2].getskater1() + allskaters.staminaChange("Stamina") ); 
            System.out.println( teams[teampos2].getskater2() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater3() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater4() + allskaters.staminaChange("Stamina") );
            System.out.println( teams[teampos2].getskater5() + allskaters.staminaChange("Stamina") );

            //Prompting the user for an input to choose a player
            System.out.println("Choose one of the players above.");
      
            playerchoose = scanner.nextLine();
      
            int x = 0;
            while (x == 0)
            {
              if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater1()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater2()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater3()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater4()).toLowerCase()))
              {
                x = 1;
              }
              else if ((playerchoose.toLowerCase()).equals((teams[teampos2].getskater5()).toLowerCase()))
              {
                x = 1;
              }
              else 
              {
                System.out.println("The player you have choosen wasn't spelt right, doesn't have enough stamina, or isn't on the team. Please select again.");
                playerchoose = scanner.nextLine();
              }
            }

            //Prompting the uesr for an input to try and score
            System.out.println("\nPlease enter a number between 1 and 6 to try to score on the other team.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Players[4].Try_To_Score(userinput);
      
            if (actionreturn.equals("goal"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
              teamsvsing.scorechangeteam1();
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            //Prompting the user for an input to try and save
            System.out.println("\nThe other team now has a chance to score on you. Please enter a number between 1 and 6 to try to save the incoming shot.");
      
            userinput = scanner.nextInt();
      
            x = 0;
            while (x == 0)
            {
              if (userinput > 0 && userinput <= 6)
              {
                x = 1;
              }
              else
              {
                System.out.println("The number you have inputed is not within the range of 1 and 6. Please enter another number, this time between 1 and 6.");
                userinput = scanner.nextInt();
              }
            }
      
            actionreturn = Team2Goalies[3].Try_To_Save(userinput);
      
            if (actionreturn.equals("goal"))
            {
              teamsvsing.scorechangeteam2();
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Scenario[k]);
            }
            else if (actionreturn.equals("save"))
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Goal_Save_Scenario[k]);
            }
            else
            {
              int k = random.nextInt(2 - 0 + 1 ) + 0;
              System.out.println(Miss_Scenario[k]);
            }

            int r = random.nextInt(8 - 1 + 1 ) + 1;
            if (i == 1)
            {
              PM = penalty[0].Penalty(PM);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a two minute minor.");
            }
            
            else if (i == 2)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a four minute double minor.");
            }
        
            else if (i == 3)
            {
              PM = penalty[0].Penalty(PM, APM, i);
              allskaters.staminaChange("Penalty");
              System.out.println("The other team has drawn a penalty. Its a five minute major.");
            }
        
            else
            {
              allskaters.staminaChange("Stamina");
            }
      
            if (teamsvsing.getteam1score() == teamsvsing.getteam2score())
            {
              i = 7;
              //Printing the current status of the game if it goes into overtime
              System.out.println("The game has gone into overtime and will end when one team scores and the other does not.");
            }
          //Printing the current score
          System.out.println("\nThe current score of this match is" + teamsvsing.getscore());
          }
    
          teamsleft.remove(teamsvsing.gameloser());
          
          if (!(teamchoose2.toLowerCase()).equals((teamsvsing.gamewinner()).toLowerCase()))
          {
            team2lost ++;
          }

          result = ROUNDS.countingRounds(rounds);
          
          //Printing the final score and winner
          System.out.println("The ending score is " +teamsvsing.getscore()+ ". So the winner is " +teamsvsing.gamewinner() +". The amount of rounds played was " + result);

          rounds = 0;
        }  
      }
      //Printing out the Stanley Cup winner (winner of the entire game)
      System.out.println("The Stanley Cup winner is " +teamsvsing.gamewinner());
    }

    else if ((teamsleft.size()) == 4)
    {
      for(int i = 0; i > 4; i ++)
      {
          if((teams[0].getteamconf()).equals(teams[teamsleft.indexOf(i)].getteamconf()) && !teamsleft.contains(teamvs))
        {
          teamvs = teamsleft.get(i);
        }
        else if ((teams[0].getteamconf()).equals(teams[teamsleft.indexOf(i)].getteamconf())  && teamsleft.contains(teamvs))
        {
          teamvs2 = teamsleft.get(i);
        }
      }

      int t = random.nextInt(2 - 1 + 1 ) + 1;
      if (t == 1)
      {
        teamsleft.remove(teamvs);
      }
      else 
      {
        teamsleft.remove(teamvs2);
      }

      for(int i = 0; i > 4; i ++)
      {
          if((teams[15].getteamconf()).equals(teams[teamsleft.indexOf(i)].getteamconf()) && !teamsleft.contains(teamvs))
        {
          teamvs = teamsleft.get(i);
        }
        else if ((teams[15].getteamconf()).equals(teams[teamsleft.indexOf(i)].getteamconf())  && teamsleft.contains(teamvs))
        {
          teamvs2 = teamsleft.get(i);
        }
      }

      t = random.nextInt(2 - 1 + 1 ) + 1;
      if (t == 1)
      {
        teamsleft.remove(teamvs);
      }
      else 
      {
        teamsleft.remove(teamvs2);
      }

      teamvs = teamsleft.get(0);
      teamvs2 = teamsleft.get(1);

      t = random.nextInt(2 - 1 + 1 ) + 1;
      if (t == 1)
      {
        teamsleft.remove(teamvs);

        System.out.println("The Stanley Cup winner is " + teamvs2);
      }
      else 
      {
        teamsleft.remove(teamvs2);

        System.out.println("The Stanley Cup winner is " +teamvs);
      }
    }
  }
}

//Recursive method used to count rounds
class countrounds{
  public int countingRounds (int numOfRounds)
  {
    if (numOfRounds == 1)
    {
      return 1;
    }

    else
    {
      return countingRounds(numOfRounds-1) + countingRounds(numOfRounds - 1);
    }
  }
}

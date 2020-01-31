import java.util.Scanner;
import java.util.Arrays;

public class Game {

  static Human[] players = new Human[2];

  public static void main(String args[]) {
    System.out.println("\nWelcome to human game!");
    createCharacter();
    makeEnemies();
    userInterface();
  }

  private static void createCharacter() {

    Scanner scan = new Scanner(System.in);
    String playerName;
    int chosenSubclass;
    int chosenLine;
    String subclass = "";
    String line = "";


    System.out.println("\nCreate a new character.");
    System.out.print("\nEnter your name: ");
    playerName = scan.nextLine();

    System.out.println("Choose your subclass: \n1) Warrior \n2) Archer \n3) Mage");
    chosenSubclass = scan.nextInt();
    String throwAwayString = scan.nextLine();
    if (chosenSubclass == 1) {
      subclass = "Warrior";
    }
    else if (chosenSubclass == 2) {
      subclass = "Archer";
    }
    else if (chosenSubclass == 3) {
      subclass = "Mage";
    }

    System.out.println("\nChoose your allegiance: \n1) Fire \n2) Earth \n3) Air \n4) Water");
    chosenLine = scan.nextInt();
    throwAwayString = scan.nextLine();
    if (chosenLine == 1) {
      line = "Fire";
    }
    else if (chosenLine == 2) {
      line = "Earth";
    }
    else if (chosenLine == 3) {
      line = "Air";
    }
    else if (chosenLine == 4) {
      line = "Water";
    }
    Human player = new Human(playerName, subclass, line);
    players[0] = player;
  }

  public static void userInterface() {
    System.out.print("\n\n\n\n");
    showInfo();
  }

  public static void showInfo() {
    System.out.println("\nName: "+ players[0].getName());
    System.out.println("Health: "+ players[0].getHealth());
    System.out.println("Subclass: "+ players[0].getSubclass());
    System.out.println("Line: "+ players[0].getLine());
    System.out.println("Location: "+ players[0].getLocation());
  }

    public static void makeEnemies() {
      Enemy Weewoo = new Enemy("Weewoo");
      Enemy Peepoo = new Enemy("Peepoo");
      Enemy Awooga = new Enemy("Awooga");
      Enemy Jon = new Enemy("Jon");
      Enemy[] enemyList = new Enemy[4];
      enemyList[0] = Weewoo;
      enemyList[1] = Peepoo;
      enemyList[2] = Awooga;
      enemyList[3] = Jon;
    }
}

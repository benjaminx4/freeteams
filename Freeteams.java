import java.util.Scanner;

public class Freeteams{
  public static void main(String[] args){
    Scanner playersInput = new Scanner(System.in);
    System.out.print("How many players are there? ");
    int players = playersInput.nextInt();

    Scanner teamsInput = new Scanner(System.in);
    System.out.print("How many teams do you want? ");
    int teams = teamsInput.nextInt();

    Scanner prefsInput = new Scanner(System.in);
    System.out.println("Input all preferences below");
    String[] prefs = new String[players];
    for (int i = 0; i < players; i++){
      prefs[i] = prefsInput.nextLine();
    }
  }
}

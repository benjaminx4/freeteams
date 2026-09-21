import java.util.Scanner;

public class Freeteams{
  public int arrayIndexOf(String thing; String[] array){
    for (int i = 0; i < array.length; i++){
      if (thing == array[i]) return i;
    }
    return -1;
  }

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

    String[] names = new String[players];
    String[] yes = new String[players];
    String[] no = new String[players];
    for (int j = 0; j < players; j++){
      names[j] = prefs[j].substring(0,indexOf(";"));
      prefs[j] = prefs[j].substring(indexOf(";") + 1);
      yes[j] = prefs[j].substring(0,indexOf(";")) + ", ";
      no[j] = prefs[j].substring(indexOf(";" + 1)) + ", ";
    }

    int k = teams;
    String pairings = "";
    int pairingsSize = 0;
    while (k > 0){
      int current = (int) (Math.random() * players);
      if pairings.contains(names[current] + ",") == false{
        int teamSizeReq = (int) Math.round((players - pairingsSize) / k);
        int teamSize = 1;

        if (yes[current].indexOf(",") > 0){
          String[] currentYes = new String[players];
          int l = 0;
          while (yes[current].indexOf(",") > 0){
            currentYes[l] = yes[current].substring(0,indexOf(","));
            yes[current] = yes[current].substring(indexOf(",") + 1);
            l++;
          }

          int check = (int) (Math.random() * l);
          if (currentYes[l])
        }

        else{
          // random number, check not in no, then pair
        }
      }
    }
  }
}

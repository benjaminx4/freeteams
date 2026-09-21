import java.util.Scanner;

public class Freeteams{
  public static int arrayIndexOf(String[] array, String thing){
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
      names[j] = prefs[j].substring(0,prefs[j].indexOf(";"));
      prefs[j] = prefs[j].substring(prefs[j].indexOf(";") + 1);
      yes[j] = prefs[j].substring(0,prefs[j].indexOf(";")) + ", ";
      no[j] = prefs[j].substring(prefs[j].indexOf(";") + 1) + ", ";
    }

    int k = teams;
    String pairings = "";
    int pairingsSize = 0;
    while (k > 0){
      int current = (int) (Math.random() * players);
      if (pairings.contains(names[current] + ",") == false){
        pairings += names[current] + ", ";
        pairingsSize++;
        int teamSizeReq = (int) Math.round((players - pairingsSize) / k);
        int teamSize = 1;
        System.out.println(pairings);
        while (teamSize < teamSizeReq){
          if (yes[current].indexOf(",") > 0){
            String[] currentYes = new String[players];
            int l = 0;
            while (yes[current].indexOf(",") > 0){
              currentYes[l] = yes[current].substring(0,yes[current].indexOf(","));
              yes[current] = yes[current].substring(yes[current].indexOf(",") + 1);
              l++;
            }

            while (l > 0 && teamSize < teamSizeReq){
              int check = (int) (Math.random() * l);
              if (no[arrayIndexOf(names, currentYes[check])].contains(currentYes[l] + ",") == false){
                pairings += currentYes[check] + ", ";
                pairingsSize++;
                teamSize++;
                System.out.println(pairings);
              }
              else{
                for (int m = check; m < players - 1; m++){
                  currentYes[m] = currentYes[m + 1];
                }
                l--;
              }
            }
          }

          else{
            int check = (int) (Math.random() * players);
            if (names[current] != names[check]){
              if (no[current].contains(names[check] + ",")){
                if (no[check].contains(names[current] + ",")){
                  pairings += names[check] + ", ";
                  pairingsSize++;
                  teamSize++;
                  System.out.println(pairings);
                }
              }
            }
          }
        }
      }

      pairings += "\n";
      k--;
    }

    System.out.println(pairings);
  }
}

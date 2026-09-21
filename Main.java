import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Name/username: ");
    String name = nameInput.nextLine();

    Scanner yesInput = new Scanner(System.in);
    System.out.println("Type the names/usernames of people you want to be in a team with (optional; separate with commas):");
    String yes = yesInput.nextLine();

    Scanner noInput = new Scanner(System.in);
    System.out.println("Now type names/usernames of people you do NOT want to be in a team with (also optional; separate with commas):");
    String no = noInput.nextLine();

    System.out.println("Please copy the text below and send it to the host:");
    System.out.println(name + ";" + yes + ";" + no);
  }
}

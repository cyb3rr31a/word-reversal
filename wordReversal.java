import java.util.Scanner;

public class wordReversal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter any phrase you like: ");
    String phrase = scanner.nextLine();

    System.out.println(phrase);
    scanner.close();

    String words[] = phrase.split("");
    String reverse = " ";

    for (int i = phrase.length() - 1; i >= 0; i--) {
        reverse += words[i] + " ";
    }

    System.out.println(reverse.trim());
    
    }
}
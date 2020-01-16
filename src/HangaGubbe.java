import java.io.File;
import java.util.*;
public class HangaGubbe {
    public static void main(String[] args) {
        Start();
        Väljaord();
    }
        static int Start() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello and welcome to our Hangman program");
            System.out.println("Please enter if you are playing 1 or 2 players.(press 1 for 1 player, 2 for 2 player)");
            int gamers = scanner.nextInt();
            return gamers;
        }
        static void Väljaord(int gamers) {
        if (gamers == 1)
            Scanner in = null;
            try {
                in = new Scanner(new File("day8.txt"));


            }
}



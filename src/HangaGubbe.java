import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class HangaGubbe {
    public static void main(String[] args) {
        Start();
        Valjaord();
    }
        static int Start() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello and welcome to our Hangman program");
            System.out.println("Please enter if you are playing 1 or 2 players.(press 1 for 1 player, 2 for 2 player)");
            int gamers = scanner.nextInt();
            return gamers;
        }
        static int Valjaord(int gamers) {
        if (gamers == 1) {
            Scanner in = null;
            int ctr = 0;
            try {
                in = new Scanner(new File("Ordlista.txt"));
                while (in.hasNext()) {
                    ctr = ctr + 1;
                }
                String[] ordlista = new String[ctr];
                Scanner in2 = new Scanner(new File("Ordlista.txt"));
                for (int i = 0; i < ctr; i++){
                ordlista[i] = in2.next();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        }
}



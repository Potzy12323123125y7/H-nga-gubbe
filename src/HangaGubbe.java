import java.io.*;
import java.util.*;
public class HangaGubbe {
    public static void main(String[] args) {
        int gamers = Start();
        String x = Valjaord(gamers);
        Osynligochgissa(x);

    }

    static void Osynligochgissa(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.print("_ ");
        }
    }
        static int Start () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello and welcome to our Hangman program");
            System.out.println("Please enter if you are playing 1 or 2 players.(press 1 for 1 player, 2 for 2 player)");
            int gamers = scanner.nextInt();
            return gamers;
        }
        static String Valjaord ( int gamers){
            if (gamers == 1) {
                try {
                    File myObj = new File("Ordlista.txt");
                    Scanner myReader = new Scanner(myObj);
                    String[] data;
                    data = new String[100];
                    for (int i = 0; i < 100; i++) {
                        data[i] = myReader.nextLine();
                    }
                    int x = (int) (100.0 * Math.random());
                    myReader.close();
                    return data[x];
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            return null;
        }
    }



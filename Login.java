import java.util.Scanner;

public class Login {
        public static void main(String[] args)
        {

            Scanner input = new Scanner (System.in);

            String usernev;
            String jelszo;


            System.out.println("Üdv");
            System.out.println("\nKérlek add meg a felhasználóneved és jelszavad, a bejelentkezéshez");

            System.out.println("Felhasználónév: ");
            usernev = input.nextLine();

            System.out.println("Jelszó: ");
            jelszo = input.nextLine();

            UserAccount login = new UserAccount(usernev, jelszo);

            if(login.checkPassword())
                System.out.println("You are logged in!");
            else
                System.out.println("A megadott jelszó, vagy felhasználónév helytelen.");
        }
   }

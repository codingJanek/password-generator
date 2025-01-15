import java.util.Random;
import java.util.Scanner;

public class PasswortGenerieren {
    private static final String PASSWORT_ZEICHEN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!§$%&/()=?`´'#*+-<>";
    private Scanner scanner;
    private Random random;

    public PasswortGenerieren() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void generierePasswort() {
        StringBuilder password = new StringBuilder();
        boolean weiter = true;

        while (weiter) {
            System.out.print("Gebe die Länge des Passworts an: ");
            int length = scanner.nextInt();
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(PASSWORT_ZEICHEN.length());
                PASSWORT_ZEICHEN.charAt(index);
                password.append(PASSWORT_ZEICHEN.charAt(index));
            }
            System.out.println(password.toString());
            System.out.print("Möchtest du noch ein Passwort generieren? (ja/nein): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("nein")) {
                System.out.println("Programm beendet!");
                weiter = false;
            }
        }
    }
}

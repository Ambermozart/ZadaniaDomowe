package pl.sdacademy.zadania;
import java.util.Scanner;

public class Kilometry {

    public static void main(String... args) {

        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            String[] miles = new String[1];
            System.out.print("Podaj wartość w milach: ");
            miles[0] = scanner.nextLine();

            for (String number : miles) {
                boolean match = number.matches("^\\d+(\\.\\d+)?$");
                if (match) {
                    Double milesValue = Double.parseDouble(number);
                    double kilometres = milesValue / 0.62137;
                    System.out.printf("Wartość w kilometrach to \u2248 %.2f \n", kilometres);
                }
            }
        }
    }
}

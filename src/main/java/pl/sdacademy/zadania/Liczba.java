package pl.sdacademy.zadania;

import java.util.Scanner;

public class Liczba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("To nie jest liczba całkowita");
        }
        int sum = 0;
        do {
            sum = sum + number % 10;
            number = number / 10;
        }
        while (number > 0);

        if (sum > 10) {
            int newSum = 0;
            int newNumber = sum;
            do {
                newSum = newSum + newNumber % 10;
                newNumber = newNumber / 10;
            }
            while (newNumber > 0);
            System.out.println(newSum);
        } else {
            System.out.println(sum);
        }
    }
}



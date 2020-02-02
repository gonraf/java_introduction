package loops;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNamber = random.nextInt(10) +1;

        Scanner scanner = new Scanner(System.in);
        int tryCounter = 0;
        int inputNumber = -1;

        do {
            System.out.println("Podaj liczbę");
            inputNumber = scanner.nextInt();
            tryCounter++;
        } while(randomNamber != inputNumber);

        System.out.println("Zgadłeś za " + tryCounter + " razem" );

    }
}

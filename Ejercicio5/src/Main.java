import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Random random = new Random();

        int numAleatorio = random.nextInt(500) + 1;
        int num = 0;
        int contador = 0;

        do {

            try {

                System.out.println("Ingresa un número");
                contador += 1;
                num = sc.nextInt();

                System.out.println(num > numAleatorio ? "El número a adivinar es menor que " + num : num < numAleatorio ?
                        "El número a adivinar es mayor que " + num : "Adivinaste el número!");


            } catch (InputMismatchException e) {

                sc.next();
                System.out.println("Valor ingresado inválido, intentalo de nuevo.");

            }

        } while (num != numAleatorio);

        System.out.println("El número de intentos fue: " + contador);

    }

}

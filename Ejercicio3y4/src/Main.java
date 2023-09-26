import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");



        DivisionNumero d = new DivisionNumero();

        try {

            String s1 = sc.next();
            String s2 = sc.next();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            System.out.println(d.division(a,b));

        } catch (InputMismatchException e) {

            System.out.println("El valor ingresado no es un número!");

        } catch (NumberFormatException f) {

            System.out.println("No se pudo convertir el valor a número");

        } catch (ArithmeticException g) {

            System.out.println("No se puede dividir por cero!");

        } finally {

            System.out.println("Gracias por visitar, adios!");

        }



    }

}

public class Main {

    public static void main(String[] args) {

        String[] arreglo = new String[5];

        arreglo[0] = "Hola";
        arreglo[1] = "Como";
        arreglo[2] = "Estas";
        arreglo[3] = "Querido";
        arreglo[4] = "Amigo";

        try {

            for (int i = 0; i <= 10; i++) {

                System.out.println(arreglo[i]);

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("El arreglo no tiene más espacio!");

        }



    }

}

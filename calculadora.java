import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculadora = true;

        while (calculadora) {

            int opcionn = 0;
            while (true) {
                System.out.println("Ingrese la operacion a realizar:");
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Division");
                System.out.println("4.- Multiplicacion");
                System.out.print("Opcion: ");

                try {
                    opcionn = scanner.nextInt();
                    if (opcionn >= 1 && opcionn <= 4) {
                        break; // Salir del bucle cuando la opción sea válida
                    } else {
                        System.out.println("Ingrese una opción válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un número entero.");
                    scanner.nextLine(); // limpiar entrada incorrecta
                }
            }

            double num1 = 0;
            while (true) {
                try {
                    System.out.print("Ingresa el primer número: ");
                    num1 = scanner.nextDouble();
                    break; // salir cuando sea válido
                } catch (InputMismatchException e) {
                    System.out.println("Ingresa un número válido.");
                    scanner.nextLine();
                }
            }

            double num2 = 0;
            while (true) {
                try {
                    System.out.print("Ingresa el segundo número: ");
                    num2 = scanner.nextDouble();
                    break; // salir cuando sea válido
                } catch (InputMismatchException e) {
                    System.out.println("Ingresa un número válido.");
                    scanner.nextLine();
                }
            }

            double result = 0;
            switch (opcionn) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                        continue; // vuelve a iniciar sin mostrar resultado
                    }
                    break;
                case 4:
                    result = num1 * num2;
                    break;
            }
            System.out.println("Resultado: " + result);

            System.out.print("¿Quieres realizar otra operación? (s/n): ");
            String decision = scanner.next().toLowerCase();

            if (!decision.equals("s")) {
                calculadora = false;
            }
        }

        scanner.close();
    }
}

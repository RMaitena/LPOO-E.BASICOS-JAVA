package locro;

import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[] args) {
        
        System.out.println("¡Ejercicio 5! :)");
        Scanner scanner = new Scanner(System.in);
        char opcion;
        
        do {
            
            System.out.print("Introduce el primer numero: ");
            int numeroA = scanner.nextInt();
            System.out.print("Introduce el segundo numero: ");
            int numeroB = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Introduce la operacion escrita obvio (suma, resta, multiplicacion o division): ");
            String operacion = scanner.nextLine().toLowerCase();
            int resultado = 0;
            boolean operacionValida = true;
            
            switch (operacion) {
                case "suma":
                    resultado = numeroA + numeroB;
                    break;

                case "resta":
                    resultado = numeroA - numeroB;
                    break;

                case "multiplicacion":
                    resultado = numeroA * numeroB;
                    break;
                
                case "division":
                    if (numeroB != 0) {
                        resultado = numeroA / numeroB;
                    } else {
                        System.out.println("Error, no se puede dividir con 0 pa");
                        operacionValida = false;
                    }
                    break;
                
                default:
                    System.out.println("Operación no valida");
                    operacionValida = false;
                    break;
            }
            
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado + "!¡");
            }
            System.out.print("Queres realizar otra operacion? 1(Si), 0(No): ");
            opcion = scanner.next().charAt(0);  
            scanner.nextLine(); //
        }
        while (opcion == '1');
        scanner.close();
    }
}

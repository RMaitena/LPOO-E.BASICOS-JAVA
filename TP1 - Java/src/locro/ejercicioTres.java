package locro;

import java.util.Scanner;

public class ejercicioTres {
	public static void main(String[] args) {
		
		System.out.println("¡Ejercicio 3! :)");
  		Scanner scanner = new Scanner(System.in);
  		int numero;

  		while (true) {
  			System.out.print("Ingrese un numero: ");
         	numero = scanner.nextInt();
         		if (numero > 100 && esPrimo(numero)) {
         			System.out.println("El numero " + numero + " es mayor a 100 y es primo");
         			break;
         		}
         		else {
         			System.out.println("El numero " + numero + " no cumple con las condiciones, vuelva a intentar :)");
         		}
        }
  		scanner.close();
    
	}

	public static boolean esPrimo(int numero) {
		
		if(numero <= 1){
			return false;
		}
    	for (int i = 2; i <= Math.sqrt(numero); i++) {
    		if (numero % i == 0) {
    			return false;
         	}
    	}
    	return true;

	}

}

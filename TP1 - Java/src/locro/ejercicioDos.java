package locro;

public class ejercicioDos {
	public static void main(String[] args) {
		
		System.out.println("¡Ejercicio 2! :)");
		for (int i = 50; i <= 100; i++) {
			if (esPrimo(i)) {
				System.out.println(i + " es primo¡!");
			}
			else {
				System.out.print(i + " tiene divisores y son: ");
				impDivisores(i);
				System.out.println();
			}
		}
		
	}

	public static boolean esPrimo(int numero) {
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
		
    }

	public static void impDivisores(int numero) {
    
    		for (int i = 1; i <= numero / 2; i++) {
    			if (numero % i == 0) {
    				System.out.print(i + " ");
    			}
    		}
    		System.out.print(numero);
    }
}

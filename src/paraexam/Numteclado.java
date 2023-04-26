package paraexam;
import java.util.Scanner;
public class Numteclado {
	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);

	        int num, positivos = 0, negativos = 0, ceros = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Ingrese un numero entero: ");
	            num = tc.nextInt();

	            if (num > 0) {
	                positivos++;
	            } else if (num < 0) {
	                negativos++;
	            } else {
	                ceros++;
	            }
	        }

	        System.out.println("Cantidad de numeros positivos: " + positivos);
	        System.out.println("Cantidad de numeros negativos: " + negativos);
	        System.out.println("Cantidad de numeros iguales a cero: " + ceros);

	        tc.close();
	    }
	}



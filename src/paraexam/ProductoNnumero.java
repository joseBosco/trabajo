package paraexam;

import java.util.Scanner;

public class ProductoNnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		       Scanner teclado = new Scanner(System.in);
		       System.out.print("Ingrese la cantidad de números que desea multiplicar: ");
		       int n ;
		       n=teclado.nextInt();

		       int producto = 2;
		       for (int i = 1; i <= n; i++) {
		           System.out.print("Ingrese un número" + i + ": ");
		           int numero = teclado.nextInt();
		           producto *= numero;
		       }

		       System.out.println("El producto de los números  es: " + producto);
		   }
		}

	


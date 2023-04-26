package paraexam;

import java.util.Scanner;

public class NumDistindto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner tc = new Scanner(System.in);
		        System.out.print("Ingrese la cantidad de números a leer: ");
		        int n = tc.nextInt();

		        int sumaPositivos = 0;
		        int conteoNegativos = 0;

		        for (int i = 0; i < n; i++) {
		            System.out.print("Ingrese el número " + (i + 1) + ": ");
		            int num = tc.nextInt();
		            if (num > 0) {
		                sumaPositivos += num;
		            } else if (num < 0) {
		                conteoNegativos++;
		            }
		        }

		        System.out.println("La suma de los números positivos es " + sumaPositivos);
		        System.out.println("El número de números negativos es " + conteoNegativos);
		    }
		}

	



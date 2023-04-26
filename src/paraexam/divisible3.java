package paraexam;

import java.util.Scanner;

public class divisible3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Escribir un programa que lea un número cualquiera e imprima si el número leído es
		divisible por tres.*/


		Scanner teclado=new Scanner(System.in);
		
		double x,resultado;
		System.out.println("escriba un numero para saber si es divisible entre 3");
		x=teclado.nextDouble();
		
		if(x %3== 0) {
			
			
			
			System.out.println("es divisible");
		}
		else {
			System.out.println("no es divisible");
			
		}
	}

}

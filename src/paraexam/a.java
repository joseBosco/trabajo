package paraexam;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*. Escriba un programa que lea un numero A, si A es un número positivo calcule Y=2^A, si es
negativo calcule Y=A+5 imprimir el resultado de Y.*/

		Scanner teclado=new Scanner(System.in);
		int A,resultado,y;
		
		System.out.println("ingresa un numero");
		A =teclado.nextInt();


		if (A>0){
			
			resultado=(2)*(A);
		
		    System.out.println("el resultado es : "+ resultado);
		}
		else if (A<1)
		{
			resultado=A+5;
			
		
		    System.out.println("el resultado es : "+ resultado);
		}
	}

}

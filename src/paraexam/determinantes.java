package paraexam;

import java.util.Scanner;

public class determinantes {
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		/*Determinar el valor del determinante de segundo orden. */
		//ab-cd
		double a,b,c,d,resultado;
		System.out.println(" ingresa el primer valor ");
		a=teclado.nextDouble();
		
		System.out.println(" ingresa el segundo valor ");
		b=teclado.nextDouble();
		
		System.out.println(" ingresa el tercer valor ");
		c=teclado.nextDouble();
		
		System.out.println(" ingresa el cuarto valor  ");
		d=teclado.nextDouble();
		
		resultado=(a*b)-(c*d);
		System.out.println(" la respuesta es :"+resultado);
		
			
}
}
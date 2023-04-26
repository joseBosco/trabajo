package paraexam;

import java.util.Scanner;

public class xab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinar la solución lineal que tiene la forma ax + b =0 donde a y b son números reales.
		Scanner teclado=new Scanner(System.in);
		double ax,b,resultado;
		
		System.out.println(" ingresa el valor de (a) ");
		ax = teclado.nextDouble();
		
		System.out.println(" ingresa el valor (b) ");
		b = teclado.nextDouble();
		 System.out.println(" ax+b=0");
		 
		resultado=b/ax;
		
		System.out.println(" El resultado de esta opracion es :  "+ resultado);
		
		
 
	}

}

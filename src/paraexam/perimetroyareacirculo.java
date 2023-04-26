package paraexam;

import java.util.Scanner;

public class perimetroyareacirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado =new Scanner(System.in);
		/*Determinar el Perímetro de una circunferencia y el área de un círculo.*/


		double radio, pi=3.1416,area,perimetro;
		
		System.out.println(" ingresa el radio de el circulo");
		radio=teclado.nextInt();
	
		perimetro= (2*3.1416)*(radio);
		
		System.out.println("el perimetro del circulo es:"+ perimetro );
		
		
		
	area=(radio*2)*(pi);
		
		
		
		System.out.println("El area del rectangulo es :" + area );

		

	}

}

package paraexam;

import java.util.Scanner;

public class fuerza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Determine el valor de la fuerza de un cuerpo que tiene por masa “M” y aceleración “A”.
		
double Masa, Aceleracion, Fuerza;
		
		Scanner teclado =new Scanner(System.in);
		System.out.println("Ingrese la Masa de el cuerpo");
		Masa=teclado.nextDouble();
		System.out.println("Ingrese la Aceleracion de el cuerpo");
		Aceleracion=teclado.nextDouble();
		
		Fuerza= Masa*Aceleracion	;	
		System.out.println("la Fuerza de el cuerpo es :" +Fuerza);
	}

}

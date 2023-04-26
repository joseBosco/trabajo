package paraexam;

import java.util.Scanner;

public class areacilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular el volumen de un cilindro conociendo su radio y altura*/
		
		Scanner teclado= new Scanner(System.in);
		double radio,pi=3.1416,volumen,altura;
		
		System.out.println(" ingresa el radio de el circulo");
		radio=teclado.nextDouble();
	System.out.println("ingrese la altura del cilindro");
	altura=teclado.nextDouble();
		volumen= (3.1416)*(radio*2)*(altura);
		
		System.out.println("el volumen del cilindro es:"+ volumen);
		
		

	}

}

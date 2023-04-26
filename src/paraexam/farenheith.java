package paraexam;

import java.util.Scanner;

public class farenheith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Convertir X grados Fahrenheit a grados Celsius. Celsius= 5/9 (Fahrenheit -323).*/
 
		  Scanner teclado= new Scanner(System.in);  
		  
		double fahrenheith,grado ,resultado;
		System.out.println("ingrese la temperatura en fahrenheith ");
		
	fahrenheith=teclado.nextDouble();
	
	 resultado=(fahrenheith-32)/1.8; 
	 
	 System.out.println( " la temperatura en grados fahrenheith es: " +fahrenheith + " en grados celsius es: " + resultado);
	}

}

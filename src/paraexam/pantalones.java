package paraexam;

import java.util.Scanner;

public class pantalones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Unos pantalones se venden a 10 dólares cada uno si se compran más de tres, 12 dólares 
en los demás casos, estructure un programa que lea un número de entrada de pantalones 
comprados e imprima el costo total.*/
		
		Scanner teclado=new Scanner(System.in);
		int pantalon,resultado;
		System.out.println("cuantos pantalones quiere comprar");
		pantalon=teclado.nextInt();
		if(pantalon<3) {
			
			resultado=10*pantalon;
			
		}
		
		
	else if (pantalon>3) {
		resultado= 12*pantalon;
		System.out.println("El costo sera : " + resultado);
		
	}
	}
	
	
	
	
	

}

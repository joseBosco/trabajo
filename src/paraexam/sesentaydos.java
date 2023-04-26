package paraexam;

import java.util.Scanner;

public class sesentaydos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escriba un programa que encuentre los primeros tres números perfectos. Un número 
perfecto es un número entero positivo, que es igual a la suma de todos los enteros 
positivos (excluidos el mismo) que son divisores del número. El primer número es 6 ya que
los divisores de 6 son 1,2,3 y 1+2+3=6*/
	Scanner teclado=new Scanner	(System.in);
	
int numero,resultado1,resultado,resultado2;
System.out.println("ingrese el numero perfecto");
numero=teclado.nextInt();
if (numero%2==0&&numero%3==0) {
	
	
do { resultado=numero/numero;
     resultado1=numero/3;
     resultado2=numero/2;
     
	System.out.println("El resultado es : "+resultado);
	System.out.println("El resultado es : "+resultado1);
	System.out.println("El resultado es : "+resultado2);
}
	
	while(numero%numero==0); {
		
		
		
		
	}
	
}
	else if (numero%3==0) {
		
		do { 
			resultado=numero/numero;
			resultado1=numero/3;
				
		System.out.println("El resultado es : "+resultado);
		System.out.println("El resultado es : "+resultado1);
	}
		
		while(numero%numero==0); {
		
	}
		
	
	
	
}
	
	
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	/*int numero,fact;	
		
		System.out.println("ingrese un numero");
		numero=teclado.nextInt();
		
		for(int i=1; i<=numero; i++) ;
		
			
			
		
					
			fact=numero*(2);
			System.out.println("el resultado es : "+fact);
			fact=numero*(3);	
			System.out.println("el resultado es : "+fact);*/
				
	



package paraexam;

import java.util.Scanner;

public class clasitraingulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*UN triángulo es equilátero si posee sus tres lados iguales, es Isósceles si tiene solamente 
dos lados iguales y es escaleno cuando todos sus lados son desiguales. Escribir un 
programa que lea las dimensiones de los lados del triángulo y presente como salida el 
mensaje de su clasificación de triangulo.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int lado1,lado2,lado3 ,triangulo;
		
		System.out.println("ingrese los lados del triangulo");
		System.out.println(" ");
		System.out.println("ingrese el primer lado del triangulo");
		lado1=teclado.nextInt();
		System.out.println("ingrese el segundo lado del triangulo");
		lado2=teclado.nextInt();
		System.out.println("ingrese el tertcer lado del triangulo");
		lado3=teclado.nextInt();
		
		 if (lado1==lado2 && lado1==lado3) {
			 
			 System.out.println("el triangulo es equilatero");
			 
			 
			 
		 }
		
		 else if (lado1==lado2 && lado2!=lado3) {
		
			 System.out.println("el triangulo es isosceles");
		
		
		
		
		 }
		
		if (lado1 != lado2 && lado1 != lado3)
		 {
		 
		 System.out.println("el triangulo es escaleno");
		 
		 }
		
	}

}

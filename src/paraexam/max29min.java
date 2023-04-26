package paraexam;

import java.util.Scanner;

public class max29min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Escriba un programa que lea dos números enteros positivos distintos y escriba la 
diferencia entre el mayor y el menor. Asegúrese que su programa escriba por ejemplo 8 si 
los números son 10 y 2 o bien 2 y 10.*/
		Scanner teclado=new Scanner(System.in);
		int x ,y,resultado;
		System.out.println(" hola bienvenido");
		System.out.println(" ");
		System.out.println(" escriba el primer numero");
		x =teclado.nextInt();
		System.out.println(" ");
		System.out.println("Escriba el segundo numero");
		y=teclado.nextInt();
		
		if (x>y) {
			resultado=x-y;
		System.out.println(" El mayor es : "+x);
		System.out.println("la diferencia entre los dos es : "+resultado);
		}
		else if (y>x)
		{
		
			System.out.println(" El mayor es : "+y);
			resultado=y-x;
					
			System.out.println("la diferencia entre los dos es : "+resultado);
		
		}
		
	}

}

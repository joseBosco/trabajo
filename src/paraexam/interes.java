package paraexam;

import java.util.Scanner;

public class interes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*. Escribir un programa para calcular el interés de una capital conforme a la siguiente
condición. Si el capital prestado es mayor que 10,000 dólares entonces la tasa es del 7% en
caso contrario del 6%, debe imprimir el capital y su interés*/
		
		Scanner teclado=new Scanner(System.in);
		int capital,resultado;
		
		System.out.println("ingresa el capital que desea prestar");
		capital =teclado.nextInt();


		if (capital>10000){
			
			resultado=capital*(7)/100;
		   
		    System.out.println("el interes sera : "+ resultado);
		}
		else if (capital<10000)
		{
			resultado=capital*(6)/100;
			
		
		    System.out.println("el interes  de "+capital+" sera : "+ resultado);

		}
	}

}

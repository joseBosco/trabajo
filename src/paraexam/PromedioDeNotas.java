package paraexam;

import java.util.Scanner;

public class PromedioDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Obtener el promedio de N notas
		double Promedio, notas=0, Acumulado=1 ;
		int NumNotas;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de notas a promediar");
	NumNotas=teclado.nextInt();
		while (Acumulado<=NumNotas) {
			System.out.println("ingrese la nota numero " + Acumulado);
			notas=teclado.nextDouble();
			Acumulado++;
		
	}
		Promedio = notas / NumNotas; 
		System.out.println("el resultado es : "+ Promedio);

	}
}

package paraexam;

import java.util.Scanner;

public class alumnoapro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que lea la calificación de un alumno e imprima el mensaje de
		aprobado si su calificación es mayor o igual a 60, en caso contrario imprima reprobado.*/
		
		Scanner teclado=new Scanner(System.in);
		int calificacion,resultado;
		
		System.out.println("ingresa la calificacion del alumno");
		calificacion =teclado.nextInt();


		if (calificacion>=60){
			
			
		 System.out.println("Aprobado");
		}
		else if (calificacion<60)
		{
			
			
		
		    System.out.println("Reprobado ");
		    
		}
		    
	}

}

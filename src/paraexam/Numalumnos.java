package paraexam;

import java.util.Scanner;

public class Numalumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriba un programa que lea las notas de “N” alumnos y calcule cuantos aprobados y 
		desaprobados hay (está aprobado si la nota es mayor de 60).*/
Scanner teclado= new Scanner(System.in);
System.out.print("Ingrese el número de notas de los alumnos: ");

int notas =teclado.nextInt();

int[] alumnos = new int[notas];
int aprobaron = 0;
int dejaron = 0;

for (int i = 0; i < notas; i++) {
    System.out.print("Ingrese las notas de los alumnos " + (i+1) + ": ");
    alumnos[i] =teclado.nextInt();

    if (alumnos[i]>=60) {
       System.out.println("el estudiante aprobo");
       aprobaron++;
    } else {
       System.out.println("el estudiante no aprobo");
       dejaron++;
    }
}

System.out.println("El número de estudiantes aprobados es: " + aprobaron);
System.out.println("El número de estudiantes que dejaron es es: " + dejaron);

	}

}

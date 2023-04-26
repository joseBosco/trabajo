package paraexam;

import java.util.Scanner;

public class Numenteroparimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
System.out.print("Ingrese el número de numeros a saber si es par o impar: ");

int n =teclado.nextInt();

int[] numeros = new int[n];
int pares = 0;
int impares = 0;

for (int i = 0; i < n; i++) {
    System.out.print("Ingrese el número " + (i+1) + ": ");
    numeros[i] =teclado.nextInt();

    if (numeros[i] % 2 == 0) {
       System.out.println("numero par");
       pares++;
    } else {
       System.out.println("numero impar");
       impares++;
    }
}

System.out.println("El número de números pares es: " + pares);
System.out.println("El número de números impares es: " + impares);
}

	}



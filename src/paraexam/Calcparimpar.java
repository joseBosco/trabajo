package paraexam;

import java.util.Scanner;

public class Calcparimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int NumerosImpares=0;
int suma=0;
for(int i=20 ; i<=100; i+=2) {
	NumerosImpares ++;
	suma+=i;

	}
System.out.println("El número de números impares es: " + NumerosImpares);
System.out.println("La suma de los números impares es: " + suma);

}
}


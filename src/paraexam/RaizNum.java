package paraexam;

import java.util.Scanner;

public class RaizNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Determine la raíz Cuadrada de un número cualquiera.
		double Num, raiz;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese un numero para obtener la raiz cuadrada");
		Num=teclado.nextDouble();
		
		raiz= Math.sqrt(Num);
		System.out.println("La raiz de : "+ Num + " es "+  raiz);
	}

}
 
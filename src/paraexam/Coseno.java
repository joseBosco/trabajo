package paraexam;

import java.util.Scanner;

public class Coseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Obtener el valor del Coseno de un número cualquiera.
		double Coseno,grados ;
		Scanner teclado =new Scanner(System.in);
		System.out.println("Ingrese los grados");
		grados=teclado.nextDouble();
		Coseno=Math.cos(grados);
		System.out.println("El coseno de  "+ grados + "es: " + Coseno );
	}

}

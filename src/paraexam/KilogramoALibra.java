package paraexam;

import java.util.Scanner;

public class KilogramoALibra {
	public static void main(String[] args) {
Scanner teclado= new Scanner(System.in);
		double num,Libra ,Kilogramo=2.2;
		System.out.println("ingrese el numero de kilogramos para convertir a libras");
	num=teclado.nextDouble();
	 Libra=num*Kilogramo; 
	 System.out.println(num + "Kilogramos "+ "son" + Libra + "libras");
	}
}

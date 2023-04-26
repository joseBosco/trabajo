package paraexam;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado =new Scanner(System.in);

int Num = 0;
System.out.println("ingrese un numero");
Num=teclado.nextInt();
if (Num%2==0) {
System.out.println("el numero "+ Num +" es par");
	}
else {
	System.out.println("el numero "+Num+" es impar");
}
}
}
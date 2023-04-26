package paraexam;

import java.util.Scanner;

public class LectorNnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado =new Scanner(System.in);
		
		int n,resultado,resultado1,n1,n2,n3;
		
		System.out.println("ingrese primer numero");
		n1=teclado.nextInt();
		System.out.println("ingrese segundo numero");
		n2=teclado.nextInt();
		System.out.println("ingrese tercer numero");
		n3=teclado.nextInt();
		
	
		resultado=n1+n2+n3;
		System.out.println("la suma es : "+resultado);
	resultado1=resultado/3;
	
	System.out.println("el promedio es "+resultado1);	
	}

}

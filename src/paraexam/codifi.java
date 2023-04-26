package paraexam;

import java.util.Scanner;

public class codifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int a=90,b=80,c=70,d=65,e=60,n;
		
		System.out.println("ingrese la nota del alumno");
		n=teclado.nextInt();
		
		 if (n==a) {
			 
			 
			 System.out.println("la nota es : A " );
			 
		 }
		
		 
		 else if (n==b) {
			 
			 System.out.println("la nota es : B " );
		 }
		 
		 
		 if (n==c) {
			 System.out.println("la nota es : C " );
			 
		 }
		 else if (n==d) {
			 System.out.println("la nota es : D " );
			 
		 }
		 else if  (n==e) {
			 
			 System.out.println("la nota es : E " );
	}
		 
		 
	}
	

}

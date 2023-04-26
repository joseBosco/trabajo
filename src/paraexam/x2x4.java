package paraexam;

import java.util.Scanner;

public class x2x4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*un programa que lea un número que verifique si X es negativo que calcule X^4
		en caso contrario que calcule X^2.*/
		
		Scanner teclado=new Scanner(System.in);
		int x,resultado;
		
		System.out.println("ingresa un numero");
		x =teclado.nextInt();


		if (x>0){
			
			resultado=x*(4);
		
		    System.out.println("el resultado es : "+ resultado);
		}
		else if (x<1)
		{
			resultado=x*(2);
			
		
		    System.out.println("el resultado es : "+ resultado);

		}
		
	}

}

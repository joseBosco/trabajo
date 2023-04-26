package paraexam;

import java.util.Scanner;

public class arearectang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Determinar el área de un rectángulo que tiene por base “B” y por altura “H”, imprima la
		base, la altura y su área*/
		
		Scanner teclado =new Scanner(System.in);
		

		int base, altura,area;
		
		System.out.println(" ingresa la atura de el rectangulo");
		base=teclado.nextInt();
		
		System.out.println(" ingresa la base de el rectangulo");
		altura=teclado.nextInt();
		
		area= altura*base;
		
		System.out.println("El area del rectangulo es :" + area );

		
		
		
		
	}

}

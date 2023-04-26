package paraexam;

import java.util.Scanner;

public class areatrian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner teclado =new Scanner(System.in);
		

		double lado1,lado2 ,lado3,area,altura,base;
		
		System.out.println(" ingresa lado del triangulo");
		lado1=teclado.nextDouble();
		
		System.out.println(" lado del triangulo");
		lado2=teclado.nextDouble();
		
		System.out.println(" lado del triangulo");
		lado3=teclado.nextDouble();
		
		if(lado1==lado2&&lado1==lado3) {
			area=lado1*lado2/lado3;
		
		System.out.println(" el lado 1 es " +lado1 +" el lado 2 es  "+lado2+ " el lado 3 es "+lado3);
		

		System.out.println("el area del triangulo es "+ area);
		}
		
		else if (lado1!=lado2&&lado2!=lado3) {
		
		altura=(lado2)*(2)-(lado3/2)*(2);
		altura= Math.sqrt(altura);
		
          base= (lado3)*(2)-(lado1)*(2);
          area=base*altura/2;
          
          System.out.println("el area del triangulo es "+ area);
		}
	}

}

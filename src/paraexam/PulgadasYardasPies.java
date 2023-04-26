package paraexam;

import java.util.Scanner;

public class PulgadasYardasPies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		//Convertir Y yardas, F pies y I pulgadas a Centímetros. 
		
		double yardas,cm,pul,f,resultado;
		System.out.println(" ingresa las yardas que quieres convertir");
		yardas=teclado.nextDouble();
		System.out.println("ingresa las pulgadas que quieres convertir");
	pul=teclado.nextDouble();
	System.out.println(" ingresa cuantos pies quieres convertir");
	f=teclado.nextDouble();
	
	resultado=yardas*91.44;
	System.out.println(" 1) de yardas a cm " + resultado+"cm");
	
	resultado=pul*0.39;
	System.out.println(" 2) de pulgadas a cm " + resultado+ "cm");
	
	resultado=f*30.48;
	System.out.println(" 3) de pies a cm " + resultado+"cm ");
	

	}

}

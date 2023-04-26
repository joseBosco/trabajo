package paraexam;

import java.util.Scanner;

public class metodocramer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner (System.in);
		/*. Determinar las soluciones de N sistema de ecuaciones lineales con dos incógnitas
aplicando el método de Cramer.*/
		
		int ax,by,c,dx,ey,f,resultado1,resultado2,resultado3;
		System.out.println(" ingresa el primer valor ");
		ax=teclado.nextInt();
		
		System.out.println(" ingresa el segundo valor ");
		by=teclado.nextInt();
		
		System.out.println(" ingresa el tercer valor ");
		c=teclado.nextInt();
		
		System.out.println(" ingresa el cuarto valor  ");
		dx=teclado.nextInt();
		
	
		System.out.println(" ingresa el quinto valor  ");
		ey=teclado.nextInt();
		
		System.out.println(" ingresa el sexto valor  ");
		f=teclado.nextInt();
		
		System.out.println(+ax+"x" +by+"y"+ " ="+c);
		
		System.out.println(+dx+"x"+ey+"y"+ " ="+f);
		
		
		
		
		
		resultado1=(c*f)-(by*ey);
		resultado2=(ax*dx)-(by*ey);
		resultado3=resultado1/resultado2;
				
		System.out.println(" la respuesta es :"+resultado3);
		
		
		
		
	}

}

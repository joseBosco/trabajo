package paraexam;

import java.util.Scanner;

public class cinetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (/*Determinar la energía total que almacena un cuerpo si su energía cinética es ½ de la masa 
		por su velocidad al cuadrado y la energía potencial es el producto de la masa, altura y la 
		//constante de gravedad. Recuerde que ET = EC +EP*/
		Scanner teclado = new Scanner(System.in)) {
			double masa,Aceleracion,ConstanteDeGravedad=9.81;
			System.out.println("Ingrese la Masa de el cuerpo (en kilogramos)");
			masa=teclado.nextDouble();
			System.out.println("Ingrese la aceleracion de el cuerpo (metros sobre segundos)");
			Aceleracion=teclado.nextDouble();
			
			
			float EC=(float) ((1.0 / 2.0)*masa*(Aceleracion*Aceleracion));
			
			float Altura=0,energiaPotencial  ;
			energiaPotencial=(float) (masa*ConstanteDeGravedad*Altura);
			
			
			if ( EC < 0 ){ 
			    System.out.println ( "La energía cinética no puede ser negativa. Verifique sus valores de entrada." ) ;
			}
			else {
				 System.out.println( "La energía cinética es" +EC+ "J." ) ;
				 System.out.println( "La energía potencial es" +energiaPotencial+ "J." ) ;
			
}
		}

		
	}

}

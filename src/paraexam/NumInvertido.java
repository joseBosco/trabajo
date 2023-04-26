package paraexam;

import java.util.Scanner;


public class NumInvertido {
	
	static int invertido(int numero,int inv) {
		if (numero>0) {
			return (numero%10)*100 + ((numero/10)%10)*10 + (numero/100);

	}
   
		else {
			return inv;
 
} 

} 

	public static void
	main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		 int numero, inv=0;
		 System.out.println("ingrese un numero de 3 cifras");
		 numero=teclado.nextInt();
		 System.out.println("el numero invertido de esta cantidad es: "+ invertido(numero,inv) );
} 

} 
 

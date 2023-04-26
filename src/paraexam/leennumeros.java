package paraexam;

import java.util.Scanner;

public class leennumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n;
		
		System.out.println("ingrese la cantidad de numeros");
		n=teclado.nextInt();
		
for (int i=1;i<=n;i++) {
	
	System.out.println("los numeros son "+i);
	
}
	}

}

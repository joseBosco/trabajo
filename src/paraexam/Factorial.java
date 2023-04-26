package paraexam;

import java.util.Scanner;

public class Factorial {
		
		    public static void main(String[] args) {
		        Scanner tc = new Scanner(System.in);
		        System.out.print("Ingrese un número entero positivo: ");
		        int num = tc.nextInt();
		        
		        int factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }
		        
		        System.out.println("El factorial de " + num + " es " + factorial);
		    }
		

}
	



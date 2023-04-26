package paraexam;
import java.util.Scanner;

public class adivina2 {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);

	        System.out.print("Ingrese un numero en positivo: ");
	        int num = tc.nextInt();

	        System.out.print("Los divisores de " + num + " son: ");

	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.print(i + " ");
	            }
	        }

	    }  
	
}


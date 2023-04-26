package paraexam;

import java.util.Scanner;

public class productonnumeros {

		
		    public static void main(String[] args) {
		        Scanner tc = new Scanner(System.in);
		        System.out.print("Ingrese la cantidad de números a multiplicar: ");
		        int n = tc.nextInt();

		        int producto = 1;
		        for (int i = 0; i < n; i++) {
		            System.out.print("Ingrese el número " + (i + 1) + ": ");
		            int num = tc.nextInt();
		            producto *= num;
		        }

		        System.out.println("El producto de los " + n + " números es " + producto);
		    }
		}

	



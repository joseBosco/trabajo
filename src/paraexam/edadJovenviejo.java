package paraexam;

import java.util.Scanner;

public class edadJovenviejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		        Scanner tc = new Scanner(System.in);

		        System.out.print("Ingrese la edad: ");
		        int edad =tc.nextInt();

		        if (edad < 13) {
		            System.out.println("niño");
		        }
		        else if (edad <= 25) {
		            System.out.println("joven");
		        } 
		        else {
		            System.out.println("adulto");
		        }
		    }
		

	}



package paraexam;

import java.util.Scanner;

public class EDAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int edad;
System.out.println("Dime tu edad: ");
edad =teclado.nextInt();


if (edad >= 16){
    System.out.println("Mayor de edad, puede votar");
}
else{
    System.out.println("Menor de edad, no puede votar xd");
}


	}

}

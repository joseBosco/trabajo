package paraexam;
import java.util.Scanner;
public class Voltaje {
	
	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de los  voltajes: ");
	        int n = tc.nextInt();

	        double[] voltajes = new double[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el voltaje " + (i + 1) + ": ");
	            voltajes[i] = tc.nextDouble();
	        }

	        double voltajeMinimo = voltajes[0];
	        double voltajeMaximo = voltajes[0];
	        double sumaVoltajes = voltajes[0];

	        for (int i = 1; i < n; i++) {
	            if (voltajes[i] < voltajeMinimo) {
	                voltajeMinimo = voltajes[i];
	            }

	            if (voltajes[i] > voltajeMaximo) {
	                voltajeMaximo = voltajes[i];
	            }

	            sumaVoltajes += voltajes[i];
	        }

	        double promedio = sumaVoltajes / n;

	        System.out.println("Voltaje mínimo: " + voltajeMinimo);
	        System.out.println("Voltaje máximo: " + voltajeMaximo);
	        System.out.println("Promedio de voltajes: " + promedio);
	    }
	
	 }



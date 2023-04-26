package paraexam;
import java.util.Arrays;
import java.util.Scanner;
public class arreglolineal {
	
	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);

	        System.out.print("Ingrese el tamaño del arreglo: ");
	        int n = tc.nextInt();

	        int[] arreglo = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
	            arreglo[i] = tc.nextInt();
	        }

	        // Suma de los elementos
	        int suma = 0;

	        for (int i = 0; i < n; i++) {
	            suma += arreglo[i];
	        }

	        System.out.println("La suma de los elementos es: " + suma);

	        // Suma de los elementos al cuadrado
	        int sumaCuadrados = 0;

	        for (int i = 0; i < n; i++) {
	            sumaCuadrados += arreglo[i] * arreglo[i];
	        }

	        System.out.println("La suma de los elementos al cuadrado es: " + sumaCuadrados);

	        // Menor elemento y posición
	        int menor = arreglo[0];
	        int posicionMenor = 0;

	        for (int i = 1; i < n; i++) {
	            if (arreglo[i] < menor) {
	                menor = arreglo[i];
	                posicionMenor = i;
	            }
	        }

	        System.out.println("El menor elemento es: " + menor + " y está en la posición " + posicionMenor);

	        // Mayor elemento y posición
	        int mayor = arreglo[0];
	        int posicionMayor = 0;

	        for (int i = 1; i < n; i++) {
	            if (arreglo[i] > mayor) {
	                mayor = arreglo[i];
	                posicionMayor = i;
	            }
	        }

	        System.out.println("El mayor elemento es: " + mayor + " y está en la posición " + posicionMayor);

	        // Promedio de los elementos
	        double promedio = (double) suma / n;

	        System.out.println("El promedio de los elementos es: " + promedio);

	        // Ordenar de forma ascendente
	        Arrays.sort(arreglo);

	        System.out.println("El arreglo ordenado de forma ascendente es: " + Arrays.toString(arreglo));

	        // Módulo del arreglo
	        int modulo = 0;

	        for (int i = 0; i < n; i++) {
	            modulo += Math.abs(arreglo[i]);
	        }

	        System.out.println("El módulo del arreglo es: " + modulo);
	    }
	}



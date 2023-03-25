package Taller6Punto8;
	import java.util.Scanner;
public class puntoSiete {


		   public static void main(String[] args) {
		      
		      int[] resultados = new int[5];
		      Scanner input = new Scanner(System.in);
		      
		      for (int i = 0; i < 5; i++) {
		         System.out.print("Ingresa el resultado de la prueba " + (i+1) + ": ");
		         resultados[i] = input.nextInt();
		      }
		      
		      int suma = 0;
		      for (int i = 0; i < 5; i++) {
		         suma += resultados[i];
		      }
		      double promedio = (double) suma / 5;
		      		      System.out.println("El promedio de los resultados es: " + promedio);
		   }
	}
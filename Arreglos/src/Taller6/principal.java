package Taller6;

import java.util.Scanner;

public class principal {
	
	static Scanner sc = new Scanner(System.in);
    static int[][] arregloA, arregloB, arregloResultado;
    static int filaA, columnaA, filaB, columnaB;


	public static void main(String[] args) {
 
		puntoTres p3 = new puntoTres();
		p3.arregloP3();
		
		System.out.println("\n");
		
		puntoDos p2 = new puntoDos();
		p2.arregloP2();
		
		System.out.println("\n");
		
		puntoUno p1 = new puntoUno();
		p1.arregloP1();
		
		System.out.println("\n");
		
		puntoCuatro p4 = new puntoCuatro();
		p4.arregloP4();
	}
	}


	 

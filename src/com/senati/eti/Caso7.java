package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);


		    // Definir la matriz de numeros 3 x 4
		    int[][]mNumeros = new int[3][4];

		    int num_mayor = 0;

		    System.out.println("LECTURA DE NÚMEROS");
		    System.out.println("===================");

		    for(int f = 0; f < mNumeros.length; f++) {
			        System.out.println("\nFila: " + (f + 1));
			        System.out.println("========");

			        for(int c=0; c < mNumeros[0].length; c++) {
			        System.out.print("Número " + (c + 1) + ": ");
			        mNumeros[f][c] = sc.nextInt();



			        if(f == 0 && c == 0) {
				            num_mayor = mNumeros[0][0];
			        }else {
				            if (mNumeros[f][c] > num_mayor) num_mayor = mNumeros[f][c];
			        }
		    }
			        }
		    System.out.println("\nResultados");
		    System.out.println("--------------");
		    System.out.println("Número mayor........: " + num_mayor);

	 }

}
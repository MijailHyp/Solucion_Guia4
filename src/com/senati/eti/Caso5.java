package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arrcodigo ={"A-123", "A-456", "A-789", "A-159"};
		String[] arrnombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides", "Sara Montes"};
		int[] arrnota = {13, 8, 18, 10};

		String codigo =  "";

		System.out.println("\n------------------------------------");
		System.out.println(" COLEGIO SENATI - MODULO DE BUSQUEDAS");
		System.out.println("--------------------------------------");

		System.out.print("Codigo a buscar: ");
		codigo = sc.nextLine();

		int posicion = -1;

		for(int i = 0; i < arrcodigo.length; i++){
			if (arrcodigo[i].equals(codigo)) {
				posicion = i;
				break;
			}
		}

		if(posicion == -1) {
			System.out.println("\nCodigo no Encontrado....");
		}else {
			System.out.println("\nDatos del Participante");
			System.out.println("----------------------");
			System.out.println("Codigo......: " + arrcodigo[posicion]);
			System.out.println("Nombre......: " + arrnombre[posicion]);
			System.out.println("Nota........: " + arrnota[posicion]);

			if( arrnota[posicion] > 10) {
				System.out.println("Estado......: Aprobado");

				}else {
					System.out.println("Estado......: Desaprobado");
			}
		}
	}

}
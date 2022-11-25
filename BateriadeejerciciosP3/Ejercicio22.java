package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Un año divisible por 4 es bisiesto y no debe ser divisible entre 100.
	//	• Si un año es divisible entre 100 y además es divisible entre 400,
		//también resulta bisiesto
		
		int anio;
		int  seguir;
		
		Scanner entrada = new Scanner(System.in);
	do {
		
		System.out.println("***EVALUACION DE SI UN AÑO ES BISIESTO O NO");
		do {
		System.out.print("Ingrese el anio a evaluar: ");
		anio = entrada.nextInt();
		if(anio<0) {System.out.println("Error, no se aceptan datos negativos");}
		}while(anio<0);
		
		if( anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			System.out.println("El anio: " + anio + " es bisiesto");
		}else {
			System.out.println("El anio: " + anio + " no es un anio bisiesto.");
		}
		
		
		    do {
			System.out.print("Desea seguir en el programa? 1.Si 2.No ");
			seguir = entrada.nextInt();
			if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion  valida");}
			}while(seguir<=0 || seguir>2);
	}while(seguir==1);
		    System.out.println("Fin del programa, te amo fer <3 ");
		
entrada.close();
	}

}

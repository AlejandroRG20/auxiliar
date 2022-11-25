package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		//Diseñar un programa que, dados 10 números naturales, indique
		//cuántos de ellos son números pares, nos muestre estos y calcule la
	    //media aritmética de los impares.
		
		Scanner n = new Scanner(System.in);
		int seguir;
		do {
		int numero=0;
		int cont=0,cont2=0;
		int auxiliar=0,mediaArit=0;
		System.out.println("Escriba el numero 0 para terminar");
		do {
			System.out.print("Ingrese el numero: ");
			numero = n.nextInt();
			if(numero % 2 == 0) {
				cont = cont + 1;
			}else {
				auxiliar = auxiliar + numero;
				cont2 = cont2 + 1;
				mediaArit = (auxiliar/cont2);	
			}
		}while(numero != 0);


		System.out.println("Los Numeros pares son "+(cont-1) + "\n" );
		System.out.println("Los Numeros impares son: "+cont2 + "\n");
		System.out.println("La Suma de los numeros impares es: " + auxiliar);
		System.out.println("La Media Aritmetica es: " + mediaArit);
		
		do {
	        System.out.println("Desea seguir en el programa?  1.Si 2.No");
	        seguir=n.nextInt();
	        if(seguir<=0 || seguir>2) {
	        	System.out.println("Error, seleccione una opcion valida");}
	     }while(seguir<=0 || seguir>2);
	     
		}while(seguir==1);
		
		System.out.println("Fin del programa, te amo fer");
		
		n.close();

	}

}
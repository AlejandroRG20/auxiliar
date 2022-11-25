package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// Realizar un programa que cree un arreglo de 10 enteros cuyos
		//valores son introducidos por el usuario. También debe pedir un valor
	    //que se deberá buscar en el arreglo. El programa debe decir en cuál
	    //posición se encuentra el valor que queríamos buscar.

		
		Scanner n = new Scanner(System.in);
		int seguir;
		do {
		int arreglo [] = new int [10];
		int num;
 		
		System.out.println("Digite los elementos");
		for (int i = 2; i < arreglo.length; i++) {
			System.out.print("elemento ["+(i+1)+"] ");
			arreglo[i] = n.nextInt();
		}
		System.out.println("Los elementos son: ");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		System.out.println("_________________________________");
		do {
		System.out.print("Digite el numero que desea buscar: ");
		num = n.nextInt();
		if(num<=0) {System.out.println("Error, no se aceptan numeros negativos");}
		}while(num<=0);
		int i=0;
		while(i<10 && arreglo[i] < num) {
			i++;
		}
		
		if(i==10) {
			System.out.println("El numero: " + num + " no fue encontrado.");
		}else {
			if(arreglo[i] == num) {
				System.out.println("El numero fue encontrado en la Posicion: " + i);
			}else {
				System.out.println("\n el numero no fue encontrado");
			}
		}
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
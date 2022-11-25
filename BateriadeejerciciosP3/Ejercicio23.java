package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// El siguiente es el menú de un restaurante de bocadillos. Diseñar un
	//	programa capaz de leer el número de unidades consumidas de cada
		//alimento ordenado y calcular la cuenta total. Vamos a suponer que
	//	estos precios son fijos
		
		Scanner n = new Scanner(System.in);
		int seguir;
		byte  se;
		double total = 0;
		String cargo = "";
	do {	
		System.out.println("-****** Panaderia San Jorge ******- \n");
		
		
     do {
			
			System.out.println("1- Pan con relleno de jamon ----- $ 10");
			System.out.println("2- Cachito de canela ------------ $ 15");
			System.out.println("3- Mini pizza ----------------- $ 20.5");
			System.out.println("4- -------------------- TERMINAR CARGO");
			System.out.println("");
			System.out.println("Seleccionar Opcion: "); se = n.nextByte();
			
			while(se <= 0 || se>4) {
				System.out.println("Error, sleccione una opcion valida");
				se = n.nextByte();
			}
			
			switch(se) {
			
			
			
			case 1: 
				System.out.println("Ha elegido Pan con relleno de jamon \nDesea elegir algo mas? \n");
				
					total += 10;
					
					cargo += "Pan con relleno de jamon $ 10 \n";
				
				break;
			case 2: 
				System.out.println("Ha elegido Cachiito  de canela \nDesea elegir algo mas? \n");
			
					total += 15;
					
					cargo += "Cachito de canela $ 15 \n";
				
				break;
			case 3: 

				System.out.println("Ha elegido Mini pizza \nDesea elegir algo mas? \n");
				
					total += 20.5;
					cargo += "Mini"
							+ "Pizza $ 20.5 \n";
				
				break;
			case 4: 

				System.out.println("***** FACTURA *****");
				
				System.out.println(cargo);
				
				System.out.println("TOTAL: " + total);
				break;
				}

	    }while(se!=4);
     
     do {
        System.out.println("Desea seguir en el programa?  1.Si 2.No");
        seguir=n.nextInt();
        if(seguir<=0 || seguir>2) {
        	System.out.println("Error, seleccione una opcion valida");}
     }while(seguir<=0 || seguir>2);
     
	}while(seguir==1);
     
     System.out.println("Fin del programa te amo fer <3");
		
		n.close();
	}

}
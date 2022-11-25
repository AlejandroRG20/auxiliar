package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// Determinar el precio de un billete de ida y vuelta por avión,
		//conociendo la distancia a recorrer, el número de días de estancia y
		//sabiendo que, si la distancia es superior a 1000 Km, y el número de
		//días de estancia es superior a 7, la línea aérea le hace un descuento
		//del 30% (precio por kilómetro US$8.50).

		
		Scanner n = new Scanner(System.in);
		int seguir;
		do {
		int est;
		double preciodeVuelo,distancia,des,PagoFinal;
		do {
		System.out.println("Ingrese la distancia que quiere recorrer: ");
		distancia = n.nextDouble();
		if(distancia<=0) {System.out.println("Error, no se aceptan numeros negativos");}
		}while(distancia<=0);
		do {
		System.out.println("Ingrese los dias de estadia");
		est = n.nextInt();
		if(est<=0) {System.out.println("Error, no se aceptan datos negativos");}
		}while(est<=0);
		preciodeVuelo = distancia*8.50;
		des = (preciodeVuelo*30)/100;
		
		if(distancia > 1000 && est > 7) {
			PagoFinal = preciodeVuelo - des;
			System.out.println("El pago total es: " + PagoFinal + " dolares");
		}else {
			System.out.println("el pago total es: " + preciodeVuelo + " dolares");
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

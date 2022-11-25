package bateriadeejerciciosP2;

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String [] args) {
		Scanner n=new Scanner(System.in);
		int num,contador,suma, seguir;
do {		
	do {	
		System.out.println("Ingrese el numero: ");
		num=n.nextInt();
		if(num<0) {System.out.println("Error, no se aceptan numeros negativos");
		}
	}while(num<0);
		
		contador = 0;
		suma=0;
		int limite = num;
		while(contador < limite){
			if(num % 2==0) {
				suma = num + suma;
				contador= contador + 1;
				
			}
			num= num+1;
		}
		System.out.println("La suma es " + suma);
		
	do {	
		System.out.println("Desea seguir en el programa?1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion valida");
		}
	}while(seguir<=0 || seguir>2);
}while(seguir==1);

		System.out.println("Fin del programa.");
		n.close();
	}
	
	
}

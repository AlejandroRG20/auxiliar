package BateriadeejerciciosP3;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Un programa que calcule el producto de N números ingresados por
	//	el usuario
		
		Scanner n = new Scanner(System.in);
		int seguir;
		do {
		int x=1,r=1,p=0;
		
		while(x != 0) {
			System.out.println("***CALCULO DEL PRODUCTO DE N NUMEROS***");
			System.out.print("Ingrese un numero: (0 para terminar)");
			x = n.nextInt();
			
			if(x != 0) {
				r = r*x;
				p = r;
			}
			
		}
		System.out.println("El producto de los numeros es: " + p);
		
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
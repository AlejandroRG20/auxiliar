package Bateriadeejercicios;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaracion de variables
		int A, B, seguir;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("------Intercambio de valor de variables------");
do {		
	do {	
		System.out.println("Digite el valor de A: ");
		A=n.nextInt();
		if(A<0 || A>1000) {System.out.println("Error, no se aceptan datos negativos o mayores a mil");}
	}while(A<0 || A>1000);	
	
	do {	
		System.out.println("Digite el valor de B: ");
		B=n.nextInt();
		if(B<0 || B>1000) {System.out.println("Error, no se aceptan datos negativos o mayores a mil");}
	}while(B<0 || B>1000);	
		
		A= A+B;
		B= A-B;
		A= A-B;
	
	
	System.out.println("-------------------------");
	System.out.println("El valor de A es: "+ A);
	System.out.println("El valor de B es: "+ B);
	System.out.println("-------------------------");
	
    do {	
	    System.out.println("Desea seguir intercambiando variables? 1.Si 2.No");
	    seguir=n.nextInt();
        if(seguir<0 || seguir>2) {System.out.println("Error, digite una opcion valida");}
    }while(seguir<0 || seguir>2);
}while(seguir==1);

         System.out.println("Fin del programa");
         
         n.close();
	
	
	
	}

}

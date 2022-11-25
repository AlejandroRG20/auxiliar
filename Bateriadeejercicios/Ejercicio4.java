package Bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaracion de variables
		int a,b,c, seguir;
		Scanner n=new Scanner(System.in);
		System.out.println("--------COMPARACION DE NUMEROS--------");
do {			
		System.out.println("Digite numero A: ");
		a=n.nextInt();	
		
	do {
		System.out.println("Digite el numero B:");
		b=n.nextInt();
		if(b<0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(b<0);	
	
	do {	
		System.out.println("Digite numero C: ");
		c=n.nextInt();
		if(c<0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(c<0);
		
		if(a<0) {System.out.println("El producto de A = "+a+", B = " +b+" y C = "+c+" es: "+a*b*c);
			} else if(a>0) {System.out.println("La Suma de A = "+a+", B = "+b+" y C = "+c+" es: "+ a+b+c);
			}
		
	do {	
		System.out.println("Desea seguir en el programa? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<0 || seguir>2) {System.out.println("Error, Digite una opcion valida");}
	}while(seguir<0 || seguir>2);
	
}while(seguir==1);	

System.out.println("------------Fin del programa------------");

n.close();

	}

}

package Bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaracion de variables
		int a,b,c, seguir;
		Scanner n=new Scanner(System.in);
		System.out.println("--------COMPARACION DE 3 NUMEROS--------");
do {		
	do {	
		System.out.println("Digite numero A: ");
		a=n.nextInt();
		if(a<0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(a<0);	
		
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
		
		if(b<a && a>c) {System.out.println("El valor de A = "+a+" es mayor que el valor de B = "+b+" y el valor de C = "+c);
			} else if(a<b && b>c) {System.out.println("El valor B = "+b+" es mayor que el valor de A = "+a+" y el valor de C = "+c);
			} else if(a<c && c>b) {System.out.println("EL valor de C = "+c+" es mayor al valor de A = "+a+" y el valor de B = "+b);
			} else if ((a==b && a==c)&& b==c) {System.out.println("El valor de A = "+a+" es parelo al valor de B = "+b+" y el valor de C = "+c);}	
		
		
	do {	
		System.out.println("Desea seguir comparando? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<0 || seguir>2) {System.out.println("Error, Digite una opcion valida");}
	}while(seguir<0 || seguir>2);
	
}while(seguir==1);	

System.out.println("------------Fin del programa------------");

n.close();

	}

}

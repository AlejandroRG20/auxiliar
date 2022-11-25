package Bateriadeejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1, seguir;
	    
		Scanner n=new Scanner(System.in);
		
		
		System.out.println("********PRROGRAMA PARA ANALIZAR SI UN NUMERO ES PAR O IMPAR********");
do {		
	do {	
		System.out.println("Digite un numero entero para analizar: ");
		n1=n.nextInt();
		
		if(n1<=0) {
			System.out.println("Error, no se aceptan numeros negativos ni cero");}
	}while(n1<=0);
		
		if(n1==0) {
			System.out.println("El numero "+n1+" no es par ni impar");
		}else if(n1 % 2== 0) {
			System.out.println("El numero "+n1+" es par");
		}else {System.out.println("El numero "+n1+" es impar");
		}
			
	do {	
		System.out.println("Desea seguir en el programa? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<0 || seguir>2) {
			System.out.println("Error, digite una opcion valida");
		}
	}while(seguir<0 || seguir>2);
	
}while(seguir==1);	
	
	
	
	System.out.println("Fin del programa");
	
	n.close();


	}

}

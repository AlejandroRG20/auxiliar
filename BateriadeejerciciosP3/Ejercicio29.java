package BateriadeejerciciosP3;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		
		//Dados 3 números, determinar si la suma de dos de ellos es igual al
	    //tercero. Si se cumple, escribir “iguales”, si no, escribir “distintos”
		
		Scanner n = new Scanner(System.in);
		
	int num1,num2,num3, seguir;
do {	
	do {
		System.out.println("********* BIENVENIDO **********");
	System.out.print("Introduzca el primer numero: ");
	num1 = n.nextInt();
	if(num1<=0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(num1<=0);
	do {
	System.out.print("Introduzca el primer numero: ");
	num2 = n.nextInt();
	if(num2<=0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(num2<=0);
	do {
	System.out.print("Introduzca el primer numero: ");
	num3 = n.nextInt();
	if(num3<=0) {System.out.println("Error, no se aceptan numeros negativos");}
	}while(num3<=0);
	
	if(num1 + num2 == num3) {
		System.out.println("Los numeros num1 ("+num1+") num2 ("+num2+") son iguales a num3: " + num3);
	}else {
		System.out.println("Los numeros num1 ("+num1+") num1 ("+num2+") son diferentes a num3: " + num3);
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

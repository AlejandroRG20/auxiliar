package Bateriadeejercicios;
import java.util.*;
public class Ejercicio2 {
	public static void main(String[] args) {
		int a,b, seguir;
		Scanner n=new Scanner(System.in);
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
		
		if(a<b) {System.out.println("El valor B = "+b+" es mayor que el valor de A = "+a);
			} else if(a>b) {System.out.println("El valor A = "+a+" es mayor que el valor de B = "+b);
			} else if(a==b) {System.out.println("EL valor de A = "+a+" es paralelo al valor de B = "+b);
			}	
		
		
	do {	
		System.out.println("Desea seguir comparando? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<0 || seguir>2) {System.out.println("Error, Digite una opcion valida");}
	}while(seguir<0 || seguir>2);
	
}while(seguir==1);	

System.out.println("Fin del programa");

n.close();
		
	}

}

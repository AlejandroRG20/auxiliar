package Bateriadeejercicios;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int niños, niñas,seguir;
		double Pniños, Pniñas;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("BIENVENIDO AL CURSO");
do {		
	do {	
		System.out.println("Digite la cantidad de niños(Maximo 50): ");
		niños=n.nextInt();
		if(niños<0 || niños>50) {System.out.println("Error, digite un valor correcto");}
	}while(niños<0 || niños>50);
	
	do {	
		System.out.println("Digite la cantidad de niñas(Maximo 50): ");
		niñas=n.nextInt();
		if(niñas<0  || niñas>50) {System.out.println("Error, digite un valor correcto");}
	}while(niñas<0 || niñas>50);
	
	
	Pniños=(niños*50)/100;
	Pniñas=(niñas*50)/100;

	System.out.println("El porcetaje de niños es de: "+Pniños);
	System.out.println("El porcetaje de niñas es de: "+Pniñas);
	
    do {	
	    System.out.println("Desea seguir calculando el porcentaje de alumnos? 1.Si 2.No");
	    seguir=n.nextInt();
	    if(seguir<0 || seguir>2) {System.out.println("Error, seleccione una opcion validad");}
    }while(seguir<0 || seguir>2);	
}while(seguir==1);


System.out.println("Fin del programa");
n.close();
	
	}

}

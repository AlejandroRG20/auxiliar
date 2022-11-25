package Bateriadeejercicios;

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota, entrada, seguir;
		Scanner n=new Scanner(System.in);
	do {	
		System.out.println("******Bienvenido al departamento de admision\n      del Curso de Nivel Superior******\n");
		
		
		
		
		System.out.println("El principal requisito para acceder al curso\n    es portar un titulo de bachiller\n");
		
	do {	
		System.out.println("Cuentas con un titulo de bachiller? 1.Si 2.No");
		entrada=n.nextInt();
		if(entrada<=0 || entrada>2) {System.out.println("Error, digite una opcion validad");}
	}while(entrada<=0 || entrada>2);
	
	
	switch(entrada) {
	
	case 1:
		
		System.out.println("******FELICITACIONES, A ACCEDIDO AL CURSO DE NIVEL SUPERIOR****** :)");
	
	break;
	
	case 2:
		
		System.out.println("que mal ;(...");
		
		
		System.out.println("Para tu suerte, si no portas un titulo de bachiller, otra forma de acceder\nal curso es pasando el examen de admision, con nota minima de 60pts");
	
		
	do {	
	    System.out.println("De cuanto fue tu nota en el examen de admision?(Maximo 100)");
	    nota=n.nextInt();
	    if(nota<0 || nota>100) {System.out.println("Valor invalido, su nota no puede ser un dato negativo, cero o mayor a 100");
	    }else if(nota>=0 && nota<60) {System.out.println("Lo sentimos, no logro clasificar");
	    }else if(nota>=60 && nota<=100) {System.out.println("******FELICIDADES, A ACCEDIDO AL CURSO POR CLASIFICAR CON UNA NOTA DE "+nota+" EN EL EXAMEN DE ADMISION******");
	    }else {System.out.println( "nose");}
	}while(nota<0 || nota>100);
	
	break;
	

	
	}
	
	    
	do {	
		System.out.println("Desea seguir en el programa? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<=0 || seguir>2) {
			System.out.println("Error, digite una opcion valida");
		}
	}while(seguir<=0 || seguir>2);
	
}while(seguir==1);	
	
		System.out.println("Fin del  programa");
		
		n.close();
		
	}

}


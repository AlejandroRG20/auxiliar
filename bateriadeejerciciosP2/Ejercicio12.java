package bateriadeejerciciosP2;

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, entrada, seguir;
		double r1;
		
		Scanner n=new Scanner(System.in);
do {		
		
		System.out.println("******SUMA DE NUMEROS NATURALES******");
		
	do {	
		System.out.println("Cuantos numeros desea digitar? (Minimo 2, Maximo 10)");
		entrada=n.nextInt();
		if(entrada<2 || entrada>10) {System.out.println("Error, seleccione una opcion valida");}
	}while(entrada<2 || entrada>10);
	
	
	switch(entrada) {
	
	case 1:
		
		//no se puede
		break;
		
	case 2:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		
		r1=n1+n2;
		
		   
		    System.out.println("La Suma de los Numero Naturales "+n1+" + "+n2+" es: " +r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 3:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		
		r1=n1+n2+n3;
		
		   
		    System.out.println("La Suma de los Numeros Naturales "+n1+" + "+n2+" + "+n3+" es: " +r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 4:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		
		r1=n1+n2+n3+n4;
		
		   
		    System.out.println("La Suma de los Numeros Naturales "+n1+" + "+n2+" + "+n3+" + "+n4+" es: " +r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 5:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		
		r1=n1+n2+n3+n4+n5;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 6:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		do {	
			System.out.println("Digite el numero 6:");
			n6=n.nextInt();
			if(n6<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n6<=0);
		
		
		r1=n1+n2+n3+n4+n5+n6;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
    break;
    
	case 7:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		do {	
			System.out.println("Digite el numero 6:");
			n6=n.nextInt();
			if(n6<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n6<=0);
		
		do {	
			System.out.println("Digite el numero 7:");
			n7=n.nextInt();
			if(n7<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n7<=0);
		
		
		r1=n1+n2+n3+n4+n5+n6+n7;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 8:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		do {	
			System.out.println("Digite el numero 6:");
			n6=n.nextInt();
			if(n6<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n6<=0);
		
		do {	
			System.out.println("Digite el numero 7:");
			n7=n.nextInt();
			if(n7<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n7<=0);
		
		do {	
			System.out.println("Digite el numero 8:");
			n8=n.nextInt();
			if(n8<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n8<=0);
		
		
		r1=n1+n2+n3+n4+n5+n6+n7+n8;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
	break;
	
	case 9:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		do {	
			System.out.println("Digite el numero 6:");
			n6=n.nextInt();
			if(n6<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n6<=0);
		
		do {	
			System.out.println("Digite el numero 7:");
			n7=n.nextInt();
			if(n7<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n7<=0);
		
		do {	
			System.out.println("Digite el numero 8:");
			n8=n.nextInt();
			if(n8<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n8<=0);
		
		do {	
			System.out.println("Digite el numero 9:");
			n9=n.nextInt();
			if(n9<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n9<=0);
		
		
		r1=n1+n2+n3+n4+n5+n6+n7+n8+n9;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
	break;
		
	case 10:
		
		do {	
			System.out.println("Digite el numero 1:");
			n1=n.nextInt();
			if(n1<=0) {System.out.println("Error, los Numeros Naturales no pueden ser negativos ni cero");}
		}while(n1<=0);
				
		do {	
			System.out.println("Digite el numero 2:");
			n2=n.nextInt();
			if(n2<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n2<=0);
		
		do {	
			System.out.println("Digite el numero 3:");
			n3=n.nextInt();
			if(n3<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n3<=0);
		
		do {	
			System.out.println("Digite el numero 4:");
			n4=n.nextInt();
			if(n4<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n4<=0);
		
		do {	
			System.out.println("Digite el numero 5:");
			n5=n.nextInt();
			if(n5<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n5<=0);
		
		do {	
			System.out.println("Digite el numero 6:");
			n6=n.nextInt();
			if(n6<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n6<=0);
		
		do {	
			System.out.println("Digite el numero 7:");
			n7=n.nextInt();
			if(n7<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n7<=0);
		
		do {	
			System.out.println("Digite el numero 8:");
			n8=n.nextInt();
			if(n8<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n8<=0);
		
		do {	
			System.out.println("Digite el numero 9:");
			n9=n.nextInt();
			if(n9<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n9<=0);
		
		do {	
			System.out.println("Digite el numero 10:");
			n10=n.nextInt();
			if(n10<=0) {System.out.println("Error, los numero Naturales no pueden ser negativos ni cero");}
		}while(n10<=0);
		
		
		r1=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
		
		   
		    System.out.println("La Suma de los Numeros Seleccionados es: "+r1);
		    System.out.println("-------------------------------------------------");
	
	break;
		
		    
	}
		
		
    do {	
		System.out.println("Desea seguir en el programa?:1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion valida");}
	}while(seguir<=0 || seguir>2);
    
}while(seguir==1);

    System.out.println("Fin del programa");
    
    n.close();

	}

}


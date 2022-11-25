package bateriadeejerciciosP2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, seguir;
		double r1, r2, r3, r4 , r5 ,r6, r7, r8, r9;
		
		Scanner n=new Scanner(System.in);
do {		
		
		System.out.println("Numeros Naturales (Maximo 10)");
		
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
	
	r1= Math.pow(n1, 2);
	r2= Math.pow(n2, 2);
	r3= Math.pow(n3, 2);
	r4= Math.pow(n4, 2);
	r5= Math.pow(n5, 2);
	r6= Math.pow(n6, 2);
	r7= Math.pow(n7, 2);
	r8= Math.pow(n8, 2);
	r9= Math.pow(n9, 2);
	
	
    System.out.println("-------------------------------------------------");
    System.out.println("         *********SUS CUADRADOS******            ");
    System.out.println("1.El cuadrado del numero "+n1+" es " + String . format ( "%.2f" , r1 ));
    System.out.println("2.El cuadrado del numero "+n2+" es " + String . format ( "%.2f" , r2 ));
    System.out.println("3.El cuadrado del numero "+n3+" es " + String . format ( "%.2f" , r3 ));
    System.out.println("4.El cuadrado del numero "+n4+" es " + String . format ( "%.2f" , r4 ));
    System.out.println("5.El cuadrado del numero "+n5+" es " + String . format ( "%.2f" , r5 ));
    System.out.println("6.El cuadrado del numero "+n6+" es " + String . format ( "%.2f" , r6 ));
    System.out.println("7.El cuadrado del numero "+n7+" es " + String . format ( "%.2f" , r7 ));
    System.out.println("8.El cuadrado del numero "+n8+" es " + String . format ( "%.2f" , r8 ));
    System.out.println("9.El cuadrado del numero "+n9+" es " + String . format ( "%.2f" , r9 ));
    System.out.println("-------------------------------------------------");
    
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

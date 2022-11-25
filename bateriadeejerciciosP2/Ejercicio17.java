package bateriadeejerciciosP2;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		
		int seguir;
	do {
		int x=1, y=0, z=0;
		while(x <=100) {
			
			if(x % 2 == 0) {
				y = y + 1;
				System.out.println("Multiplo de 2: " + x);
			}
			if(x % 3 == 0) {
				z = z + 1;
				System.out.println("Multiplo de 3: " + x);
			}
			
			x = x + 1;
		}
		
		System.out.println("Numeros multiplos de 2: " + y);
		System.out.println("Numeros multiplos de 3: "  + z);
		
		
		do {	
			System.out.println("Desea seguir en el  programa? 1.Si 2.No");
			seguir=n.nextInt();
			if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion valida");}
		}while(seguir<=0 || seguir>2);
		
	}while(seguir==1);
	
	System.out.println("Fin del programa");
	
	n.close();
	}


	}



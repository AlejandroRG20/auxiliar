package BateriadeejerciciosP3;

	import java.util.Scanner;

	public class Ejercicio21 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int altura = 0,i;
			int seguir;
			Scanner entrada = new Scanner(System.in);
		do {
				System.out.println("******PIRAMIDE DE ASTERISCOS******");
			
			do {
			System.out.print("Ingrese la altura (Maximo 20): ");
			altura = entrada.nextInt();
			if(altura<=0 || altura>20) {System.out.println("Error, digite un valor valido");}
			}while(altura<=0 || altura>20);
			
			if(altura > 0 && altura <= 20) {
				
				for(i = 1; i <= altura; i++) {
					for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("");
				}
			}
			
			
			do {
				System.out.print("Desea seguir en el programa? 1.Si 2.No");
				seguir = entrada.nextInt();
				if(seguir<=0 || seguir>2) {System.out.println("Error, digite un valor valido");}
				}while(seguir<=0 || seguir>2);
		}while(seguir==1);
		System.out.println("Fin del programa, te  amo fer <3");
			
	entrada.close();
		}
	}
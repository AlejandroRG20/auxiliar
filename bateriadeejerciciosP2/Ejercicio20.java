package bateriadeejerciciosP2;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// .Programa que lea un número entero (lado) y a partir de él, cree un
				// cuadrado de asteriscos con ese tamaño
				
				int c = 0;
				int seguir = 0;
				
				Scanner entrada = new Scanner(System.in);
				
			do {	
				System.out.println("**********CUADRADO DE ASTERISCOS**********");
				
				do {
				System.out.println("Ingrese el tamaño del cuadro (maximo 60)");
				c = entrada.nextInt();
                if(c<0 || c>60) {System.out.println("Error, digite un dato correcto");}
				}while(c<0 || c>60);
				
				
				 if(c >= 0 && c <= 60) {
					 for (int i = 0; i < c; i++) {
						System.out.print("*");
					}
					 System.out.println("");
					 
					 
					 for(int i = 0; i < c-2; i++) {
						 System.out.print("*");
						 for (int j = 0; j < c-2; j++) {
							System.out.print("*");
						}
						 System.out.println("*");
					 }
					 
					 for (int i = 0; i < c; i++) {
						System.out.print("*");
					}
				 }
				 
				 
				 do {
					 System.out.println("Desea seguir en el programa? 1.Si 2.No");
					 c=entrada.nextInt();
					 if(seguir<0 || seguir>2) {System.out.println("Error, seleccione la opcion correcto");}
				 }while(seguir<0 || seguir>2);
	}while(seguir==1);
			
			
			System.out.println("Fin del programa, te amo fer <3");

			entrada.close();
			
			
			
			
			
				 }


			}



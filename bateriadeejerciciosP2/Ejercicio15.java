package bateriadeejerciciosP2;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// Teniendo en cuenta que la clave es “tuani”, escribir un programa que
		// nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos
		// los 3 intentos nos mostrará un mensaje indicándonos que hemos
		// agotado esos 3 intentos. Si acertamos la clave, saldremos
		// directamente del programa.
			
				int cont=0;
				int seguir;
				String correctPass = "tuani";
				Scanner n=new Scanner(System.in);
				
			do {	
				
				
				System.out.println("*****BIENVENIDO A SU  CUENTA*****");

				System.out.println("Ingrese su Contraseña:");
				System.out.println("__________________________");
				cont++;
				System.out.print("Intento #." + cont);
				String pass = n.nextLine();

				
				if(pass.equals(correctPass)) {
					System.out.println("__________________________");
					
					System.out.println("Contraseña correcta, BIENVENIDO");
					System.out.println("Fin");
					
					System.out.println("__________________________");
					
				}else {

					
					while(!pass.equals(correctPass) && cont <3) {
						
						cont++;
						
						System.out.println("Error, Contraseña incorrecta");
						
						System.out.println("__________________________");
						
						System.out.print("Intento #. " + cont + " ");
						
						pass = n.nextLine();

						if(pass.equals(correctPass)) {
							System.out.println("__________________________");
							System.out.println("Contraseña correcta, BIENVENIDO");
							System.out.println("__________________________");
							break;
						}
					}
				}
					System.out.println("__________________________");
					System.out.println("Cuenta bloqueada");
					System.out.println("__________________________");
					
					System.out.println("Espere 15 segundos y vuelva a intentar....");
					
				do {	
					System.out.println("Desea digitar la contraseña nuevamente?");
					seguir=n.nextInt();
					if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion valida");}
				}while(seguir<=0 || seguir>2);
			}while(seguir==1);
			
			
			System.out.println("Fin del programa");
			
			n.close();
				
			}
		
		
	}

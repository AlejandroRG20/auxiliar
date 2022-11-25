package bateriadeejerciciosP2;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner n = new Scanner(System.in);
		
		int d,m,a, seguir;
do {
	
	System.out.println("******SELECCIONA UNA FECHA******");
		String nombremes="";
	do {	
		System.out.print("Ingrese el dia: ");
		d = n.nextInt();
		if(d < 1 || d > 31) {
			System.out.println("Error, Dia fuera de rango digite  el dia nuevamente");}
			}while(d<0 || d > 31);
	
	do {	
		System.out.print("Ingrese el mes: ");
		m = n.nextInt();
		if(m < 1 || m > 12) {
			System.out.println("Error, mes fuera de rango digite  el mes nuevamente");}
			}while(m<0 || m > 12);
		
	do {	
		System.out.print("Ingrese el anio: ");
		a = n.nextInt();
		if(a < 1) {
			System.out.println("Error, año fuera de rango digite  el año nuevamente");}
			}while(a<1);
		
		switch(m) {
		
		case 1: nombremes = "Enero";
				break;
		case 2: nombremes = "Febrero";
		break;
		case 3: nombremes = "Marzo";
		break;
		case 4: nombremes = "Abril";
		break;
		case 5: nombremes = "Mayo";
		break;
		case 6: nombremes = "Junio";
		break;
		case 7: nombremes = "Julio";
		break;
		case 8: nombremes = "Agosto";
		break;
		case 9: nombremes = "Septiembre";
		break;
		case 10: nombremes = "Octubre";
		break;
		case 11: nombremes = "Noviembre";
		break;
		case 12: nombremes = "Diciembre";
		break;
		
		}
		
		System.out.println(d + " de " + nombremes + " del anio " + a);
		
		do {	
			System.out.print("Desea seguir en el programa?1.Si 2.No: ");
			seguir = n.nextInt();
			if(seguir <= 0 || seguir > 2) {
				System.out.println("Error, seleccione una opcion valida");}
				}while(seguir<=0 || seguir > 2);
}while(seguir==1);
		System.out.println("Fin del programa");
		n.close();
	}

	}



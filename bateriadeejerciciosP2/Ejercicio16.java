package bateriadeejerciciosP2;
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0, min=0, seguir;
		double media = 0;
		int x = 1, num, cantNum=0,suma=0;
		
		Scanner n = new Scanner(System.in);
	do {	
		
		
		boolean vf = true; // primer valor ingresado
		while(x != 0) {
			System.out.print("Escribe un numero: ");
			num = n.nextInt();
			suma = suma+num;
			cantNum++;
			if(vf == true) {
				max = num;
				min = num;
				vf = false;
			}else {
				if(num > max) {
					max = num;
				}else {
					if(num <min && min == 0) {
						min=num;
					}
				}
			}
			
			if(num == 0) {
				x = num;
			}
			
		}
		
		if(cantNum == 0) {
			System.out.println("No se puede calcular la media");
		}else {
			cantNum = cantNum -1;
			media = suma/cantNum;
			System.out.println("La media es: "+ media);
		}
		System.out.println("La suma total de los numeros es: "+suma);
		System.out.println("La cantidad de numeros registrados es: "+cantNum);
		System.out.println("El numero maximo es: "+max);
		System.out.println("El numero minimo es: "+min);
		
	do {	
		System.out.println("Desea seguir en el  programa? 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<=0 || seguir>2) {System.out.println("Error, seleccione una opcion valida");}
	}while(seguir<=0 || seguir>2);
	
}while(seguir==1);
		n.close();
		
	}

	

}


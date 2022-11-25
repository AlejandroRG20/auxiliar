package Bateriadeejercicios;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// Realizar un programa que lea un número por teclado.
		// En caso de que ese número sea 0 o menor que 0, se saldrá
		// del programa imprimiendo antes un mensaje de error. Si es 
		// mayor que 0, se deberá calcular su cuadrado y la raíz 
		// cuadrada del mismo, visualizando el número que ha tecleado
		// el usuario y su resultado (“Del número X, su potencia es X 
		// y su raíz X”).
		
		int a;
		double acuadrada, araiz;
		
		Scanner n=new Scanner (System.in);
		
		System.out.println("---------BIENVENIDO---------");
		System.out.println("Digite un numero para calcular su potencia y raiz: ");
		a=n.nextInt();
		if(a<=0) { System.out.println("Error");
		System.out.println("------Fin  del programa------");
		}else {
		
		
		
		acuadrada= a*a;

		  araiz= Math.sqrt(a);
		  
		  System.out.println("Del numero "+a+", su potencia es: "+acuadrada+" y su raiz: "+araiz);
		
}
		
		
		
		System.out.println("Fin del programa");
		
		
		n.close();

	}

}

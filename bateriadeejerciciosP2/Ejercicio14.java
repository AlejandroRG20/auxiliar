package bateriadeejerciciosP2;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner n=new Scanner(System.in);
		int b=0,num=5;
        double suma=0.0;
        
        
System.out.println("Para salir ingresa -1");
while(num!=-1){
	
	
    System.out.println("Ingresa un numero");
    num=n.nextInt();
    
    
    suma=suma+num;
    b++;
}
System.out.println("La media aritmetica de los numeros ingresados es de: "+suma/(b-1));

n.close();

	}

	}


package Bateriadeejercicios;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double compra, descuento, descuento1, total;
		int entrada, seguir;
		Scanner n=new Scanner(System.in);
		
do {	
	    do {
		System.out.println("**********BIENVENIDO A LA TIENDA**********");
		System.out.println("Acontinuacion de los seguientes meses...");
			
			System.out.println( "1. Enero\n2. Febrero\n3. Marzo\n4. Abril\n5. Mayo\n6. Junio\n7. Julio\n8. Agosto\n9. Septiembre\n10. Octubre\n11. Noviembre\n12. Diciembre\n");
			System.out.println( "Que mes fue el que realizo su compra?");
			entrada=n.nextInt();
			if(entrada<0 || entrada>12) {System.out.println("Error, seleccione una opcion valida");}
		}while(entrada<0 || entrada>12);	
		
		
		
  switch (entrada) {
  case 1:
	  
	       System.out.println("---------ENERO---------");
	  
	       System.out.println("*******Bienvenido*******");
	  
	     do {  
	         System.out.println("De cuanto fue el monto de su compra?:");
	         compra=n.nextDouble();
	         if(compra<0  || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
	     }while(compra<0 || compra>100000000);         

	          
	          descuento1=00.00;
              total=compra;
              
           System.out.println("SUB-TOTAL: "+compra);
           System.out.println("DESCUENTO 15%: "+descuento1);
           System.out.println("TOTAL NETO: "+total);
           System.out.println("----------FIN----------");

   break;
   
  case 2:
	  
	  System.out.println("---------FEBRERO---------");
	  
      System.out.println("******Bienvenido******\n Por ser mes de febrero tiene 15%\n de descuento en su compra\n");
 
    do {  
        System.out.println("De cuanto fue el monto de su compra?:");
        compra=n.nextDouble();
        if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
    }while(compra<0 || compra>100000000);         

 
         
         descuento= compra*0.15;
         total=(compra-descuento);
         
         System.out.println("SUB-TOTAL: "+compra);
         System.out.println("DESCUENTO 15%: "+descuento);
         System.out.println("TOTAL NETO: "+total);
         
     break;    
         
  case 3:    
	  
	  System.out.println("---------MARZO---------");
	  
      System.out.println("*******Bienvenido*******");
 
    do {  
        System.out.println("De cuanto fue el monto de su compra?:");
        compra=n.nextDouble();
        if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
    }while(compra<0 || compra>100000000);         

         
         descuento1=00.00;
         total=compra;
         
      System.out.println("SUB-TOTAL: "+compra);
      System.out.println("DESCUENTO 15%: "+descuento1);
      System.out.println("TOTAL NETO: "+total);
      System.out.println("----------FIN----------");
	 
break;

  case 4:
	  
	  
	  System.out.println("---------ABRIL---------");
	  
      System.out.println("*******Bienvenido*******");
 
    do {  
        System.out.println("De cuanto fue el monto de su compra?:");
        compra=n.nextDouble();
        if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
    }while(compra<0 || compra>100000000);         

         
         descuento1=00.00;
         total=compra;
         
      System.out.println("SUB-TOTAL: "+compra);
      System.out.println("DESCUENTO 15%: "+descuento1);
      System.out.println("TOTAL NETO: "+total);
      System.out.println("----------FIN----------");


break;

  case 5:
	  
	  
	  System.out.println("---------MAYO---------");
	  
      System.out.println("*******Bienvenido*******");
 
    do {  
        System.out.println("De cuanto fue el monto de su compra?:");
        compra=n.nextDouble();
        if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
    }while(compra<0 || compra>100000000);         

         
         descuento1=00.00;
         total=compra;
         
      System.out.println("SUB-TOTAL: "+compra);
      System.out.println("DESCUENTO 15%: "+descuento1);
      System.out.println("TOTAL NETO: "+total);
      System.out.println("----------FIN----------");


break;

case 6:
	  
	  
	  System.out.println("---------JUNIO---------");
	  
      System.out.println("*******Bienvenido*******");
 
    do {  
        System.out.println("De cuanto fue el monto de su compra?:");
        compra=n.nextDouble();
        if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
    }while(compra<0 || compra>100000000);         

         
         descuento1=00.00;
         total=compra;
         
      System.out.println("SUB-TOTAL: "+compra);
      System.out.println("DESCUENTO 15%: "+descuento1);
      System.out.println("TOTAL NETO: "+total);
      System.out.println("----------FIN----------");


break;

case 7:
	  
	  
	  System.out.println("---------JULIO---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

case 8:
	  
	  
	  System.out.println("---------AGOSTO---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

case 9:
	  
	  
	  System.out.println("---------SEPTIEMBRE---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

case 10:
	  
	  
	  System.out.println("---------OCTUBRE---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

case 11:
	  
	  
	  System.out.println("---------NOVIEMBRE---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

case 12:
	  
	  
	  System.out.println("---------DICIEMBRE---------");
	  
    System.out.println("*******Bienvenido*******");

  do {  
      System.out.println("De cuanto fue el monto de su compra?:");
      compra=n.nextDouble();
      if(compra<0 || compra>100000000) {System.out.println("Error, el  monto  no  puede ser negativo");}
  }while(compra<0 || compra>100000000);         

       
       descuento1=00.00;
       total=compra;
       
    System.out.println("SUB-TOTAL: "+compra);
    System.out.println("DESCUENTO 15%: "+descuento1);
    System.out.println("TOTAL NETO: "+total);
    System.out.println("----------FIN----------");


break;

}
		
		
	do {	
		System.out.println( "Desea facturar otro compra?: 1.Si 2.No");
		seguir=n.nextInt();
		if(seguir<0 || seguir>2) {System.out.println("Error, Seleccione una opcion valida");}
	}while(seguir<0 || seguir>2);	
}while(seguir==1);		
	
	System.out.println("Fin del programa");
	
	n.close();
	
	

	}

	
	
}

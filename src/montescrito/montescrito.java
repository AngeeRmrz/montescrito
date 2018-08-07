package montescrito;

import java.util.Scanner;

class montescrito {
	
	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		
        String NumeroDigitado;
        System.out.println("Introduzca su numero");
        NumeroDigitado= sc.nextLine();
        int candig=NumeroDigitado.length(); 
       
        /*numero = Integer.parseInt(NumeroDigitado);*/
        
        char[] digitos= NumeroDigitado.toCharArray();
        
           String numero="";
        
                  for(int cont=0; cont<candig;cont ++) {
        	    switch (digitos[cont]) {
        	   
        	    case  '0': numero=numero+"cero/";
             	    	break;
        	   case '1': numero=numero+"uno/";
             	        break;
        	   case '2': numero=numero+"dos/";
        	   break;
        	   case '3':numero=numero+"tres/";
        	   break;
        	   case '4':numero=numero+"cuatro/";
        	   break;
        	   case '5':numero=numero+"cinco/";
        	   break;
        	   case '6':numero=numero+"seis/";
        	   break;
        	   case '7':numero=numero+"siete/";
        	   break;
        	   case '8':numero=numero+"ocho/";
        	   break;
        	   case '9':numero=numero+"nueve/";
        	   break; 
        	   
	}
       
        
       
        
        
        }
       
        System.out.println(numero);
     
        
	}
	
	
		/*@Test
	void test() {*/
		
	

}

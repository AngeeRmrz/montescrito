package montescrito;

import java.util.Scanner;

public class monescrito {
	
	public static void main (String[] args)
    {
        Scanner lector=new Scanner(System.in);
        String numero;
        System.out.println("Introduzca un numero");
        numero=lector.nextLine();
        int cant_carac=numero.length();
        char[] split_numero=numero.toCharArray();
        int ubicacion=cant_carac;
        String num_fin="";
        for(int cont=0;cont<cant_carac;cont++)
        {
            switch (ubicacion)
            
            {   
            case 1:
            if (ubicacion==cant_carac)
            {
                switch(split_numero[cont])
                {
                    case '0':
                    break;
                    
                    case '1':
                        num_fin=num_fin+"uno";
                    break;
                    
                    case '2':
                        num_fin=num_fin+"dos";
                    break;
                    
                    case '3':
                        num_fin=num_fin+"tres";
                    break;
                    
                    case '4':
                        num_fin=num_fin+"cuatro";
                    break;
                    
                    case '5':
                        num_fin=num_fin+"cinco";
                    break;
                    
                    case '6':
                        num_fin=num_fin+"seis";
                    break;
                    
                    case '7':
                        num_fin=num_fin+"siete";
                    break;
                    
                    case '8':
                        num_fin=num_fin+"ocho";
                    break;
                    
                    case '9':
                        num_fin=num_fin+"nueve";
                    break;
                }
            }
            else
            {
                switch(split_numero[cont])
                {
                    case '0':
                    break;
                    
                    case '1':
                        num_fin=num_fin+" y uno";
                    break;
                    
                    case '2':
                        num_fin=num_fin+" y dos";
                    break;
                    
                    case '3':
                        num_fin=num_fin+" y tres";
                    break;
                    
                    case '4':
                        num_fin=num_fin+" y cuatro";
                    break;
                    
                    case '5':
                        num_fin=num_fin+" y cinco";
                    break;
                    
                    case '6':
                        num_fin=num_fin+" y seis";
                    break;
                    
                    case '7':
                        num_fin=num_fin+" y siete";
                    break;
                    
                    case '8':
                        num_fin=num_fin+" y ocho";
                    break;
                    
                    case '9':
                        num_fin=num_fin+" y nueve";
                    break;
                }
            }
            break;
            case 2:
                switch(split_numero[cont])
                {
                    case '0':
                    break;
                    
                    case '1':
                        num_fin=num_fin+" diez";
                    break;
                    
                    case '2':
                        num_fin=num_fin+" veinte";
                    break;
                    
                    case '3':
                        num_fin=num_fin+" treinta";
                    break;
                    
                    case '4':
                        num_fin=num_fin+" cuarenta";
                    break;
                    
                    case '5':
                        num_fin=num_fin+" cincuenta";
                    break;
                    
                    case '6':
                        num_fin=num_fin+" sesenta";
                    break;
                    
                    case '7':
                        num_fin=num_fin+" setenta";
                    break;
                    
                    case '8':
                        num_fin=num_fin+" ochenta";
                    break;
                    
                    case '9':
                        num_fin=num_fin+" noventa";
                    break;
                }
            break;
            
            case 3:
                switch(split_numero[cont])
                {
                    case '0':
                    break;
                    
                    case '1':
                        num_fin=num_fin+" cien";
                    break;
                    
                    case '2':
                        num_fin=num_fin+" doscientos";
                    break;
                    
                    case '3':
                        num_fin=num_fin+" trecientos";
                    break;
                    
                    case '4':
                        num_fin=num_fin+" cuatrocientos";
                    break;
                    
                    case '5':
                        num_fin=num_fin+" quientos";
                    break;
                    
                    case '6':
                        num_fin=num_fin+" seiscientos";
                    break;
                    
                    case '7':
                        num_fin=num_fin+" etecientos";
                    break;
                    
                    case '8':
                        num_fin=num_fin+" ochocientos";
                    break;
                    
                    case '9':
                        num_fin=num_fin+" novecientos";
                    break;
                }
            break;
	
	
        }}}
}

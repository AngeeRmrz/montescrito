import java.util.Scanner;
public class montoescrito
{
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
                
}
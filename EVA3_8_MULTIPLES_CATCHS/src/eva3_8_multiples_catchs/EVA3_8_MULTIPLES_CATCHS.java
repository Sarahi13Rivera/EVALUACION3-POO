/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_multiples_catchs;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_MULTIPLES_CATCHS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero 1");
        int entero1= input.nextInt();
        System.out.println("Introduce un numero entero 2");
        int entero2= input.nextInt();
        
        try{
            System.out.println("Division: " + (entero1/entero2));
        }catch(ArithmeticException miVariable){ //Accion remedial 1
            System.out.println("Se produjo una division entre cero ");
        }catch(InputMismatchException e){//Accion remedial 2
            System.out.println("El valor capturado no es un numero valido");    
        }
        System.out.println("Fin del programa");
    }
    
}

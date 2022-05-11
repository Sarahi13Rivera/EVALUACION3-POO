/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; //el usuario siempre se equivoca
          Scanner input = new Scanner(System.in);
     do{
        try{
       
        System.out.println("Introduce tu edad (numero entero)");
        int iedad = input.nextInt();
        if(iedad < 0)
            throw new Exception("El valor =" + iedad + "No es una edad valida");
        System.out.println("Tu edad es: " + iedad);
        datoErroneo = false;
        }catch(InputMismatchException e){
            System.out.println(input.next() + " El dato introducido no es un numero valido");
        }catch(Exception e){
            System.out.println("Edad no valida ");
        }
     }while(datoErroneo);
    }
    
}

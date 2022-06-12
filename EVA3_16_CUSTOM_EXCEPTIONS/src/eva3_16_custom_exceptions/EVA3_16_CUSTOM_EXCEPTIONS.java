/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_custom_exceptions;

/**
 *
 * @author HP1000
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class EVA3_16_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic hereScanner input = new Scanner(System.in);
    System.out.println("Capturar Edad:");
    int valor = 0;
    try{
    valor = input.nextInt();
    }catch(InputMismatchException ex){
        throw new Exception("Introdujiste una cadena de texto y no un numero");
    }
    }
    
}

//EXCEPTION PERZNALIZADA
//HEREDAD DE EXCEPTION
class ExceptionDeCaptura extends Exception{

    public ExceptionDeCaptura() {
    }

    public ExceptionDeCaptura(String message) {
        super(message);
    }
    
}
    
    


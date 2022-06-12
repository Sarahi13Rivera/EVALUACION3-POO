/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_17_exception_rango;

/**
 *
 * @author HP1000
 */
public class EVA3_17_EXCEPTION_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona persona = new Persona("Juan Perez", 50);
        }catch (ExceptionDeRango ex){
            ex.printStackTrace();
        }
    }
    


class ExceptionDeRango extends Exception {

    public ExceptionDeRango() {
    }

    public ExceptionDeRango(String message) {
        super(message);
    }
    
}

class Persona {

    private String nombre;
    private int edad;

    public Persona(){
    }

    public Persona(String nombre, int edad) throws ExceptionDeRango{
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExceptionDeRango{
        if ((edad >= 0) && (edad <= 130)) {
            this.edad = edad;
        } 
    else {
    throw new ExceptionDeRango("Rango de edad incorrecto!!");

        }
    }
      
}
    
    


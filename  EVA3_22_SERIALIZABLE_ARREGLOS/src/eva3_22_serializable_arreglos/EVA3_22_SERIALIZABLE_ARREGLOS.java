/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_serializable_arreglos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP1000
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Persona> miListaPerso = new ArrayList(); //Collections <TIPOS DE DATOS GENERICOS>
        //JAVA --> LISTAS, ARREGLOS, ETC: 0 --> N- 1
        miListaPerso.add(new Persona("Diego", "Flores"));//0
        miListaPerso.add(new Persona("Ian", "Lopez"));//1
        miListaPerso.add(new Persona("Teodoro", "Perez"));//2
        miListaPerso.add(new Persona("Elmer", "Perez"));
        escribirObj(miListaPerso);
        leerObj();

    }

    public static void escribirObj(Object obj) {

        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/ARCHIVOS/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void leerObj() {
        try {
            FileInputStream abrirArch = new FileInputStream("c:/ARCHIVOS/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = (ArrayList<Persona>) leerObjeto.readObject();//OBJETO (Class Object)
            
            for (int i = 0; i < miListaPerso.size(); i++) {
                Persona persona = miListaPerso.get(i);
                System.out.println("Nombre: " + persona.getNombre() + " | Apellido: " + persona.getApellido());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
    }
    
}

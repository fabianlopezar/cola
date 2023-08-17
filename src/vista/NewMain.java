//crear datos que 
package vista;

import datos.Persona;
import modelo.Cola;

/**
 *
 * @author fabian_esteban.lopez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cola de tipo persona
        Cola<Persona> colaPersonas = new Cola<>();
        colaPersonas.encolar(new Persona("David", "dacastro@uao", "301"));
        colaPersonas.encolar(new Persona("Fabian", "fabi@uao", "302"));
        colaPersonas.encolar(new Persona("Esteban", "esteban@uao", "303"));
        colaPersonas.encolar(new Persona("Ingrid", "ingrid@uao", "304"));
        System.out.println("El contenido de la cola es: " + colaPersonas.toString());

        colaPersonas.desencolar();

        System.out.println("El contenido de la cola es: " + colaPersonas.toString());

    }

}

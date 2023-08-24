/**
 *
 * @author fabian_esteban.lopez
 */
package modelo;

import datos.Estudiante;

public class OperacionesCola<T extends Base> {

    public static <T extends Base> Cola<T> duplicarCola(Cola<T> CO1) {
        Cola<T> colaAUX = new Cola<>();
        Cola<T> colaDuplicada = new Cola<>();
        while (!CO1.estaVacia()) {
            T elemento = CO1.desencolar();
            colaAUX.encolar(elemento);
        }

        while (!colaAUX.estaVacia()) {
            T elemento = colaAUX.desencolar();
            T elementoCopiado = (T) elemento.copy();

            CO1.encolar(elemento);
            colaDuplicada.encolar(elementoCopiado);

        }

        return colaAUX;

    }

    public static <T extends Base> Cola<T> ColaResult(Cola<T> CO1) {
        Cola<T> colaAUX = new Cola<>();
        Cola<T> colaD = duplicarCola(CO1);

        while (!colaD.estaVacia()) {
            T elemento = colaD.desencolar();

            Estudiante objE = (Estudiante) elemento;
            String carrera = objE.getCarreraE();
            if (carrera.contains("Ingenieria")) {
                colaAUX.encolar(elemento);
            }
        }

        return colaAUX;
    }
}

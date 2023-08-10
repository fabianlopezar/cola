package modelo;

import java.util.LinkedList;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Cola<T extends Base> {

    LinkedList<T> elems;

    public Cola() {
        elems = new LinkedList<>();
    }

    public void encolar(T elemento) {
        elems.addLast(elemento);
    }

    public T desencolar() {
        return elems.removeFirst();
    }

    public boolean estaVacia() {
        return elems.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (T elemento : elems) {
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}

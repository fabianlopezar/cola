/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Estudiante  extends Base{

    private String nombreE;
    private String carreraE;
    private String codigoE;

    public Estudiante() {
    }

    public Estudiante(String nombreE, String carreraE, String codigoE) {
        this.nombreE = nombreE;
        this.carreraE = carreraE;
        this.codigoE = codigoE;
    }

    /**
     * Get the value of codigoE
     *
     * @return the value of codigoE
     */
    public String getCodigoE() {
        return codigoE;
    }

    /**
     * Set the value of codigoE
     *
     * @param codigoE new value of codigoE
     */
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    /**
     * Get the value of carreraE
     *
     * @return the value of carreraE
     */
    public String getCarreraE() {
        return carreraE;
    }

    /**
     * Set the value of carreraE
     *
     * @param carreraE new value of carreraE
     */
    public void setCarreraE(String carreraE) {
        this.carreraE = carreraE;
    }

    /**
     * Get the value of nombreE
     *
     * @return the value of nombreE
     */
    public String getNombreE() {
        return nombreE;
    }

    /**
     * Set the value of nombreE
     *
     * @param nombreE new value of nombreE
     */
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombreE=" + nombreE + ", carreraE=" + carreraE + ", codigoE=" + codigoE + '}';
    }

    @Override
    public Base copy() {
      return new Estudiante(nombreE, carreraE, codigoE);
    }

}

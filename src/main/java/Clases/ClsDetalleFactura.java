/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author KamiVela
 */
public class ClsDetalleFactura {

    private int unidades;
    private String descripcion;
    private double valorfactura;
    private double peso;
    private double gastovalor;
    private double gastopeso;
    private double costounidad;
    private double costototal;

    private double totalfactura;
    private double totalgastosvalor;
    private double totalgastopeso;

   
    public ClsDetalleFactura() {

    }

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the valorfactura
     */
    public double getValorfactura() {
        return valorfactura;
    }

    /**
     * @param valorfactura the valorfactura to set
     */
    public void setValorfactura(double valorfactura) {
        this.valorfactura = valorfactura;
    }

    /**
     * @return the gastovalor
     */
    public double getGastovalor() {
        return gastovalor;
    }

    /**
     * @param gastovalor the gastovalor to set
     */
    public void setGastovalor(double gastovalor) {
        this.gastovalor = gastovalor;
    }

    /**
     * @return the gastopeso
     */
    public double getGastopeso() {
        return gastopeso;
    }

    /**
     * @param gastopeso the gastopeso to set
     */
    public void setGastopeso(double gastopeso) {
        this.gastopeso = gastopeso;
    }

    /**
     * @return the costounidad
     */
    public double getCostounidad() {
        return costounidad;
    }

    /**
     * @param costounidad the costounidad to set
     */
    public void setCostounidad(double costounidad) {
        this.costounidad = costounidad;
    }

    /**
     * @return the costototal
     */
    public double getCostototal() {
        return costototal;
    }

    /**
     * @param costototal the costototal to set
     */
    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

}

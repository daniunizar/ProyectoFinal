/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosSimples;

/**
 * Esta clase es un ítem de facturacion, de utilidad para rellenar el jTable de
 * la clase F_Facturación.
 *
 * @author Daniel Marcos Muñoz
 */
public class Item_Facturacion {

    String concepto;
    int cantidad;
    float ingresos;

    /**
     * Método constructor por defecto.
     */
    public Item_Facturacion() {

    }

    /**
     * Método constructor que requiere de todos los atributos.
     *
     * @param concepto Recibe por parámetro el concepto del ingreso: un tipo de
     * entrada o producto promocional.
     * @param cantidad Recibe por parámetro la cantidad de productos vendidos
     * del tipo que consta en concepto.
     * @param ingresos Recibe por parámetro el sumatorio de precios de todos los
     * productos vendidos.
     */
    public Item_Facturacion(String concepto, int cantidad, float ingresos) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.ingresos = ingresos;
    }

    /**
     * Permite establecer el concepto del ítem: un tipo de entrada o de producto
     * promocional.
     *
     * @param concepto Recibe por parámetro el nombre del tipo de entrada o
     * producto.
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * Permite establecer la cantidad de productos vendidos de un determinado
     * ítem.
     *
     * @param cantidad Recibe por parámetro la cantidad de tipos de entrada o
     * productos promocionales vendidos.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Permite establecer la cantidad de dinero asociada al producto vendido
     *
     * @param ingresos Recibe por parámetro la cantidad de dinero asociada al
     * producto vendido
     */
    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    /**
     * Permite recuperar el nombre del tipo de entrada o pruducto.
     *
     * @return Devuelve el nombre del tipo de entrada o producto.
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Permite recuperar la cantida de entradas o productos vendidos.
     *
     * @return Devuelve la cantidad del tipo de entrada o producto vendido.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Permite recuperar la suma de dinero recaudada por la venta de las
     * entradas o productos promocionales.
     *
     * @return Devuelve la suma de dinero recaudada por la venta de entradas o
     * productos promocionales.
     */
    public float getIngresos() {
        return ingresos;
    }
}

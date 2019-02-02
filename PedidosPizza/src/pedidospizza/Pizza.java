/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidospizza;

/**
 *
 * @author debla
 */
public class Pizza {

    private String tamaño, tipo, estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza() {
    }

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public String getTamano() {
        return tamaño;
    }

    public void setTamano(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Pizza: " + this.tipo + " " + this.tamaño + ", " + this.estado;
    }

    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido.");
        }
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

}

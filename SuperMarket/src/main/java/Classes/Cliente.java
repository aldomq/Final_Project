/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author aldoi
 */
public class Cliente {
    private int idCliente;
    private int productosAdquiridos;
    private float tiempoEstancia;
    private float tiempoAtencionCajera;

    public Cliente() {}

    public Cliente(int idCliente, int productosAdquiridos, float tiempoEstancia, float tiempoAtencionCajera) {
        this.idCliente = idCliente;
        this.productosAdquiridos = productosAdquiridos;
        this.tiempoEstancia = tiempoEstancia;
        this.tiempoAtencionCajera = tiempoAtencionCajera;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getProductosAdquiridos() {
        return productosAdquiridos;
    }

    public void setProductosAdquiridos(int productosAdquiridos) {
        this.productosAdquiridos = productosAdquiridos;
    }

    public float getTiempoEstancia() {
        return tiempoEstancia;
    }

    public void setTiempoEstancia(float tiempoEstancia) {
        this.tiempoEstancia = tiempoEstancia;
    }

    public float getTiempoAtencionCajera() {
        return tiempoAtencionCajera;
    }

    public void setTiempoAtencionCajera(float tiempoAtencionCajera) {
        this.tiempoAtencionCajera = tiempoAtencionCajera;
    }
}

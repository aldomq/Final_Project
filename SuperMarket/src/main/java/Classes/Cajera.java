/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author aldoi
 */
public class Cajera {
    private String nombre;
    private int idCajera;

    public Cajera() {}

    public Cajera(int idCajera, String nombre) {
        this.idCajera = idCajera;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCajera() {
        return idCajera;
    }

    public void setIdCajera(int idCajera) {
        this.idCajera = idCajera;
    }
}

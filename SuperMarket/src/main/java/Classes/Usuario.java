/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author salaz
 */
public class Usuario {
    private String Usuario;
    private int Password; 

    public Usuario() {
    }

    public Usuario(String Usuario, int Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public int getPassword() {
        return Password;
    }
    
    
}

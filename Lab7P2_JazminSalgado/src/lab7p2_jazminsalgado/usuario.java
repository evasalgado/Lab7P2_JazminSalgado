/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class usuario {
    private String nombre;
    private String username;
    private String contraseña;
    private double saldo;

    public usuario() {
    }

    public usuario(String nombre, String username, String contraseña, double saldo) {
        this.nombre = nombre;
        this.username = username;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>=0) {
            this.saldo = saldo;
        }
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
}

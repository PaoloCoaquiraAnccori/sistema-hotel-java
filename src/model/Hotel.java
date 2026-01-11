package model;

import java.util.ArrayList;
import model.usuario.Cliente;
import model.usuario.Dueño;
import model.usuario.empleados.PersonalHotel;

public class Hotel {
    private String nombre;
    private Dueño dueño;
    private int pisos;
    private String direccion;
    private String telefono;
    private ArrayList<PersonalHotel> empleados;
    private ArrayList<Cliente> clientes;
    private Estacionamiento estacionamiento;

    public Hotel(String nombre, int pisos, Dueño dueño, String direccion, String telefono){
        this.nombre = nombre;
        this.pisos = pisos;
        this.dueño = dueño;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<PersonalHotel> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<PersonalHotel> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }



}

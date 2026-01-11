package model.usuario.empleados;

import model.usuario.EstadoUsuario;
import model.usuario.Rol;
import model.usuario.Usuario;

public abstract class PersonalHotel extends Usuario{
    private String turno;
    private double salario;
    private String cargo;
    private EstadoLaboral estadoLaboral;
    private Disponibilidad disponibilidad;

    public PersonalHotel(String nombre, String primerApellido, String segundoApellido, 
        String dni, String contraseña, int edad, String genero, String email, 
        String telefono, Rol rol, EstadoUsuario estadoUsuario,String turno,
        double salario ,String cargo, EstadoLaboral estadoLaboral, 
        Disponibilidad disponibilidad) {
        super(nombre, primerApellido, segundoApellido, dni, contraseña, edad, genero, email, telefono, rol, estadoUsuario);
        this.turno = turno;
        this.salario = salario;
        this.cargo = cargo;
        this.estadoLaboral = estadoLaboral;
        this.disponibilidad = disponibilidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public EstadoLaboral getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(EstadoLaboral estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

     
    
}

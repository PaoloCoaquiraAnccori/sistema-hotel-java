package model.usuario.empleados;

import model.usuario.EstadoUsuario;
import model.usuario.Rol;

public class PersonalMantenimiento extends PersonalHotel {

    public PersonalMantenimiento(String nombre, String primerApellido, String segundoApellido, String dni, String contraseña, int edad, String genero, String email, String telefono, Rol rol, EstadoUsuario estadoUsuario, String turno, double salario, String cargo, EstadoLaboral estadoLaboral, Disponibilidad disponibilidad) {
        super(nombre, primerApellido, segundoApellido, dni, contraseña, edad, genero, email, telefono, rol, estadoUsuario, turno, salario, cargo, estadoLaboral, disponibilidad);
    }
    
}

package model.usuario.empleados;

import model.usuario.EstadoUsuario;
import model.usuario.Rol;
import model.usuario.Usuario;

public class PersonalHotel extends Usuario{

    public PersonalHotel(String nombre, String primerApellido, String segundoApellido, String dni, String contraseña, int edad, String genero, String email, String telefono, Rol rol, EstadoUsuario estadoUsuario) {
        super(nombre, primerApellido, segundoApellido, dni, contraseña, edad, genero, email, telefono, rol, estadoUsuario);
    }
    
}

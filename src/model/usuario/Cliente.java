package model.usuario;

public class Cliente extends Usuario{

    public Cliente(String nombre, String primerApellido, String segundoApellido, String dni, String contraseña, int edad, String genero, String email, String telefono, Rol rol, EstadoUsuario estadoUsuario) {
        super(nombre, primerApellido, segundoApellido, dni, contraseña, edad, genero, email, telefono, rol, estadoUsuario);
    }
    
}

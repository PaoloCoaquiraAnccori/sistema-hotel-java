package model.usuario;

public abstract class Usuario {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private String contraseña;
    private int edad;
    private String genero;
    private String email;
    private String telefono;
    private Rol rol;
    private EstadoUsuario estadoUsuario;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String dni, 
        String contraseña, int edad, String genero, String email, String telefono, Rol rol, 
        EstadoUsuario estadoUsuario){
            this.nombre = nombre;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;
            this.dni = dni;
            this.contraseña = contraseña;
            this.edad = edad;
            this.genero = genero;
            this.email = email;
            this.telefono = telefono;
            this.rol = rol;
            this.estadoUsuario = estadoUsuario;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public EstadoUsuario isEstado() {
        return estadoUsuario;
    }

    public void setEstado(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

}

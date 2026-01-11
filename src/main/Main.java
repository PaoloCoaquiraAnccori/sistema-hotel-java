package main;

import java.util.Scanner;
import model.Hotel;
import model.usuario.Dueño;
import model.usuario.EstadoUsuario;
import model.usuario.Rol;

public class Main {
    public static Scanner lector = new Scanner(System.in); // asi lo en todo el codigo
    public static Integer longitud = 100;

    public static String linea() {
        StringBuilder lineaRep = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            lineaRep.append("*");
        }
        return lineaRep.toString();
    }

    // ***********************************************************************************
    // */
    // *** Menus */
    public static void menuPrincipal() {
        System.out.println("==== Menu del Hotel ====");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrar (Clientes)");
        System.out.println("0. Salir");
    }

    // --------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void inicioPrograma() {
        System.out.println(linea());
        // =============== Datos Hotel ===============
        String nombre = "Hotel Sol de Oro";
        int pisos = 10;
        Dueño dueñoAbsoluto = new Dueño("Paolo Josue", "Coaquira", "Anccori", "75554491", "paolo200505", 20,
                "Masculino", "paolojosuecoaquiraanccori@gmail.com", "937319442", Rol.DUEÑO, EstadoUsuario.ACTIVO);
        String direccion = "Psj San Jose";
        String telefono = "967845193";
        // =============================================

        Hotel hotel1 = new Hotel(nombre, pisos, dueñoAbsoluto, direccion, telefono);
        System.out.println(hotel1.getNombre());
        System.out.println(linea());
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        inicioPrograma();
    }
}

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

    //************************************************************************************
    public static void iniciarSesion(){
        System.out.print("Número de DNI:");
        String dni = lector.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = lector.nextLine();
    }

    // ***********************************************************************************
    // ************  MENUS   ****************************************
    public static void menuPrincipal() {
        boolean validarMenuPrincipal = false;
        do {
            System.out.println("==== Menu del Hotel ====");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrar (Clientes)");
            System.out.println("0. Salir");
            try {
                System.out.print("Opcion: ");
                int opcionMenuHotel = lector.nextInt();
                lector.nextLine();
                switch (opcionMenuHotel) {
                    case 0 -> {
                        validarMenuPrincipal = true;
                    }
                    case 1 -> {
                        iniciarSesion();
                    }
                    case 2 -> {
                    }
                    default -> {
                        System.out.println("La opcion no esta disponible.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Opcion no valida!!");
            }
        } while (validarMenuPrincipal == false);
    }

    // --------------------------------------------------------------------------------------------------------------------------------------------------------------
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
        menuPrincipal();
        System.out.println(linea());
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        inicioPrograma();
    }
}

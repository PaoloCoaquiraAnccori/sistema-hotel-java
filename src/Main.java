import java.util.Scanner;

public class Main {
    public static Scanner lector = new Scanner(System.in); // asi lo en todo el codigo
    public static Integer longitud = 100;


    public static String linea(){
        StringBuilder lineaRep = new StringBuilder();
        for (int i = 0; i < longitud; i++){
            lineaRep.append("*");
        }
        return lineaRep.toString();
    }
1

    public static void inicioPrograma() {
        System.out.println(linea());

    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        inicioPrograma();
    }
}

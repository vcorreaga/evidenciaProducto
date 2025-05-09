import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, documento, telefono, correo;

        System.out.println("Por favor ingrese su nombre:");
        nombre = sc.nextLine();

        System.out.println("Por favor ingrese sus apellidos:");
        apellidos = sc.nextLine();

        System.out.println("Por favor ingrese su documento de identidad:");
        documento = sc.nextLine();

        System.out.println("Por favor ingrese su número de contacto:");
        telefono = sc.nextLine();

        System.out.println("Por favor ingrese su correo electrónico:");
        correo = sc.nextLine();

        limpiarPantalla();
        System.out.println("Para ti " + nombre + " " + apellidos + " tenemos las siguientes opciones\n");
        pausar();

        mostrarOpcion("1. Asistente administrativo:",
                "El egresado estará en capacidad de asistir procesos operativos de planeación, organización, dirección y control...");

        mostrarOpcion("2. Asistente contable:",
                "El egresado estará en capacidad de tramitar y procesar información contable, financiera, de costos...");

        mostrarOpcion("3. Desarrollo de Software:",
                "El egresado tendrá las competencias para asistir el desarrollo de aplicativos tipo web y para dispositivos móviles...");

        mostrarOpcion("4. Diseño Gráfico:",
                "El egresado contará con las competencias para asistir el proceso de diseño de proyectos gráficos...");

        mostrarOpcion("5. Primera Infancia:",
                "El egresado estará en capacidad de apoyar el desarrollo integral de la primera infancia...");

        mostrarOpcion("6. Seguridad laboral:",
                "El egresado podrá desempeñarse como Auxiliar de Seguridad y Salud en el Trabajo...");

        mostrarOpcion("7. Talento Humano:",
                "El egresado estará en capacidad de recopilar, actualizar y tramitar información de los procesos de gestión humana...");

        mostrarOpcion("8. Mercadeo:",
                "El egresado estará en capacidad de apoyar operativamente la gestión de las variables de la mezcla del mercadeo...");

        sc.close();
    }

    public static void mostrarOpcion(String titulo, String descripcion) {
        System.out.println(titulo);
        System.out.println();
        System.out.println(descripcion);
        System.out.println();
        pausar();
    }

    public static void pausar() {
        System.out.println("Presione ENTER para continuar...");
        try {
            System.in.read();
            System.in.skip(System.in.available());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}

// Integrantes del proyecto:

//Meryeis Jaramillo David CC: 1000566223
//Viadis Correa Galeano  CC: 1104419046
//Mariana Suárez Echeverri  CC: 1035418326
//John F. Marín Cadavid  CC: 1038627159

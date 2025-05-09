import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, documento, telefono, correo;
        int opcion;

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

        System.out.println("1. Asistente administrativo");
        System.out.println("2. Asistente contable");
        System.out.println("3. Desarrollo de Software");
        System.out.println("4. Diseño Gráfico");
        System.out.println("5. Primera Infancia");
        System.out.println("6. Seguridad laboral");
        System.out.println("7. Talento Humano");
        System.out.println("8. Mercadeo");
        
        System.out.print("\nPor favor selecciona una opción (1-8): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("El egresado estará en capacidad de asistir procesos operativos de planeación, organización, dirección y control...");
        } else if (opcion == 2) {
            System.out.println("El egresado estará en capacidad de tramitar y procesar información contable, financiera, de costos...");
        } else if (opcion == 3) {
            System.out.println("El egresado tendrá las competencias para asistir el desarrollo de aplicativos tipo web y para dispositivos móviles...");
        } else if (opcion == 4) {
            System.out.println("El egresado contará con las competencias para asistir el proceso de diseño de proyectos gráficos...");
        } else if (opcion == 5) {
            System.out.println("El egresado estará en capacidad de apoyar el desarrollo integral de la primera infancia...");
        } else if (opcion == 6) {
            System.out.println("El egresado podrá desempeñarse como Auxiliar de Seguridad y Salud en el Trabajo...");
        } else if (opcion == 7) {
            System.out.println("El egresado estará en capacidad de recopilar, actualizar y tramitar información de los procesos de gestión humana...");
        } else if (opcion == 8) {
            System.out.println("El egresado estará en capacidad de apoyar operativamente la gestión de las variables de la mezcla del mercadeo...");
        } else {
            System.out.println(" Opción no válida. Por favor, selecciona un número entre 1 y 8.");
        }
        
        sc.close(); 
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

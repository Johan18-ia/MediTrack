    package meditrack;

import java.util.Scanner;

public class Meditrack {
public static void main(String[] args) {

        Gestor_citas gestor = new Gestor_citas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MÓDULO DE GESTIÓN DE CITAS =====");
            System.out.println("1. Crear cita");
            System.out.println("2. Listar citas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("ID de la cita: ");
                    String id = sc.nextLine();

                    System.out.print("Nombre del paciente: ");
                    String paciente = sc.nextLine();

                    System.out.print("Nombre del médico: ");
                    String medico = sc.nextLine();

                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();

                    gestor.crearCita(id, paciente, medico, fecha);
                    break;

                case 2:
                    gestor.listarCitas();
                    break;

                case 3:
                    System.out.println("Saliendo del módulo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }
}
    


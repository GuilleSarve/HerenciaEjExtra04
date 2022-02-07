package guia5ejerciciosextra04.Servicios;

import guia5ejerciciosextra04.Entidades.Persona;
import guia5ejerciciosextra04.Entidades.Personal;
import java.util.Scanner;

public class ServicioPersonal {

    /*
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos
desarrollados.
    
    private Integer anioIngreso;
    private Integer despacho;
    private String sector;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioPersona sp = new ServicioPersona();

    public Personal crearPersonal() {
        System.out.println("----Nuevo Personal De Servicio----");
        Persona p = sp.crearPersona();
        System.out.println("Ingrese el año de ingreso: ");
        int anioIngreso = leer.nextInt();
        System.out.println("Ingrese el número de despacho asignado: ");
        int despacho = leer.nextInt();
        System.out.println("Ingrese el sector correspondiente: ");
        String sector = leer.next();
        Personal pf = new Personal(anioIngreso, despacho, sector, p.getNombres(), p.getApellidos(), p.getIdentificacion(), p.getEstadoCivil());
        return pf;
    }

    public int cambiarDespacho() {
        System.out.println("Ingrese el nuevo número de despacho: ");
        int aux = leer.nextInt();
        return aux;
    }

    public String cambiarSector() {
        System.out.println("Ingrese el nuevo sector: ");
        String aux = leer.next();
        return aux;
    }
}

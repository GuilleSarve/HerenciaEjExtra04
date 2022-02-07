package guia5ejerciciosextra04.Servicios;

import guia5ejerciciosextra04.Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    /*
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos
desarrollados.
    
    protected String nombres;
    protected String apellidos;
    protected Integer identificacion;//dni
    protected String estadoCivil;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese los nombres: ");
        p.setNombres(leer.next());
        System.out.println("Ingrese los apellidos: ");
        p.setApellidos(leer.next());
        System.out.println("Ingrese su número de identificación: ");
        p.setIdentificacion(leer.nextInt());
        System.out.println("Ingrese su estado civil: ");
        p.setEstadoCivil(leer.next());
        return p;
    }

    public String cambiarEstadoCivil() {
        System.out.println("Ingrese nuevo estado civil: ");
        String aux = leer.next();
        return aux;
    }

}

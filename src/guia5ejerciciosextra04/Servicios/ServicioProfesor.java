package guia5ejerciciosextra04.Servicios;

import guia5ejerciciosextra04.Entidades.Persona;
import guia5ejerciciosextra04.Entidades.Profesor;
import java.util.Scanner;

public class ServicioProfesor  {

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
    private String departamento;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioPersona sp = new ServicioPersona();

    public Profesor crearProfesor() {
        System.out.println("----Nuevo Profesor----");
        Persona p = sp.crearPersona();
        System.out.println("Ingrese el año de ingreso: ");
        int anioIngreso = leer.nextInt();
        System.out.println("Ingrese el número de despacho asignado: ");
        int despacho = leer.nextInt();
        System.out.println("Ingrese el departamento correspondiente: ");
        String departamento = leer.next();
        Profesor pf = new Profesor(anioIngreso, despacho, departamento, p.getNombres(), p.getApellidos(), p.getIdentificacion(), p.getEstadoCivil());
        return pf;
    }

    public int cambiarDespacho() {
        System.out.println("Ingrese el nuevo número de despacho: ");
        int aux = leer.nextInt();
        return aux;
    }

    public String cambiarDepartamento() {
        System.out.println("Ingrese el nuevo departamento: ");
        String aux = leer.next();
        return aux;
    }
}

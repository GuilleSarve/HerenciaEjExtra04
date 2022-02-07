package guia5ejerciciosextra04.Servicios;

import guia5ejerciciosextra04.Entidades.Estudiante;
import guia5ejerciciosextra04.Entidades.Persona;
import java.util.Scanner;

public class ServicioEstudiante  {

    /*
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos
desarrollados.
    
    private String curso;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioPersona sp = new ServicioPersona();

    public Estudiante crearEstudiante() {
        System.out.println("----Nuevo Estudiante----");
        Persona p = sp.crearPersona();
        System.out.println("Ingrese el curso: ");
        String curso = leer.next();
        Estudiante e = new Estudiante(curso, p.getNombres(), p.getApellidos(), p.getIdentificacion(), p.getEstadoCivil());
        return e;
    }

    public String nuevoCurso() {
        System.out.println("Ingrese el nuevo curso: ");
        String aux = leer.next();
        return aux;
    }
}

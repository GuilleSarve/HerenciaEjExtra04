package guia5ejerciciosextra04;

import guia5ejerciciosextra04.Entidades.Estudiante;
import guia5ejerciciosextra04.Entidades.Persona;
import guia5ejerciciosextra04.Entidades.Personal;
import guia5ejerciciosextra04.Entidades.Profesor;
import guia5ejerciciosextra04.Servicios.ServicioEstudiante;
import guia5ejerciciosextra04.Servicios.ServicioPersona;
import guia5ejerciciosextra04.Servicios.ServicioPersonal;
import guia5ejerciciosextra04.Servicios.ServicioProfesor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjerciciosExtra04 {

    public static void main(String[] args) {
        /*
4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
aplicación. A continuación, debe programar las clases definidas en las que,
además de los constructores, hay que desarrollar los métodos correspondientes
a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos
desarrollados.
         */
        ArrayList<Persona> comunidad = new ArrayList();
        ArrayList<Estudiante> alumnos = new ArrayList();
        ArrayList<Profesor> docentes = new ArrayList();
        ArrayList<Personal> empleadosDeServicio = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        ServicioEstudiante se = new ServicioEstudiante();
        ServicioProfesor spf = new ServicioProfesor();
        ServicioPersonal spe = new ServicioPersonal();
        int cantAlumnos = 1;
        int cantDocentes = 1;
        int cantEmpleadosDeServicio = 1;
        for (int i = 0; i < cantAlumnos; i++) { // crea alumnos
            System.out.println("----Nuevo Estudiante----");
            Estudiante e = se.crearEstudiante();
            alumnos.add(e);
            comunidad.add(e);
        }
        for (int i = 0; i < cantDocentes; i++) { // crea profesores
            System.out.println("----Nuevo Profesor----");
            Profesor pf = spf.crearProfesor();
            docentes.add(pf);
            comunidad.add(pf);
        }
        for (int i = 0; i < cantEmpleadosDeServicio; i++) { // crea personal de servicio
            System.out.println("----Nuevo Personal De Servicio----");
            Personal pe = spe.crearPersonal();
            empleadosDeServicio.add(pe);
            comunidad.add(pe);
        }
        String opcion = "";
        do {
            System.out.println("---MENÚ---\n"
                    + "1. Agregar Estudiante. \n"
                    + "2. Agregar Profesor. \n"
                    + "3. Agregar Personal de Servicio. \n"
                    + "4. Ver lista de Estudiantes. \n"
                    + "5. Ver lista de Profesores. \n"
                    + "6. Ver lista de Personal de Servicio. \n"
                    + "7. Ver lista completa. \n"
                    + "8. Actualizar Estado Civil. \n"
                    + "9. Reasignar Despacho. \n"
                    + "10. Matriculación de un estudiante en un nuevo curso. \n"
                    + "11. Cambio de departamento de un profesor. \n"
                    + "12. Traslado de sector de un empleado del personal. \n"
                    + "13. Salir. \n"
                    + "Elija una opción: ");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    Estudiante e = se.crearEstudiante();
                    alumnos.add(e);
                    comunidad.add(e);
                    break;
                case "2":
                    Profesor pf = spf.crearProfesor();
                    docentes.add(pf);
                    comunidad.add(pf);
                    break;
                case "3":
                    Personal pe = spe.crearPersonal();
                    empleadosDeServicio.add(pe);
                    comunidad.add(pe);
                    break;
                case "4":
                    System.out.println("----Estudiantes----");
                    for (Estudiante aux : alumnos) {
                        System.out.println(aux.toString());
                    }
                    break;
                case "5":
                    System.out.println("----Profesores----");
                    for (Profesor aux : docentes) {
                        System.out.println(aux.toString());
                    }
                    break;
                case "6":
                    System.out.println("----Personal De Servicio----");
                    for (Personal aux : empleadosDeServicio) {
                        System.out.println(aux.toString());
                    }
                    break;
                case "7":
                    System.out.println("----Lista Completa----");
                    for (Persona aux : comunidad) {
                        System.out.println(aux.toString());
                    }
                    break;
                case "8": // Actualizar Estado Civil
                    boolean conf = false;
                    do {
                        System.out.println("Ingrese el número de Identificación: ");
                        int id = leer.nextInt();
                        Iterator<Persona> it = comunidad.iterator();
                        while (it.hasNext()) {
                            Persona next = it.next();
                            if (next.getIdentificacion() == id) {
                                next.setEstadoCivil(sp.cambiarEstadoCivil());
                                conf = true;
                            }
                        }
                        if (conf == false) {
                            System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                        }
                    } while (conf == false);
                    break;
                case "9": // Reasignar Despacho
                    System.out.println("Desea reasignar el despacho de un profesor(s)o de personal de servicio(n)?");
                    String resp = "";
                    do {
                        resp = leer.next();
                    } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
                    if (resp.equalsIgnoreCase("s")) {
                        boolean confirmacion = false;
                        do {
                            System.out.println("Ingrese el número de Identificación: ");
                            int id = leer.nextInt();
                            Iterator<Profesor> it = docentes.iterator();
                            while (it.hasNext()) {
                                Profesor next = it.next();
                                if (next.getIdentificacion() == id) {
                                    next.setDespacho(spf.cambiarDespacho());
                                    confirmacion = true;
                                }
                            }
                            if (confirmacion == false) {
                                System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                            }
                        } while (confirmacion == false);
                    } else {
                        boolean confirmacion2 = false;
                        do {
                            System.out.println("Ingrese el número de Identificación: ");
                            int id = leer.nextInt();
                            Iterator<Personal> it = empleadosDeServicio.iterator();
                            while (it.hasNext()) {
                                Personal next = it.next();
                                if (next.getIdentificacion() == id) {
                                    next.setDespacho(spe.cambiarDespacho());
                                    confirmacion2 = true;
                                }
                            }
                            if (confirmacion2 == false) {
                                System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                            }
                        } while (confirmacion2 == false);
                    }
                    break;
                case "10": // Matriculación de un estudiante en un nuevo curso
                    boolean confi = false;
                    do {
                        System.out.println("Ingrese el número de Identificación: ");
                        int id = leer.nextInt();
                        Iterator<Estudiante> it = alumnos.iterator();
                        while (it.hasNext()) {
                            Estudiante next = it.next();
                            if (next.getIdentificacion() == id) {
                                next.setCurso(se.nuevoCurso());
                                confi = true;
                            }
                        }
                        if (confi == false) {
                            System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                        }
                    } while (confi == false);
                    break;
                case "11": // Cambio de departamento de un profesor
                    boolean confirm = false;
                    do {
                        System.out.println("Ingrese el número de Identificación: ");
                        int id = leer.nextInt();
                        Iterator<Profesor> it = docentes.iterator();
                        while (it.hasNext()) {
                            Profesor next = it.next();
                            if (next.getIdentificacion() == id) {
                                next.setDepartamento(spf.cambiarDepartamento());
                                confirm = true;
                            }
                        }
                        if (confirm == false) {
                            System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                        }
                    } while (confirm == false);
                    break;
                case "12": // Traslado de sector de un empleado del personal
                    boolean confirmar = false;
                    do {
                        System.out.println("Ingrese el número de Identificación: ");
                        int id = leer.nextInt();
                        Iterator<Personal> it = empleadosDeServicio.iterator();
                        while (it.hasNext()) {
                            Personal next = it.next();
                            if (next.getIdentificacion() == id) {
                                next.setSector(spe.cambiarSector());
                                confirmar = true;
                            }
                        }
                        if (confirmar == false) {
                            System.out.println("NO se encontró a la persona buscada. Vuelva a intentarlo.");
                        }
                    } while (confirmar == false);
                    break;
                case "13":
                    System.out.println("Eligió Salir, nos vemos pronto!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida, inténtelo nuevamente. ");
            }
        } while (!opcion.equals("13"));
    }
}

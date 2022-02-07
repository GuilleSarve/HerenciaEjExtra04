package guia5ejerciciosextra04.Entidades;

public class Estudiante extends Persona {

    /*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
     */
    private String curso;

    public Estudiante() {
        super();
    }

    public Estudiante(String curso, String nombres, String apellidos, Integer identificacion, String estadoCivil) {
        super(nombres, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return " Estudiante { " + super.toString() + " Curso = " + curso + " }";
    }

}

package guia5ejerciciosextra04.Entidades;

public class Profesor extends Persona {

    /*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
     */
    private Integer anioIngreso;
    private Integer despacho;
    private String departamento;

    public Profesor() {
        super();
    }

    public Profesor(Integer anioIngreso, Integer despacho, String departamento, String nombres, String apellidos, Integer identificacion, String estadoCivil) {
        super(nombres, apellidos, identificacion, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.despacho = despacho;
        this.departamento = departamento;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return " Profesor { " + super.toString() + " Año de Ingreso = " + anioIngreso + ", Despacho = " + despacho + ", Departamento = " + departamento + " }";
    }

}

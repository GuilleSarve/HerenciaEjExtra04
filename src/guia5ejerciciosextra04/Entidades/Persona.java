package guia5ejerciciosextra04.Entidades;

public class Persona {

    /*
se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
     */
    protected String nombres;
    protected String apellidos;
    protected Integer identificacion;//dni
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, Integer identificacion, String estadoCivil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return " Nombres = " + nombres + ", Apellidos = " + apellidos + ", Identificación = " + identificacion + ", Estado Civil = " + estadoCivil + " } ";
    }

}

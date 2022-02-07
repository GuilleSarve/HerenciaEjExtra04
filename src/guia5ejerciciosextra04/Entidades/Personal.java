package guia5ejerciciosextra04.Entidades;

public class Personal extends Persona {

    /*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
    Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
     */
    private Integer anioIngreso;
    private Integer despacho;
    private String sector;

    public Personal() {
        super();
    }

    public Personal(Integer anioIngreso, Integer despacho, String sector, String nombres, String apellidos, Integer identificacion, String estadoCivil) {
        super(nombres, apellidos, identificacion, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.despacho = despacho;
        this.sector = sector;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return " Personal { " + super.toString() + " Año de Ingreso = " + anioIngreso + ", Despacho = " + despacho + ", Sector = " + sector + " }";
    }

}

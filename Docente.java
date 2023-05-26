public class Docente {
    private int idDocente;
    private String nombres ;
    private String apellidos;
    private String carrera;





    public Docente(int idDocente, String nombres, String apellidos, String carrera) {
        this.idDocente = idDocente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;

    }


    public int getIdDocente() {return idDocente;}

    public void setIdDocente(int idDocente) {this.idDocente = idDocente;}

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getCarrera() {return carrera;}

    public void setCarrera(String carrera) {this.carrera = carrera;}


}

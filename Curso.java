public class Curso {
    private int idCurso;
    private String nombre;
    private String credito;


    public Curso(int idCurso, String nombre, String credito) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.credito = credito;


    }


    public int getIdCurso() {return idCurso;}

    public void setIdCurso(int idCurso) {this.idCurso = idCurso;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCredito() {return credito;}

    public void setCredito(String credito) {this.credito = credito;}



}

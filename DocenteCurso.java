public class DocenteCurso {

    private Curso curso[];
    private Docente docente[];
    private int cantidadCursos;
    private int cantidadDocentes;


    public DocenteCurso() {
        this.curso = new Curso[100];
        this.docente = new Docente[100];
        this.cantidadCursos = 0;
        this.cantidadDocentes = 0;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }

    public int getCantidadDocentes() {
        return cantidadDocentes;
    }

    public void setCantidadDocentes(int cantidadDocentes) {
        this.cantidadDocentes = cantidadDocentes;
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso[] curso) {
        this.curso = curso;
    }

    public Docente[] getDocente() {
        return docente;
    }

    public void setDocente(Docente[] docente) {
        this.docente = docente;
    }

    public void agregarCurso(Curso curso) {
        this.curso[cantidadCursos] = curso;
        cantidadCursos++;
    }

    public void agregarDocente(Docente docente) {
        this.docente[cantidadDocentes] = docente;
        cantidadDocentes++;

    }

    public void listarCursos() {
        System.out.println("Cursos");
        {
            for (int i = 0; i < cantidadCursos; i++) {
                System.out.println("ID CURSO: " + curso[i].getIdCurso() + " Nombre: " + curso[i].getNombre() + " CREDITO: " + curso[i].getCredito());
            }
        }
    }

    public void listarDocentes() {
        System.out.println("Docentes");
        {
            for (int i = 0; i < cantidadDocentes; i++) {
                System.out.println("ID DOCENTE: " + docente[i].getIdDocente() + "Nombres: " + docente[i].getNombres() + " Apellidos: " + docente[i].getApellidos() + "Carrera: " + docente[i].getCarrera());
            }
        }
    }

    public Curso buscarCurso(int cursoEleg) {
        for (int i = 0; i < cantidadCursos; i++) {
            if (curso[i].getIdCurso() == cursoEleg) {
                System.out.println("Curso encontrado");

                System.out.println("ID CURSO: " + curso[i].getIdCurso() + " Nombre: " + curso[i].getNombre() + " CREDITO: " + curso[i].getCredito());
                return curso[i];
            }
        }
        return null;
    }

    public Docente buscarDocente(int iddocen) {
        for (int i = 0; i < cantidadDocentes; i++) {
            if (docente[i].getIdDocente() == iddocen) {
                System.out.println("Docente encontrado");

                System.out.println("ID DOCENTE: " + docente[i].getIdDocente() + "Nombres: " + docente[i].getNombres() + " Apellidos: " + docente[i].getApellidos() + "Carrera: " + docente[i].getCarrera());
                return docente[i];
            }
        }
        return null;
    }

    public void editarCurso(Curso cursos) {
        for (int i = 0; i < cantidadCursos; i++) {
            if (curso[i].getIdCurso() == cursos.getIdCurso()) {
                curso[i] = cursos;
                break;
            }
        }

    }
    public void editarDocente(Docente docentes) {
        for (int i = 0; i < cantidadDocentes; i++) {
            if (docente[i].getIdDocente() == docentes.getIdDocente()) {
                docente[i] = docentes;
                break;
            }
        }

    }
    public void eliminarCurso (int idel)
    {
        for (int i = 0; i < cantidadCursos; i++) {
            if (curso[i].getIdCurso() == idel) {
                for (int j = i; j < cantidadCursos - 1; j++)
                {
                    curso[j] = curso [j+1];
                }
                curso[cantidadCursos -1 ]= null;
                cantidadCursos --;

                break;
            }
        }
    }
    public void eliminarDocente (int idel)
    {
        for (int i = 0; i < cantidadDocentes; i++) {
            if (docente[i].getIdDocente() == idel) {
                for (int j = i; j < cantidadDocentes - 1; j++)
                {
                    docente[j] = docente[j+1];
                }
                docente[cantidadDocentes -1 ]= null;
                cantidadDocentes --;

                break;
            }
        }
    }
}


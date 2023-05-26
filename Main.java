public class Main {
    public static void main(String[] args) {

      //Cursos
      Curso curso1 = new Curso(2323,"POO","4");

      Curso curso2 = new Curso(2020,"Estructura de datos","3");
      Curso curso3 = new Curso( 2222,"Base de datos","4");

      //Docentes
      Docente docente1 = new Docente(0101,"Freddy","Vigilio Arratea","Ing. Sistemas e Informatica");

      Docente docente2 = new Docente(1212,"Ethel","Manzano Lozano","Ing, Sistemas e Informatica");

      Docente docente3 = new Docente(0202,"Jose","Nuñez Vicente","Ing. Sistemas e Informatica");

      DocenteCurso cursodocente1 = new DocenteCurso();
      cursodocente1.agregarCurso(curso1);
      cursodocente1.agregarCurso(curso2);
      cursodocente1.agregarCurso(curso3);
      cursodocente1.agregarDocente(docente1);
      cursodocente1.agregarDocente(docente2);


        DocenteCurso cursodocente2 = new DocenteCurso();

        cursodocente2.agregarCurso(curso2);
        cursodocente2.agregarCurso(curso3);
        cursodocente2.agregarDocente(docente1);




        //listar Curso
      cursodocente1.listarCursos();
        cursodocente2.listarCursos();

      //liustar docente
      cursodocente1.listarDocentes();
        cursodocente2.listarDocentes();

      //buscar curso
      cursodocente1.buscarCurso(2323);
        cursodocente2.buscarCurso(2323);
      //buscarDocente
     cursodocente1.buscarDocente(0101);
        cursodocente2.buscarDocente(0101);

     //editar curso
        Curso cursonuevo = new Curso ( 1214,"matematica","4");
        cursodocente1.editarCurso(cursonuevo);
        cursodocente1.listarCursos();
        Curso cursonuevo2 = new Curso ( 1216,"matematica","4");
        cursodocente2.editarCurso(cursonuevo2);
        cursodocente2.listarCursos();
     // editar docente
      cursodocente1.editarDocente(docente2);
      // eliminar curso
      cursodocente1.eliminarCurso(2323);

      //eliminar docente

      cursodocente1.eliminarDocente(1212);
      cursodocente1.listarCursos();





    }
}
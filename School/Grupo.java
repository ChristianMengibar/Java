package Instituto;

public class Grupo {
    private String nombre;
    private Alumno[] alumnos;

    public Grupo(String nombre, Alumno[] alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public Grupo(int nombre, int alumnos) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public void listaGrupo() {
        System.out.println("El nombre del grupo es " + this.getNombre() + " y tiene " + this.getAlumnos() + " alumnos.");
    }
}
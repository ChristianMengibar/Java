package Instituto;

public class Instituto {
    private String nombre;
    private Grupo[] grupos;

    public Instituto(String nombre, Grupo[] grupos) {
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public Instituto(int nombre, int grupos) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }

    public void listaInstituto() {
        System.out.println("El nombre del Instituto es " + this.getNombre() + " y pertenece al grupo " + this.getGrupos() + ".");
    }
}
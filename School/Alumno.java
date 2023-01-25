package Instituto;

public class Alumno {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int codigoPostal;
    
    public Alumno(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Alumno(String nombre, String apellido1, String apellido2, int codigoPostal) {
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Alumno(String nombre, String apellidos, int codigoPostal) {
        this.nombre = nombre;
        this.apellido1 = apellidos;
        this.codigoPostal = codigoPostal;
    }

    public Alumno(int nombre, int apellidos, int codigoPostal) {
    }

    public Alumno(String nombre, String apellidos, String codigoPostal) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido1;
    }

    public void setApellidos(String apellidos) {
        this.apellido1 = apellidos;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void listaAlumnos() {
        System.out.println("El nombre del alumno es " + this.getNombre() + " y sus apellidos son " + this.getApellidos() + " y su codigo postal es " + this.getCodigoPostal() + ".");
    }
}
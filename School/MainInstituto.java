package Instituto;

import java.util.Scanner;

public class MainInstituto {
    static Scanner scan = new Scanner(System.in);

    static Alumno pideAlumnos() {
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = scan.next();
        System.out.println("Introduce el primer apellido del alumno:");
        String apellido1 = scan.next();
        System.out.println("Introduce el segundo apellido del alumno: ");
        String apellido2 = scan.next();
        System.out.println("Introduce el Codigo Postal: ");
        int codigoPostal = scan.nextInt();
        Alumno alumno = new Alumno(nombre, apellido1, apellido2, codigoPostal);
        return alumno;
    }

    static Grupo pideGrupo() {
        System.out.println("Introduce el nombre del grupo: ");
        String nombre = scan.next();
        System.out.println("Introduce los alumnos que tiene el grupo: ");
        int cantAlumnos = scan.nextInt();
        while (cantAlumnos < 1) {
            System.out.println("El grupo tiene que tener como minimo 1 alumno.");
            cantAlumnos = scan.nextInt();
        }
        Alumno[] alumnos = new Alumno[cantAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = pideAlumnos();
        }
        Grupo grupo = new Grupo(nombre, alumnos);
        return grupo;
    }

    static Instituto pideInstituto() {
        System.out.println("Introduce el nombre del Instituto: ");
        String nombre = scan.next();
        System.out.println("Introduce los grupos: ");
        int cantGrupos = scan.nextInt();
        while (cantGrupos < 1) {
            System.out.println("El grupo tiene que tener como minimo 1 alumno.");
            cantGrupos = scan.nextInt();
        }
        Grupo[] grupos = new Grupo[cantGrupos];
        for (int i = 0; i < grupos.length; i++) {
            grupos[i] = pideGrupo();
        }
        Instituto instituto = new Instituto(nombre, grupos);
        return instituto;
    }

    public static void main(String[] args) {
        Instituto instituto = pideInstituto();
    }
}

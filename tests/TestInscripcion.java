package tests;

import java.util.Arrays;
import src.*;

public class TestInscripcion {
    public static void main(String[] args) {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.agregarCorrelativa(algoritmos);
        Materia diseno = new Materia("Diseño de Sistemas");
        diseno.agregarCorrelativa(paradigmas);

        Alumno fausto = new Alumno();
        fausto.aprobarMaterias(algoritmos, paradigmas);

        Inscripcion inscripcionCorrecta = new Inscripcion(fausto, Arrays.asList(diseno));
        System.out.println("¿Inscripción validada? " + inscripcionCorrecta.aprobada());

        Alumno otro = new Alumno();
        otro.aprobarMaterias(algoritmos);
    }
}

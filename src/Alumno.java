package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {
    private List<Materia> aprobadas = new ArrayList<>();

    public void aprobarMaterias(Materia... materias) {
        aprobadas.addAll(Arrays.asList(materias));
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }
}

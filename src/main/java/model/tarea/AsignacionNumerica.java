package model.tarea;

import java.util.LinkedList;

public class AsignacionNumerica extends Asignacion {
    public void setNotas() {
        this.notas = new LinkedList<Integer>();
    }

    public boolean aprobo() {
        return !notas.isEmpty() && Integer.getInteger(notas.get(notas.size()-1).toString())>5;
    }
}

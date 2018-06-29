package model.tarea;

import java.util.List;

public abstract class Asignacion<T>{
    public abstract void setNotas();
    private String tarea;


    protected List<T>notas;
    public abstract boolean aprobo();


    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
}

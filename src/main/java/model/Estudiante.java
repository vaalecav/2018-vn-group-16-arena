package model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String legajo;
    private String usuarioGithub;

    public Estudiante(String nombre, String apellido, String legajo, String usuarioGithub) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.usuarioGithub = usuarioGithub;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getUsuarioGithub() {
        return usuarioGithub;
    }

}

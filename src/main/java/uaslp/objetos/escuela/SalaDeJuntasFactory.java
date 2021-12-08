package uaslp.objetos.escuela;

public abstract class SalaDeJuntasFactory {
    private String nombre;

    public static SalaDeJuntas get(String nombre) {
        return new SalaDeJuntas(nombre);
    }

    public String getNombre() {
        return nombre;
    }
}

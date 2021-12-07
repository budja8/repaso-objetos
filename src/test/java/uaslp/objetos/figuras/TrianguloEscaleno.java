package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo implements DrawableItem{
    private String description = "Lados diferentes";
    private String name = "Triangulo Escaleno";

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

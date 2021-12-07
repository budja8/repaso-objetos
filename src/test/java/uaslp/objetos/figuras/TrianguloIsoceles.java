package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo implements DrawableItem {
    private String description = "2 Lados iguales y 1 diferente";
    private String name = "Triangulo Isoceles";

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

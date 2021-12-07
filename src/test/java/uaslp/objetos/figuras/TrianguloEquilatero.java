package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo implements DrawableItem{
    private String description = "Lados iguales";
    private String name = "Triangulo Equilatero";

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}

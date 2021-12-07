package uaslp.objetos.figuras;

public class Cuadrado extends Figura implements DrawableItem{
    private double lado;
    private String name = "Cuadrado";

    public Cuadrado() {

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    @Override
    public String getName() {
        return name;
    }
}

package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura implements DrawableItem {
    private int numeroDeLados;
    private double lado;
    private String name = "Poligono Regular";

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        double grados = (360 / numeroDeLados) / 2;

        double apotema = (lado / 2) / (Math.tan(Math.toRadians(grados)));
        double perimetro = lado * numeroDeLados;

        return (perimetro * apotema) / 2;
    }

    @Override
    public String getName() {
        return name;
    }
}

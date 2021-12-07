package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private String description = "Cualquier triangulo";
    private String name;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return (base*altura)/2;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}

package uaslp.objetos.figuras;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;
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

    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException {
        if (base == null) {
            throw new BaseNoProvistaException("La base está vacia");
        } else if (altura == null) {
            throw new AlturaNoProvistaException("La altura está vacia");
        }
        return (base * altura) / 2;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}

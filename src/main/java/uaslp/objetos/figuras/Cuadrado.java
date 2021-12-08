package uaslp.objetos.figuras;

public class Cuadrado extends Figura implements DrawableItem{
    private Double lado;
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

    public double getArea() throws LadoNoProvistoException {
        if(lado==null){
            throw new LadoNoProvistoException("El valor de lado está vacio.");
        }
        return lado * lado;
    }

    @Override
    public String getName() {
        return name;
    }
}

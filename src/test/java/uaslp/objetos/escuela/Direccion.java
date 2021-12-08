package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion direccion;

    private Direccion(){

    }

    public static Direccion getDireccion(){
        if(direccion == null){
            direccion = new Direccion();
        }
        return direccion;
    }

    public static Direccion getInstance() {
        return direccion;
    }
}

package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones) {
        double suma = 0;

        for (Double calificacione : calificaciones) {
            suma += calificacione;
        }

        return suma;
    }
}

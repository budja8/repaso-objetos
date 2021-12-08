package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {

    }

    public double evalua(String listaDeCalificaciones) {
        List<String> list;
        list = Arrays.asList(listaDeCalificaciones.split(","));

        List<Double> doubleList = new ArrayList<>();
        double aux = 0;

        for (int i = 0; i < listaDeCalificaciones.length(); i++) {
            aux = Double.parseDouble(list.get(i));
            doubleList.add(aux);
        }

        for (int i = 0; i < doubleList.size(); i++) {
            aux += doubleList.get(i);
        }

        aux = aux / doubleList.size();

        return aux;
    }
}

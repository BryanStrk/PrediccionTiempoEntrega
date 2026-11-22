package com.bryanstrk;

import smile.data.DataFrame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Datos: {distancia_km, tiempo_entrega_min}
        double[][] datos={
                {2,10},
                {4,20},
                {6,30},
                {8,40},
                {10,50},
                {12,60}
        };

        //Crear DataFrame con nombres de columnas
        DataFrame entregas = DataFrame.of(
                datos,
                "distancia",
                "tiempo"
        );
    }
}

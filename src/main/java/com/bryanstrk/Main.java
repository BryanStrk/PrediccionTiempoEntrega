package com.bryanstrk;

import smile.data.DataFrame;
import smile.data.formula.Formula;
import smile.regression.LinearModel;
import smile.regression.OLS;

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
        //Variable objetivo a predecir
        Formula formula = Formula.lhs("tiempo");
        //Entrenar modelo de regresion lineal (OLS)
        LinearModel modelo = OLS.fit(formula,  entregas);
        // Nuevo pedido de 7 km
        double distanciaNueva = 7.0;
        double[] nuevoPedido = {distanciaNueva};
        // Realizar prediccion
        double tiempoEstimado = modelo.predict(nuevoPedido);
        // Mostrar resultado
        System.out.println("===== PREDICCIÓN DE ENTREGA =====");
        System.out.println("Distancia del pedido: " + distanciaNueva + " km");
        System.out.printf("Tiempo estimado de entrega: %.2f minutos%n", tiempoEstimado);
    }
}

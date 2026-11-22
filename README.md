# PrediccionTiempoEntrega

Proyecto en Java y Maven que implementa un modelo de **regresión lineal** mediante mínimos cuadrados ordinarios (**OLS**) con la librería **Smile** para estimar el tiempo de entrega de un pedido (en minutos) en función de la distancia recorrida (en kilómetros).

## Objetivo

Entrenar un modelo de aprendizaje supervisado a partir de registros históricos de entregas y predecir el tiempo estimado de llegada para un nuevo pedido de **7 km**.

## Datos de entrenamiento

| Distancia (km) | Tiempo de entrega (min) |
| :---: | :---: |
| 2 | 10 |
| 4 | 20 |
| 6 | 30 |
| 8 | 40 |
| 10 | 50 |
| 12 | 60 |

* **Predicción objetivo:** para una distancia de `7 km`, el modelo estima `35.00 minutos`.

## Tecnologías utilizadas

* **Java**
* **Maven** (`pom.xml`)
* **Smile** (`smile.data.DataFrame`, `smile.data.formula.Formula`, `smile.regression.LinearModel`, `smile.regression.OLS`)

## Estructura del proyecto

```text
PrediccionTiempoEntrega/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── bryanstrk/
                    └── Main.java
```

## Ejecución

1. Clona el repositorio:
   ```bash
   git clone [https://github.com/BryanStrk/PrediccionTiempoEntrega.git](https://github.com/BryanStrk/PrediccionTiempoEntrega.git)
   cd PrediccionTiempoEntrega
   ```
2. Ejecuta la clase `com.bryanstrk.Main` desde **IntelliJ IDEA** o compila el proyecto con Maven.
3. Revisa en consola el tiempo estimado calculado por el modelo para un pedido de 7 km.

## Posibles mejoras

* Solicitar la distancia dinámicamente por consola (`Scanner`) o desde un archivo externo (CSV).
* Incorporar nuevas variables al modelo (tráfico, franja horaria, tipo de vehículo, zona).
* Calcular métricas de evaluación de regresión (`MAE`, `MSE`, `RMSE`, `R²`) para validar el rendimiento del modelo.

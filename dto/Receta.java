package dto;

import java.util.Arrays;

public class Receta {

    private float tiempoCoccion;
    private Ingrediente[] ingredientes;
    private String preparacion;

    public Receta(float tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public Receta() {
    }

    @Override
    public String toString() {
        return "Receta{" +
                "tiempoCoccion=" + tiempoCoccion +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                ", preparacion='" + preparacion + '\'' +
                '}';
    }

    public float getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(float tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}

package dto;

import java.util.Arrays;

public class Despensa {
    private Ingrediente[] ingredientes;

    public Despensa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;

    }

    public Despensa() {
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Despensa{" +
                "ingredientes=" + Arrays.toString(ingredientes) +
                '}';
    }

    public void addIngrediente(Ingrediente ingrediente) {
        int cantidadIngredientes = this.ingredientes.length;
        Ingrediente[] new_ingredientes = new Ingrediente[cantidadIngredientes + 1];
        for (int i = 0; i < cantidadIngredientes; i++) {
            new_ingredientes[i] = this.ingredientes[i];
        }
        new_ingredientes[cantidadIngredientes] = ingrediente;
        this.ingredientes = new_ingredientes;
    }

    public Ingrediente getIngrediente(String nombre, float cantidadRetirar) {
        for (Ingrediente ingrediente : this.ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                try {
                    ingrediente.sacar(cantidadRetirar);
                    return ingrediente;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }
}

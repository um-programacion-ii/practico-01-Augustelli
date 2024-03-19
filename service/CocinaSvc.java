package service;

import dto.Chef;
import dto.Despensa;
import dto.Ingrediente;
import dto.Receta;

public class CocinaSvc {

    private Chef chef;
    private Despensa despensa;

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public CocinaSvc(Chef chef, Despensa despensa) {
        this.chef = chef;
        this.despensa = despensa;
    }

    public void prepararReceta(Receta receta) {
        if (!ingredientesNecesarios(receta)){
            System.out.println("No hay ingredientes suficientes para preparar la receta: " + receta);
            return;
        }
        System.out.println("Preparando receta: " + receta);
        System.out.println("Despensa: " + despensa);
    }

    private boolean ingredientesNecesarios(Receta receta) {
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            if (despensa.getIngrediente(ingrediente.getNombre(), ingrediente.getCantidad()) == null) {
                return false;
            }
        }
        return true;
    }
}

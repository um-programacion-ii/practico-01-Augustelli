package dto;

public class LecheConCereal extends Receta{

    public LecheConCereal(){
        super(0.0f, new Ingrediente[]{new Ingrediente("Leche", 1.0f), new Ingrediente("Cereal", 1.0f)}, "Poner el cereal en la leche y servir");
    }

    public LecheConCereal(float tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        super(tiempoCoccion, ingredientes, preparacion);
    }
}

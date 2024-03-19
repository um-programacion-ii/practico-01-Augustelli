package dto;

public class PanConQueso extends Receta{

    public PanConQueso(){
        super(5.0f, new Ingrediente[]{new Ingrediente("Pan", 1.0f), new Ingrediente("Queso", 1.0f)}, "Poner el queso en el pan y calentar durante 5 minutos");
    }

    public PanConQueso(float tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        super(tiempoCoccion, ingredientes, preparacion);
    }
}

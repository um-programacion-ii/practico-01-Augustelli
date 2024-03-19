package dto;

public class HuevoDuro extends Receta{

    public HuevoDuro(){
        super(10.0f, new Ingrediente[]{new Ingrediente("Huevo", 1.0f)}, "Poner a hervir el huevo durante 10 minutos");
    }

    public HuevoDuro(float tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        super(tiempoCoccion, ingredientes, preparacion);
    }

}

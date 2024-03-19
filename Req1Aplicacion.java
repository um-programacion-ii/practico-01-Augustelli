import dto.Despensa;
import dto.Ingrediente;

public class Req1Aplicacion {
    public static void main(String[] args) {

        Ingrediente huevo = new Ingrediente();
        huevo.setCantidad(1.0f);
        huevo.setNombre("Huevo");
        System.out.println("Cantidad "+ huevo.getCantidad() + "\n Ingrediente: " + huevo.getNombre());
        System.out.println(huevo);

        Ingrediente[] ingredientes = new Ingrediente[1];
        ingredientes[0] = huevo;
        Despensa despensa = new Despensa(ingredientes);
        despensa.addIngrediente(new Ingrediente("Leche", 1.0f));
        System.out.println(despensa);
        despensa.getIngrediente("Huevo", 1.0f);
        System.out.println(despensa);
        despensa.getIngrediente("Huevo", 1.0f);

        
    }

}

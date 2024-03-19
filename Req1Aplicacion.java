import dto.*;
import service.CocinaSvc;

public class Req1Aplicacion {
    public static void main(String[] args) {
//      Requerimiento 1
        Ingrediente huevo = new Ingrediente();
        huevo.setCantidad(1.0f);
        huevo.setNombre("Huevo");
        System.out.println("Cantidad "+ huevo.getCantidad() + "\n Ingrediente: " + huevo.getNombre());
        System.out.println(huevo);

//      Requerimiento 2
        Ingrediente[] ingredientes = new Ingrediente[1];
        ingredientes[0] = huevo;
        Despensa despensa = new Despensa(ingredientes);
        despensa.addIngrediente(new Ingrediente("Leche", 1.0f));
//        System.out.println(despensa);
//        despensa.getIngrediente("Huevo", 1.0f);
//        System.out.println(despensa);
//        despensa.getIngrediente("Huevo", 1.0f);


//        Requerimiento 3

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println(huevoDuro);
        HuevoDuro huevoDuro2 = new HuevoDuro(10.0f, new Ingrediente[]{new Ingrediente("Huevo", 1.0f)}, "Poner a hervir el huevo durante 10 minutos");
        System.out.println(huevoDuro2);
        LecheConCereal lecheConCereal = new LecheConCereal();
        System.out.println(lecheConCereal);
        LecheConCereal lecheConCereal2 = new LecheConCereal(0.0f, new Ingrediente[]{new Ingrediente("Leche", 1.0f), new Ingrediente("Cereal", 1.0f)}, "Poner el cereal en la leche y servir");
        System.out.println(lecheConCereal2);
        PanConQueso panConQueso = new PanConQueso();
        System.out.println(panConQueso);


        // Requerimiento 4
        CocinaSvc cocinaSvc = new CocinaSvc(new Chef("Gordon Ramsay", 3), despensa);
        cocinaSvc.prepararReceta(huevoDuro);
        cocinaSvc.prepararReceta(lecheConCereal);






        
    }

}

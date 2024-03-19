import dto.Ingrediente;

public class Req1Aplicacion {
    public static void main(String[] args) {

        Ingrediente huevo = new Ingrediente();
        huevo.setCantidad(1.0f);
        huevo.setNombre("Huevo");
        System.out.println("Cantidad "+ huevo.getCantidad() + "\n Ingrediente: " + huevo.getNombre());
        System.out.println(huevo);
    }

}

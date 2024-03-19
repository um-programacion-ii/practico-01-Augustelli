package dto;

public class Ingrediente {

    private String nombre;
    private float cantidad;

    public Ingrediente(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Ingrediente() {
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void sacar(float cantidadQuitar) throws Exception {
        if (cantidad < cantidadQuitar || cantidad==0){
            throw new Exception("No se puede quitar la cantidad solicitada debido a que es mayor a la disponible.");
        }
        this.setCantidad(this.getCantidad()-cantidad);
    }

    public void sacar(int cantidadQuitar) throws Exception {
        if (cantidad < cantidadQuitar || cantidad==0){
            throw new Exception("No se puede quitar la cantidad solicitada debido a que es mayor a la disponible.");
        }
        this.setCantidad(this.getCantidad() - cantidadQuitar);
    }
}

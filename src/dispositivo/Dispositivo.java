package dispositivo;

public class Dispositivo {

    private String nombre;
    private Double precio;
    private int id;

    public Dispositivo() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void Registrar(int id, String nombre, Double precio){
        this.setId(id);
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public void Mostrar(){
        System.out.println("El id del dispisitivo es: " + this.getId());
        System.out.println("El nombre del dispisitivo es: " + this.getNombre());
        System.out.println("El precio del dispisitivo es: " + this.getPrecio());

    }

    public void Editar(int id){
        this.setId(id);
    }

    public void Editar(String nombre){
        this.setNombre(nombre);
    }

    public void Editar(Double precio){
        this.setPrecio(precio);
    }
}
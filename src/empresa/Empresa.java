package empresa;

public class Empresa {
    private String nombre;
    private String direccion;
    private int empleados;
    private double ingresos;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, int empleados, double ingresos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public void Registrar(String nombre, String direccion, int empleados, double ingresos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.ingresos = ingresos;
    }

    public void Mostrar() {
        System.out.println("Nombre de empresa: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de empleados: " + empleados);
        System.out.println("Ingresos: $" + ingresos);
    }
}
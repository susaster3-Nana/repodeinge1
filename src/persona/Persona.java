package persona;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private boolean activo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double altura, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
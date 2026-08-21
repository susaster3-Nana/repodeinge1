package empleado;

import empresa.Empresa;
import persona.Persona;

public class Empleado extends Persona {
    private int idEmpleado;
    private String puesto;
    private double sueldo;
    private int antiguedad;

    private Empresa empresa1;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double altura, boolean activo,
                    int idEmpleado, String puesto, double sueldo, int antiguedad) {

        super(nombre, edad, altura, activo);

        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    // ASOCIACION
    public Empresa getEmpresa() {
        return empresa1;
    }

    public void setEmpresa(Empresa empresa1) {
        this.empresa1 = empresa1;
    }

    public void Registrar(String nombre, int edad, double altura, boolean activo,
                          int idEmpleado, String puesto, double sueldo, int antiguedad) {

        this.setNombre(nombre);
        this.setEdad(edad);
        this.setAltura(altura);
        this.setActivo(activo);

        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public void Mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Altura: " + getAltura());
        System.out.println("Activo: " + isActivo());

        System.out.println("ID empleado: " + idEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Antiguedad: " + antiguedad);

        if (empresa1 != null) {
            System.out.println("Empresa asociada: " + empresa1.getNombre());
        } else {
            System.out.println("Empresa asociada: Ninguna");
        }
    }
}
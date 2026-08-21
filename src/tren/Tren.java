package tren;

import transporte.Transporte;

public class Tren extends Transporte {
    private double precio;
    private int vagones;
    private String modelo;

    public Tren(double precio, int vagones, String modelo) {
        this.precio = precio;
        this.vagones = vagones;
        this.modelo = modelo;
    }

    public Tren() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Registrar (int num_ruedas1,double peso1, String color1, int num_vagones1, String modelo1, double precio1 ) {
        this.setNum_ruedas(num_ruedas1);
        this.setPeso(peso1);
        this.setColor(color1);
        this.setVagones(num_vagones1);
        this.setModelo(modelo1);
        this.setPrecio(precio1);
    }

    public void Mostrar(){
        System.out.println("El numero de ruedas de este tren es: " + this.getNum_ruedas());
        System.out.println("El peso de este tren es: " + this.getPeso());
        System.out.println("El color de este tren es: " + this.getColor());
        System.out.println("El numero de vagones de este tren es: " + this.getVagones());
        System.out.println("El modelo de este tren es: " + this.getModelo());
        System.out.println("El precio de este tren es: " + this.getPrecio());
    }

}

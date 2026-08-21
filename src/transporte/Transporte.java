package transporte;

public class Transporte {
    private double peso;
    private int num_ruedas;
    private String color;

    public Transporte(double peso, int num_ruedas, String color) {
        this.peso = peso;
        this.num_ruedas = num_ruedas;
        this.color = color;
    }

    public Transporte() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
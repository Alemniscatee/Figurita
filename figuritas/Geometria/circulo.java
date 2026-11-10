package Geometria;

public class circulo extends figura{
    private double radio;

    public circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void info() {
        System.out.println("\n\nCirculo\n");
        System.out.println("Radio: "+ this.radio);
        System.out.println("Diametro: "+ (this.radio/2));
        super.info();
    }

    @Override
    public double calcularArea() {
        return (Math.PI*(this.radio*this.radio));
    }

    @Override
    public double calcularPerimetro() {
        return (2* Math.PI*this.radio);
    }
}

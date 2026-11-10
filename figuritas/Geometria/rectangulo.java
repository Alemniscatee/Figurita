package Geometria;

public class rectangulo extends figura{
    private double base;
    private double altura;

    public rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void info() {
        System.out.println("\n\nRectangulo\n");
        System.out.println("Base: "+ this.base);
        System.out.println("Altura: "+ this.altura);
        super.info();
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return ((this.base+this.altura)*2);
    }
}

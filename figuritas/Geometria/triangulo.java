package Geometria;

public class triangulo extends figura {
    private double base;
    private double altura;
    private double hipotenusa;

    public triangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
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
        System.out.println("\n\nTriangulo \n");
        System.out.println("Base: "+ this.base);
        System.out.println("Altura: "+ this.altura);
        super.info();

    }

    @Override
    public double calcularArea() {
        return ((this.base*this.altura)/2);
    }

    @Override
    public double calcularPerimetro() {
        this.hipotenusa=Math.sqrt(this.altura * this.altura + this.base * this.base);
        return (this.base+this.altura+(hipotenusa));
    }
}

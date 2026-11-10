package Geometria;

public class figura {
    String color;


    public figura(String color) {
        this.color = color;
    }

    public figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }

    public void info(){

        System.out.println("Color : " + this.color);
        System.out.println("Area : "+calcularArea());
        System.out.println("Perimetro : "+calcularPerimetro());
    }
}

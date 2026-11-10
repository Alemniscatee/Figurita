import Geometria.circulo;
import Geometria.figura;
import Geometria.rectangulo;
import Geometria.triangulo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        figura f1 = new figura();
        f1.setColor("Rojo pasion");
        f1.info();
        circulo c1= new circulo("rojo", 3);
        c1.info();
        triangulo t1 = new triangulo("verde", 5, 6);
        t1.info();
        rectangulo r1 =new rectangulo("amarillo", 6, 3);
        r1.info();
        Scanner sc= new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--------Menu----\n");
            System.out.println("1.- Circulo");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Rectangulo");
            System.out.println("\n elija una opcion (0 para salir ) :");
            opcion=sc.nextInt();
            String color;
            double base;
            double altura;
            double radio;
            switch (opcion) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:

                    System.out.println("Ingrese el color del circulo");
                    color= sc.next();
                    c1.setColor(color);
                    System.out.println("Ingrese el radio del circulo");
                    radio= sc.nextDouble();
                    c1.setRadio(radio);
                    c1.info();
                    break;
                case 2:
                    System.out.println("Ingrese el color del Triangulo");
                    color= sc.next();
                    t1.setColor(color);
                    System.out.println("Ingrese la base del triangulo");
                    base= sc.nextDouble();
                    t1.setBase(base);
                    System.out.println("Ingrese la altura del triangulo");
                    altura= sc.nextDouble();
                    t1.setAltura(altura);
                    t1.info();
                    break;
                case 3:
                    System.out.println("Ingrese el color del rectangulo");
                    color= sc.next();
                    r1.setColor(color);
                    System.out.println("Ingrese la base del rectangulo");
                    base= sc.nextDouble();
                    r1.setBase(base);
                    System.out.println("Ingrese la altura del rectangulo");
                    altura= sc.nextDouble();
                    r1.setAltura(altura);
                    r1.info();
                    break;
                default:
                    System.out.println("Opcion invalida");


            }
        }
        while (opcion !=0);
    }
}
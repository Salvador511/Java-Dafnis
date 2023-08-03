import java.util.Scanner;

public class Triangle extends Figura{
    Scanner sc = new Scanner(System.in);

    //Atributos
    float b, h, l1, l2, l3;


    // Metodo que construye el objeto
    public Triangle(){
        System.out.println("Vamos a crear tu triangulo :)\n");
        
        System.out.println("Ingresa el valor de la base\n");
        setB(sc.nextFloat());

        System.out.println("Ingresa el valor de la altura\n");
        setH(sc.nextFloat());

        System.out.println("Ingresa el valor del lado 1\n");
        setL1(sc.nextFloat());

        System.out.println("Ingresa el valor del lado 2\n");
        setL2(sc.nextFloat());

        System.out.println("Ingresa el valor del lado 3\n");
        setL3(sc.nextFloat());

        area();
        perimeter();
    }


    // Metodos setter y getters y abstractos sobreescritos

    public void setB(float b) {
        this.b = b;
    }

    public void setH(float h) {
        this.h = h;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public void setL2(float l2) {
        this.l2 = l2;
    }

    public void setL3(float l3) {
        this.l3 = l3;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    public float getL1() {
        return l1;
    }

    public float getL2() {
        return l2;
    }

    public float getL3() {
        return l3;
    }

    @Override
    public void perimeter() {
        setPerimeter(l1 + l2 + l3);
    }

    @Override
    public void area() {
       setArea(b*h);
    }

    @Override
    public void descrip(){
        System.out.println("Tu triangulo con una base de " + getB() + " y una altura de " + getH() + " tiene un area de " + getArea() + " y un perimetro de " + getPerimeter());
    }
}

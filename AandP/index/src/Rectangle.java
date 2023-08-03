import java.util.Scanner;

public class Rectangle extends Figura{
    Scanner sc = new Scanner(System.in);

    //Atributos
    float b, h;


    // Metodo que construye el objeto
    public Rectangle(){
        System.out.println("Vamos a crear tu rectangulo :)\n");
        
        System.out.println("Ingresa el valor de la base\n");
        setB(sc.nextFloat());

        System.out.println("Ingresa el valor de la altura\n");
        setH(sc.nextFloat());

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

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    @Override
    public void perimeter() {
        setPerimeter((b*2) + (h*2));
    }

    @Override
    public void area() {
       setArea(b*h);
    }

    @Override
    public void descrip(){
        System.out.println("Tu rectangulo con una base de " + getB() + " y una altura de " + getH() + " tiene un area de " + getArea() + " y un perimetro de " + getPerimeter());
    }
}

import java.util.Scanner;

public class Cuadrado extends Figura{

    Scanner sc = new Scanner(System.in);

    //Atributos
    float l, p, a;


    // Metodo que construye el objeto
    public Cuadrado(){
        System.out.println("Vamos a crear tu cuadrado :)\n");
        
        System.out.println("Ingresa el valor del lado\n");

        setL(sc.nextFloat());
        area();
        perimeter();
    }


    // Metodos setter y getters y abstractos sobreescritos

    public void setL(float l) {
        this.l = l;
    }

    public float getL() {
        return l;
    }

    public void perimeter() {
        p = l * 4;

        setPerimeter(l*4);
    }

    public void area() {
       setArea(l*l);
    }

    public void descrip(){
        System.out.println("Tu cuadrado con lados de " + getL() + " tiene un area de " + getArea() + " y un perimetro de " + getPerimeter());

        System.out.println(getArea());
    }

}

import java.util.Scanner;

public class Plane extends Vehiculo{
    Scanner sc = new Scanner(System.in);

    //Metodo que genera el objeto dandole valor al nombre, marca, color y año
    public Plane() {
        System.out.println("Ingresa el nombre de tu avion");
        setNombre(sc.nextLine());

        System.out.println("Ingresa la marca de tu avion");
        setMarca(sc.nextLine());

        System.out.println("Ingresa el color de tu avion");
        setColor(sc.nextLine());

        System.out.println("Ingrsa el year de tu avion");
        setYear(sc.nextInt());
    }

    public void descrip(){
        System.out.println("Tu avion " + getNombre() + " color " + getColor() + " marca " + getYear() + ".");
    }

    public void arranque(){
        System.out.println("*Ruidos de avion*");
    }
}

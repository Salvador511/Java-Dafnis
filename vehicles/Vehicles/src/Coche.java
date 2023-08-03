import java.util.Scanner;

public class Coche extends Vehiculo{

    Scanner sc = new Scanner(System.in);

    //Metodo que genera el objeto dandole valor al nombre, marca, color y año
    public Coche() {
        System.out.println("Ingresa el nombre de tu coche");
        setNombre(sc.nextLine());

        System.out.println("Ingresa la marca de tu coche");
        setMarca(sc.nextLine());

       
        System.out.println("Ingresa el color de tu coche");
        setColor(sc.nextLine());

        System.out.println("Ingrsa el year de tu coche");
        setYear(sc.nextInt());
    }

    public void descrip(){
        System.out.println("Tu coche " + getNombre() + " color " + getColor() + " marca " + getYear() + ".");
    }

    public void arranque(){
        System.out.println("*Ruidos de coche*");
    }
}

import java.util.Scanner;
public class Moto extends Vehiculo{

    Scanner sc = new Scanner(System.in);

    //Metodo que genera el objeto dandole valor al nombre, marca, color y year
    public Moto() {
        System.out.println("Ingresa el nombre de tu moto");
        setNombre(sc.nextLine());

        System.out.println("Ingresa la marca de tu moto");
        setMarca(sc.nextLine());

        System.out.println("Ingresa el color de tu moto");
        setColor(sc.nextLine());

        System.out.println("Ingrsa el year de tu moto");
        setYear(sc.nextInt());
    }

    public void descrip(){
        System.out.println("Tu moto " + getNombre() + " color " + getColor() + " marca " + getYear() + ".");
    }

    public void arranque(){
        System.out.println("*Ruidos de moto*");
    }


    

    
}
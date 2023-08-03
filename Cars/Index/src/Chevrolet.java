import java.util.Scanner;

public class Chevrolet {
    Scanner sc = new Scanner(System.in);

    int type;

    public void setType(int type) {
        this.type = type;
    }

    public void pickUp() {
        System.out.println("Silverado");
        System.out.println("Cheyenne");
        System.out.println("S10");
    }

    public void coupe() {
        System.out.println("Camaro");
        System.out.println("Corvette");
        System.out.println("Sonic");
        
    }

    public void sedan() {
        System.out.println("Cavalier");
        System.out.println("Cruze");
        System.out.println("Malibu");
    }

    public void selector() {

        switch(type){
            case 1:
                pickUp();
            break;

            case 2:
                coupe();
            break;

            case 3:
                sedan();
            break;

            default: System.out.println("Choose a valid answer.");
        }

    }
}

import java.util.Scanner;

public class Ford {

    Scanner sc = new Scanner(System.in);

    int type;

    public void setType(int type) {
        this.type = type;
    }

    public void pickUp() {
        System.out.println("F-150");
        System.out.println("Ranger");
        System.out.println("Shelby");
    }

    public void coupe() {
        System.out.println("Mustang GT");
        System.out.println("Fiesta ST");
        System.out.println("Mustang Mach-E GT");
    }

    public void sedan() {
        System.out.println("Focus ST");
        System.out.println("Fusion");
        System.out.println("Fiesta Ikon");

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
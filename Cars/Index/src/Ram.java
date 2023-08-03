import java.util.Scanner;

public class Ram {
    Scanner sc = new Scanner(System.in);

    int type;

    public void setType(int type) {
        this.type = type;
    }

    public void pickUp() {
        System.out.println("Ram 1500");
        System.out.println("Jeep Gladiator");
        System.out.println("Ram TRX");
    }

    public void coupe() {
        System.out.println("Challanger");
        System.out.println("Viper");
    }

    public void sedan() {
        System.out.println("Chrysler Cirrus");
        System.out.println("Dodge Charger");
        System.out.println("Chrysler 300");
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

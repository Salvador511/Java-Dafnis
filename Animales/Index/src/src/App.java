package src;
import java.io.*;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        int option = 0;
        Scanner sc = new Scanner(System.in);

        Caninos Chihuahua = new Caninos();
        Chihuahua.setName("Chihuahueño");
        Chihuahua.setColor("Brown");

        Caninos Labrador = new Caninos();
        Labrador.setName("Labrador");
        Labrador.setColor("Golden");
        
        Caninos Husky = new Caninos();
        Husky.setName("Husky");
        Husky.setColor("White & Black");
        

        Felinos Russian = new Felinos();
        Russian.setName("Blue Russian Gray");
        Russian.setColor("Gray");

        Felinos Siamese = new Felinos();
        Siamese.setName("Siamese");
        Siamese.setColor("Capuccino");

        Felinos Persian = new Felinos();
        Persian.setName("Persian");
        Persian.setColor("White");

        Pajaros BlueJay = new Pajaros();
        BlueJay.setName("Blue Jay");
        BlueJay.setColor("Blue");

        Pajaros Cardinal = new Pajaros();
        Cardinal.setName("Cardinal");
        Cardinal.setColor("Red");

        Pajaros Zopilote = new Pajaros();
        Zopilote.setName("Zopilote");
        Zopilote.setColor("Black");

        System.out.println("Select the specie that you want to see: (1)Canines, (2)Felines & (3)Birds");
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("You selected Canines.");
                System.out.println(" ");
                System.out.println("What can do you want to see? (1)Chihuahua (2)Labrador (3)Husky");
                option = sc.nextInt();
                System.out.println(" ");

                if(option == 1){
                    System.out.println("Name: " + Chihuahua.getName());
                    System.out.println("Color: " + Chihuahua.getColor());
                }else if(option == 2){
                    System.out.println("Name: " + Labrador.getName());
                    System.out.println("Color: " + Labrador.getColor());
                }else if (option == 3) {
                    System.out.println("Name: " + Husky.getName());
                    System.out.println("Color: " + Husky.getColor());
                } else {
                    System.out.println("Input a valid option");
                }
                break;

            case 2:
                System.out.println("You selected Ferlines.");
                System.out.println(" ");
                System.out.println("What can do you want to see? (1)Russian (2)Siamese (3)Persian");
                option = sc.nextInt();
                System.out.println(" ");

                if(option == 1){
                    System.out.println("Name: " + Russian.getName());
                    System.out.println("Color: " + Russian.getColor());
                }else if(option == 2){
                    System.out.println("Name: " + Siamese.getName());
                    System.out.println("Color: " + Siamese.getColor());
                }else if (option == 3) {
                    System.out.println("Name: " + Persian.getName());
                    System.out.println("Color: " + Persian.getColor());
                } else {
                    System.out.println("Input a valid option");
                }
                break;
            
            case 3:
                System.out.println("You selected Birds.");
                System.out.println("");
                System.out.println("What can do you want to see? (1)Blue Jay (2)Cardinal (3)Zopilote");
                option = sc.nextInt();
                System.out.println(" ");

                if(option == 1){
                    System.out.println("Name: " + BlueJay.getName());
                    System.out.println("Color: " + BlueJay.getColor());
                }else if(option == 2){
                    System.out.println("Name: " + Cardinal.getName());
                    System.out.println("Color: " + Cardinal.getColor());
                }else if (option == 3) {
                    System.out.println("Name: " + Zopilote.getName());
                    System.out.println("Color: " + Zopilote.getColor());
                } else {
                    System.out.println("Input a valid option");
                }
                break;
        
            default:
                break;
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int type;

        System.out.println("Welcome to the car selector");
        System.out.println("Choose the car brand");
        System.out.println("(1)Ford, (2)MOPAR & (3)Chevrolet");

        type = sc.nextInt();

        if (type == 1) {
            Ford f = new Ford();
            System.out.println("Select the type of car that you want to see");
            System.out.println("(1)Pick-up (2)Coupe (3)Sedan");
            type = sc.nextInt();
            f.setType(type);

            f.selector();
            
        } else if (type == 2) {
            Ram r = new Ram();
            System.out.println("Select the type of car that you want to see");
            System.out.println("(1)Pick-up (2)Coupe (3)Sedan");
            type = sc.nextInt();
            r.setType(type);
            
            r.selector();
            
        }else if (type == 3) {
            Chevrolet f = new Chevrolet();
            System.out.println("Select the type of car that you want to see");
            System.out.println("(1)Pick-up (2)Coupe (3)Sedan");
            type = sc.nextInt();
            f.setType(type);
            
            f.selector();
        }

    }
}

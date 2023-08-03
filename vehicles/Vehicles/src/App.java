import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Vehiculo v;
        int ans;
        
        System.out.println("¿Cual tipo de vehiculo quieres usar? (1)Coche (2)Avion (3)Moto");
        ans = sc.nextInt();

        switch (ans) {
        
            case 1:
               
                System.out.println("Vamos a crear el coche");
                v = new Coche();

                while (ans != 0) {

                    System.out.println("¿Que quieres hacer con tu coche/n (1)Leer la descripcion/n (2)Arranca el coche/n (0)Salir");

                    ans = sc.nextInt();
                    switch (ans) {
                        case 0:
                            System.out.println("Gracias");
                            break;
                        case 1:
                            v.descrip();
                            break;

                        case 2:
                            v.arranque();
                            break;
                    
                        default:
                            break;
                    }
                }

                break;
            
            case 2:

                System.out.println("Vamos a crear el avion");
                v = new Plane();

                while (ans != 0) {

                    System.out.println("¿Que quieres hacer con tu avion/n (1)Leer la descripcion/n (2)Arranca el avion/n (0)Salir");

                    ans = sc.nextInt();
                    switch (ans) {
                        case 0:
                            System.out.println("Gracias");
                            break;
                        case 1:
                            v.descrip();
                            break;

                        case 2:
                            v.arranque();
                            break;
                    
                        default:
                            break;
                    }
                }

                break;

            case 3:
                System.out.println("Vamos a crear el Moto");
                v = new Moto();

                while (ans != 0) {

                    System.out.println("¿Que quieres hacer con tu moto/n (1)Leer la descripcion/n (2)Arranca el moto/n (0)Salir");

                    ans = sc.nextInt();
                    switch (ans) {
                        case 0:
                            System.out.println("Gracias");
                            break;
                        case 1:
                            v.descrip();
                            break;

                        case 2:
                            v.arranque();
                            break;
                    
                        default:
                            break;
                    }
                }
                break;
        
            default:
                break;
        }
        
    }
}

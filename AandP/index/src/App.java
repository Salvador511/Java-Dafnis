import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ans;

        Figura f;
        
        System.out.println("B I E N V E N I D O\n Calculadora de Areas y Perimetros\n (Cuadrado, Triangulo y Rectangulo)\n");

        System.out.println("Escoge la figura (1)Cuadrado (2)Triangulo (3)Rectangulo (0)Salir\n");

        ans = sc.nextInt();

        
        switch (ans) {
            case 1:

                f = new Cuadrado();
                
                f.descrip();
                break;
        
            case 2:
                f = new Triangle();
                
                f.descrip();
                break;

            case 3: 
                f = new Rectangle();
                
                f.descrip();
                break;

            case 0:
                System.out.println("Gracias");
                break;

            default:
                break;
        }

    }
}

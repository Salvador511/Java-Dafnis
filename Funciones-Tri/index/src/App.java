import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int ans;
        Calculadora c;

        System.out.println("BIENVENIDO A LA CALCULADORA DE FUNCIONES TRIGONOMETRICAS\n");

        System.out.println("Que tipo de operacion trigonometrica quieres realizar? (1)Sin (2)Cos (3)Tan (0)Salir");
        ans = sc.nextInt();

        if (ans == 1) {
            c = new Seno();

            System.out.println("Ingresa el angulo");
            c.setAngle(sc.nextDouble());
            c.Calcular(c.getAngle());

        } else if (ans == 2) {
            c = new Coseno();

            System.out.println("Ingresa el angulo");
            c.setAngle(sc.nextDouble());
            c.Calcular(c.getAngle());

        } else if (ans == 3){
            c = new Tangente();

            System.out.println("Ingresa el angulo");
            c.setAngle(sc.nextDouble());
            c.Calcular(c.getAngle());
            
        }else{
            System.out.println("Gracias :D");
        }
    }
}

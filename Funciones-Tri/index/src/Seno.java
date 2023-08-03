public class Seno extends Calculadora {

    @Override
    public void Calcular(double angle) {
        setResult(Math.sin(Math.toRadians(angle)));
        System.out.println("Seno de " + angle + " grados: " + getResult());
    }
}

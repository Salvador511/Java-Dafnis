public class Coseno extends Calculadora{

    @Override
    public void Calcular(double angle) {
        setResult(Math.cos(Math.toRadians(angle)));
        System.out.println("Coseno de " + angle + " grados: " + getResult());
    }
}

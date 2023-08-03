public class Tangente extends Calculadora{

    @Override
    public void Calcular(double angle) {
        setResult(Math.tan(Math.toRadians(angle)));
        System.out.println("Tangente de " + angle + " grados: " + getResult());
    }
}

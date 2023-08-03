public abstract class Calculadora {
    // Atributos
    private double angle, result;

    // Metodos
    public void setResult(double result) {
        this.result = result;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double getResult() {
        return result;
    }

    public abstract void Calcular(double angle);

}

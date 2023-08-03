package Herencia;

public class Padre {
    private double q;
    private double w;

    public void setQ(Double q) {
        this.q = q;
    }
    
    public void setW(Double w) {
        this.w = w;
    }

    public void request(String value) {
        System.out.println("Asigna el " + value + " valor.");
    }

    public double suma() {
        return q+w;
    }

    public double resta() {
        return q-w;
    }

    public double multi() {
        return q*w;
    }

    public double divis() {
        return q/w;
    }
}

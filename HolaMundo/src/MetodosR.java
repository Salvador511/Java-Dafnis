/**
 * MetodosR
 */
public class MetodosR {

    public double suma(double x, double y) {
        return x+y;
    }

    public double resta(double x, double y) {
        return x-y;
    }

    public double multi(double x, double y) {
        return x*y;
    }

    public double divis(double x, double y) {
        return x/y;
    }

    public double oper(double x, String opera, double y) {
        switch (opera) {
            case "+":
                return suma(x, y);
            
            case "-":
                return resta(x, y);
                            
            case "*":
                return multi(x, y);
            
            case "/":
                return divis(x, y);
        
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        MetodosR s = new MetodosR();

        System.out.println(s.oper(10, "+", 5));
        
    }
}
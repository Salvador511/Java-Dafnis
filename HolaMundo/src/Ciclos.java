public class Ciclos {
    public void Cosa(int x) {
        if (x == 5) {
            System.out.println("Es cinco");
        }else{
            System.out.println("No es 5");
        }
    }

    public void CicloFor(int repe) {
        for (int i = 0; i < repe; i++) {
            System.out.println("intento " + (i+1));
        }
    }

    public void CicloWhile(int repe) {
        int i = 0;
        while (i < repe) {
            System.out.println("intento " + (i + 1));
            i++;
        }
    }

    public void CicloDoWhile(int repe) {
        int i = 0;
        do {
            System.out.println("intento " + i);
        } while (i < repe);
    }

    public static void main(String[] args) {
        Ciclos c = new Ciclos();
         
        c.CicloDoWhile(0);

    }
}
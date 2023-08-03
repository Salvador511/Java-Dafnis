package Herencia;

import java.util.Scanner;

public class Hija extends Padre{
    public static void main(String[] args) {
        Hija hi = new Hija();

        Scanner sc = new Scanner(System.in);
        
        hi.request("primero");
        hi.setQ(sc.nextDouble());
        hi.request("segundo");
        hi.setW(sc.nextDouble());

        System.out.println(hi.suma());
    }
}

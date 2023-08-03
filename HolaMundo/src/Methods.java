public class Methods {
    public void message(String name) {
        System.out.println("Hello, " + name + ". " + men());
    }

    public String men() {
        return "The life is awsome";
    }
    public static void main(String[] args) {
        Methods m = new Methods();

        m.message("Chava");
    }
}

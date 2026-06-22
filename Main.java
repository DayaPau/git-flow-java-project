public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));

        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}